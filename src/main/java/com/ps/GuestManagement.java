package com.ps;

public class GuestManagement extends Person {
    private int roomNumber;

    public GuestManagement(String name, String id, String phone, int roomNumber){
        super(name, id, phone);
        this.roomNumber = roomNumber;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + ", Room: " + roomNumber;
    }

}
