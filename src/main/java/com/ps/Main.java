package com.ps;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        switch (appMenu()){
            case 1:
                break;
            case 2:


        }

    }

    //----------Helper Method---------//

    public static int appMenu(){
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

    public static void askGuestInfos(){
        System.out.print("Enter guest name: ");
        String guestName = scanner.next();

        System.out.print("Enter the room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter the room type: ");
        String roomType = scanner.next();

        System.out.println("Enter the price of the room: ");
        double roomPrice = scanner.nextDouble();

        RoomManagement roomManagement = new RoomManagement(roomNumber, roomType, roomPrice);
    }

}