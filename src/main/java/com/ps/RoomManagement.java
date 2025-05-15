package com.ps;

public class RoomManagement {

    private int roomNumber;
    private String type;
    private double payRate;
    private boolean isOccupied;
    private boolean isClean;
    private String guestName;

    //---------Constructor----------//

    public RoomManagement(int roomNumber, String type, double payRate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.payRate = payRate;
        this.isOccupied = false;
        this.isClean = true;
        this.guestName = null;
    }

    //-------- Getter and Setter -------//

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getPayRate() {
        return payRate;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isClean() {
        return isClean;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    //-------Helper Methods-------//
    public void cleanRoom() {
        this.isClean = true;
        System.out.println("Room " + roomNumber + " is now clean. ");
    }

    public boolean roomIsAvailable() {
        return !isOccupied && isClean;
    }

    public boolean checkIn(String guestName) {
        if (!isOccupied && isClean) {
            this.guestName = guestName;
            this.isOccupied = true;
            this.isClean = false;
            System.out.println("Guest " + guestName + " checked into room " + roomNumber);
            return true;
        } else {
            System.out.println("Cannot check in. Room is either occupied or not clean.");
            return false;
        }
    }

    public boolean checkOut() {
        if(isOccupied){
            this.guestName = null;
            this.isOccupied = false;
            this.isClean = false;
            System.out.println("Room "+ roomNumber + " is now vacant.");
            return true;
        }else{
            System.out.println("Room " + roomNumber + " is already vacant.");
            return false;
        }

    }

}
