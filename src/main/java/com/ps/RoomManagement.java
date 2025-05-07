package com.ps;

public class RoomManagement {

    private int roomNumber;
    private String type;
    private double payRate;

    public RoomManagement(int roomNumber, String type, double payRate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.payRate = payRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
