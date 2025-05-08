package com.ps;

public class RoomManagement {

    private int roomNumber;
    private String type;
    private double payRate;
    private boolean isOccupied = false;
    private boolean isClean = true;
    private String guestName = null;

    //---------Constructor----------//

    public RoomManagement(int roomNumber, String type, double payRate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.payRate = payRate;
    }

    //-------- Getter and Setter -------//

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

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    //-------Derived Getter-------//
    public boolean roomIsAvailable() {
        return !isOccupied && isClean;
    }


    public void checkIn(String guestName) {
        if (roomIsAvailable()) {
            System.out.println("Room is available to check In.");
            isOccupied = true;
            isClean = false;
        } else {
            System.out.println("Room is taken by the guest name: " + guestName);
        }

    }

    public void checkOut(){
        if(!isOccupied){
            System.out.println("Room is already vacant.");
        }
        else{
            System.out.println("Check out steps");
        }

    }
}
