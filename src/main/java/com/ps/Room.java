package com.ps;

//create reservation
public class Room {
    private int roomId;
    private double price;
    private boolean isOccupied;
    private boolean doneCleaning;
    //private boolean roomAvailable;

    public Room(int roomId, double price) {
        this.roomId = roomId;
        this.price = price;
        this.isOccupied = false;
        this.doneCleaning = true;
        //this.roomAvailable = roomAvailable;
    }

    public void checkIn(){
        if(!isOccupied && doneCleaning){
            isOccupied = true;
            doneCleaning = false;
            System.out.println("Room " + roomId + " is available to check in.");
        } else if (!doneCleaning) {
            System.out.println("Room " + roomId + " is not clean yet.");
        } else {
            System.out.println("Room " + roomId + " is not available.");
        }
    }

    public void checkOut(){
        if(isOccupied){
            isOccupied = false;
            doneCleaning = false;
            System.out.println("Room " + roomId + " checked out and need to clean");
        }else{
            System.out.println("Room " + roomId + " is occupied");
        }
    }

    public boolean isAvailable(){
        return !isOccupied && doneCleaning;
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
}
