package com.ps;

//create reservation
public class Room {
    private int roomId;
    private double price;
    private boolean isOccupied;
    private boolean doneCleaning;
    private boolean roomAvailable;

    public Room(int roomId, double price, boolean isOccupied, boolean doneCleaning, boolean roomAvailable) {
        this.roomId = roomId;
        this.price = price;
        this.isOccupied = isOccupied;
        this.doneCleaning = doneCleaning;
        this.roomAvailable = roomAvailable;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDoneCleaning() {
        return doneCleaning;
    }

    public void setDoneCleaning(boolean doneCleaning) {
        this.doneCleaning = doneCleaning;
    }

    public boolean isRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(boolean roomAvailable) {
        this.roomAvailable = roomAvailable;
    }
}
