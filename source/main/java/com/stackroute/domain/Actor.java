package com.stackroute.domain;


public class Actor {

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String gender;
    private String name;
    private int age;

    public void actorInfo()
    {
        System.out.println(name.toUpperCase()+" is a " + gender+ " Actor of age " +age+".");
    }

}
