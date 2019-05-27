package com.kinglong.helloservice.controller;

public class User {
    private String name;
    private Integer age;

    public User() {

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name " + name + ", age " + age;
    }
}