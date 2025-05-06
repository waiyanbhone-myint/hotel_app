package com.ps;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int workingHour;
    private int overTimePay = 20;

    public Employee(int employeeId, String employeeName, int workingHour, int overTimePay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.workingHour = workingHour;
        this.overTimePay = overTimePay;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public double getOverTimePay() {
        if (workingHour > 40);{
            return workingHour * overTimePay;
        }
    }

    public void setOverTimePay(int overTimePay) {
        this.overTimePay = overTimePay;
    }
}
