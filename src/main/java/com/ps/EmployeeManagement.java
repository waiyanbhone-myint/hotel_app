package com.ps;

public class EmployeeManagement extends Person {

    private String role;
    private double salary;

    public EmployeeManagement(String name, String id, String phonenumber, String role, double salary) {
        super(name, id, phonenumber);
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + ", Role: " + role + ", Salary: $" + salary;
    }
}
