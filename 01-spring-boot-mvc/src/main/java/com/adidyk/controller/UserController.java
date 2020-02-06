package com.adidyk.controller;

import com.adidyk.model.User;
import com.adidyk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Class UserController.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 03.02.2020.
 * @version 1.0.
 */
@Controller
public class UserController {

    /**
     * @param service - service.
     */
    private UserService service;

    /**
     * UserController - constructor.
     * @param service - service.
     */
    UserController(UserService service) {
        this.service = service;
    }


    /**
     * showSaveUserForm - show save user form.
     * @return - returns save-user.
     */
    @RequestMapping(value = "/saveUser1", method = RequestMethod.GET)
    public String showSaveUserForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    /**
     * addUser - adds user.
     * @param user - user.
     * @param result - result.
     * @return - returns page.
     */
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        String url = "index";
        if (result.hasErrors()) {
            url = "save-user";
        }
        this.service.save(user);
        //model.addAttribute("user", user);
        model.addAttribute("users", this.service.findAll());
        return url;
    }

    /**
     * findAllUser - finds all users.
     * @return - returns all users.
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String findAllUser(Model model) {
        model.addAttribute("users", this.service.findAll());
        model.addAttribute("user", new User());
        return "index";
    }

    /**
     * index - index.
     * @return - returns index.
     */
    @RequestMapping(value = "/back-to-index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}