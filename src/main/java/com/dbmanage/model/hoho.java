package com.dbmanage.model;

/**
 * Created by apple on 2017/8/21.
 */
public class hoho {
    private int id;
    private String test;
    private int number;

    public void setId(int id) {
        this.id = id;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getTest() {
        return test;
    }

    public int getNumber() {
        return number;
    }



}
