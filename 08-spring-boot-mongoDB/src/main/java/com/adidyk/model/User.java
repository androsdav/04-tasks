package com.adidyk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Objects;

/**
 * Class User used for creates new object user with params: id, first name, last name.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 06.06.2020.
 * @version 1.0.
 */
@Document(collection = "users")
public class User {

    /**
     * @param id - user id.
     */
    @Id
    private String id;

    /**
     * @param firstName - use first name.
     */
    @Field(name = "first_name")
    private String firstName;

    /**
     * @param secondName - user second name.
     */
    @Field(name = "second_name")
    private String secondName;

    /**
     * User - constructor.
     */
    public User() {
    }

    /**
     * User - constructor.
     * @param id - user id.
     */
    public User(String id) {
        this.id = id;
    }

    /**
     * User - constructor.
     * @param firstName - user first name.
     * @param secondName - user second name.
     */
    @PersistenceConstructor
    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    /**
     * getId - returns user id.
     * @return - returns user id.
     */
    public String getId() {
        return id;
    }

    /**
     * setId - sets user id.
     * @param id - user id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getFirstName - returns user first name.
     * @return - user first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName - sets user first name.
     * @param firstName - user first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getSecondName - returns user second name.
     * @return - returns user second name.
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * setSecondName - sets user second name.
     * @param secondName - user second name.
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * equals - returns boolean result.
     * @param o - object of class Object.
     * @return - returns "true" if id, firstName, lastName, of user is same, and returns "false" - isn`t same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(secondName, user.secondName);
    }

    /**
     * hashCode - returns hash code for user.
     * @return - returns hash code for user.
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    /**
     * toString - returns string format.
     * @return - returns all information for user.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

}