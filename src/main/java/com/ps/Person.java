package com.ps;

public class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    //---------Helping Method-------//
    public String getDetails(){
        return "Name: "+ name + ", ID: " + id;
    }
}
