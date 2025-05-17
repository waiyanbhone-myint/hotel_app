package com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void  main(String[] args){
        while(true){
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addRoom();
                case 2 -> listRooms();
                case 3 -> checkIn();
                case 4 -> checkOut();
                case 5 -> cleanRoom();
                case 0 -> {
                    System.out.println("Exiting Hotel Management System.");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }

    }


    //----------Helper Method---------//

    public static void printMenu() {
        System.out.println("======Welcome to Hotel Management======");
        System.out.println("1. Add Room");
        System.out.println("2. Check In Guest");
        System.out.println("3. Check Out Guest");
        System.out.println("4. Clean Room");
        System.out.println("5. View Room Status");
        System.out.println("6. View All Rooms");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
    }

    public static void addRoom(){
        System.out.println("Enter room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter room type (Single/Double/Suite): ");
        String roomType = scanner.nextLine();

        System.out.println("Enter room rete: ");
        double rate = scanner.nextDouble();

        RoomActions newRoom = new RoomManagement(roomNumber, roomType, rate);
        HotelRooms.addRoom(roomNumber, newRoom);
    }

    private static void checkOut() {
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        RoomActions room = HotelRooms.getRoom(roomNumber);
        if (room != null) {
            room.checkOut();
        } else {
            System.out.println("Room not found!");
        }
    }


    public static void listRooms(){
        System.out.println("List of all rooms");
        HotelRooms.listRooms();
    }

    public static void checkIn(){
        System.out.println("Enter room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter guest name: ");
        String guestname = scanner.nextLine();

        RoomActions room = HotelRooms.getRoom(roomNumber);
        if(room != null){
            room.checkOut();
        }else{
            System.out.println("Room not found!");
        }
    }

    private static void cleanRoom() {
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        RoomActions room = HotelRooms.getRoom(roomNumber);
        if (room != null) {
            room.cleanRoom();
        } else {
            System.out.println("Room not found!");
        }
    }



}