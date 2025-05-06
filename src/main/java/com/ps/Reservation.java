package com.ps;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean isWeekend;
    private int totalReservation;

    public Reservation(String roomType, double price, int numOfNights, boolean isWeekend, int totalReservation) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
        this.totalReservation = totalReservation;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getTotalReservation() {
        return totalReservation;
    }

    public void setTotalReservation(int totalReservation) {
        this.totalReservation = totalReservation;
    }
}
