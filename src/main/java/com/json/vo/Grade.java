package com.json.vo;

import java.util.ArrayList;

public class Grade {
    private int id;
    private String name;
    private ArrayList<Student> stus;

    public Grade(int id, String name, ArrayList<Student> stus) {
        super();
        this.id = id;
        this.name = name;
        this.stus = stus;
    }

    public Grade() {
        super();
    }

    @Override
    public String toString() {
        return "Grade [id=" + id + ", name=" + name + ", stus=" + stus + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStus() {
        return stus;
    }

    public void setStus(ArrayList<Student> stus) {
        this.stus = stus;
    }
}
