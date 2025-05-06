package com.ps;

public class Employee {
    private int employeeId;
    private String employeeName;
    private float workingHour;
    private double basePay;
    private int overTimePay;
    //private double totalPay;

    public Employee(int employeeId, String employeeName, int workingHour, double basePay, int overTimePay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.workingHour = workingHour;
        this.basePay = basePay;
        this.overTimePay = overTimePay;
        //this.totalPay = totalPay;
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

    public float getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getOverTimePay() {
        return overTimePay;
    }

    public void setOverTimePay(int overTimePay) {
        this.overTimePay = overTimePay;
    }

    public double getTotalPay() {
        boolean hasOverTime = workingHour > 40;

        if(hasOverTime){
            float overtimeHours = workingHour - 40;
            double overtimePay = overtimeHours * overTimePay;
            double regularPay = 40 * basePay;
            double totalPay = overtimePay + regularPay;
            return totalPay;
        }else{
             double totalPay = 40 * basePay;
             return totalPay;
        }
    }
}