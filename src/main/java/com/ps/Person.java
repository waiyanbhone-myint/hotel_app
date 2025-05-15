package com.ps;

public class Person {
    private String name;
    private String id;
    private String phoneNumber;

    public Person(String name, String id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    //---------Helping Method-------//
    public String getDetails(){
        return "Name: "+ name + ", ID: " + id + ", PhoneNumber: " + phoneNumber;
    }
}
