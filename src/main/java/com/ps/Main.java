package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void  main(String[] args){
        RoomManagement roomManagement = new RoomManagement(101, "Single", 100.0);

        roomManagement.checkIn("John");
        System.out.println("Room " + roomManagement.getRoomNumber() + " occupied: " + roomManagement.isOccupied());

        roomManagement.cleanRoom();

        roomManagement.checkOut();

    }


    //----------Helper Method---------//

    public static int returnUserChoiceAndDisplayMenu() {
        System.out.println("======Welcome to Hotel Management======");
        System.out.println("1. Add Room");
        System.out.println("2. Check In Guest");
        System.out.println("3. Check Out Guest");
        System.out.println("4. Clean Room");
        System.out.println("5. View Room Status");
        System.out.println("6. View All Rooms");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }


}