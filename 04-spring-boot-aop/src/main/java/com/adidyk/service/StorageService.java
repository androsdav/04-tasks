package com.adidyk.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class FullNameComposer.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 10.04.2020.
 * @version 1.0.
 */
@Component
public class StorageService {

    /**
     * @param list - list.
     */
    private ArrayList<Integer> list = new ArrayList<>();

    /**
     * add - adds new value.
     * @param value - value.
     */
    public void add(Integer value) {
        this.list.add(value);
    }

    /**
     * remove - remove value by index.
     * @param index - index.
     */
    public void remove(int index) {
        this.list.remove(index);
    }

    /***
     * get - return value by index.
     * @param index - index.
     */
    public void get(int index) {
        this.list.get(index);
    }

    /**
     * getAll - returns list.
     * @return - returns list.
     */
    public ArrayList<Integer> getAll() {
        return this.list;
    }

    /**
     * size - returns size list.
     * @return - returns size list.
     */
    public int size() {
        return this.list.size();
    }

    /**
     * equals - eqauls.
     * @param o - object.
     * @return - return true or false format.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageService that = (StorageService) o;
        return Objects.equals(list, that.list);
    }

    /**
     * hashCode - hash code.
     * @return - returns int.
     */
    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    /**
     * toString - convert to string.
     * @return - return string format.
     */
    @Override
    public String toString() {
        return "StorageService{" +
                "list=" + list +
                '}';
    }
}
