package com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void  main(String[] args){
        List<Person> people = new ArrayList<>();

        GuestManagement guest1 = new GuestManagement("John", "G101", "12345-34", 101);
        EmployeeManagement employee1 = new EmployeeManagement("Alice", "E201", " 1234-847", "Manager", 5000.0);

        people.add(guest1);
        people.add(employee1);

        for (Person person: people){
            System.out.println(person.getDetails());
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


}