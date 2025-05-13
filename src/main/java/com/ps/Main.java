package com.ps;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void  main(String []args){
        while(true){
            switch (returnUserChoiceAndDisplayMenu()){
                case 2:
                    checkInMethod();
            }
        }

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

    public static void checkInMethod() {
        //Process for guest Checkins
        System.out.println("Please enter the guest name: ");
        String guestName = scanner.next();

        System.out.println("Please enter the room number: ");
        int roomNumber = scanner.nextInt();

        RoomManagement room = HotelRooms.getRooms().get(roomNumber);

        if (room != null) {
            room.checkIn(guestName);
        } else {
            System.out.println("Room number " + roomNumber + " not found.");
        }
    }

}