package com.ps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HotelRooms {

    private static Map<Integer, RoomActions> rooms = new LinkedHashMap<>();

    static {
        rooms.put(1, new RoomManagement(1, "Single", 100.0));
        rooms.put(2, new RoomManagement(2, "Double", 150.0));
        rooms.put(3, new RoomManagement(3, "Suite", 250.0));
        rooms.put(4, new RoomManagement(4, "Single", 95.0));
        rooms.put(5, new RoomManagement(5, "Double", 140.0));
        rooms.put(6, new RoomManagement(6, "Suite", 230.0));
        rooms.put(7, new RoomManagement(7, "Single", 105.0));
        rooms.put(8, new RoomManagement(8, "Double", 160.0));
        rooms.put(9, new RoomManagement(9, "Suite", 270.0));
        rooms.put(10, new RoomManagement(10, "Single", 90.0));
    }

    public static void listRooms(){
        System.out.println("Room List: ");
        for(Map.Entry<Integer, RoomActions> entry: rooms.entrySet()){
            int roomNumber = entry.getKey();
            RoomActions room = entry.getValue();
            String roomType = room.getClass().getSimpleName();
            System.out.println("Room Number: " + roomNumber + ", Type: " + roomType);
        }
    }

    public static void addRoom(int roomNumber, RoomActions room){
        if(rooms.containsKey(roomNumber)){
            System.out.println("Room " + roomNumber + " already exists!");
        }else{
            rooms.put(roomNumber, room);
            System.out.println("Room " + roomNumber + " added successfully.");
        }
    }

//    public static void setRooms(HashMap<Integer, RoomManagement> rooms) {
//        HotelRooms.rooms = rooms;
//    }
}
