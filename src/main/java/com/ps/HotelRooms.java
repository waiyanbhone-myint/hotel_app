package com.ps;

import java.util.HashMap;

public class HotelRooms {

    static HashMap<Integer, RoomManagement> rooms = new HashMap<>();

    public static void roomsInHotel(){
        rooms.put(101, new RoomManagement(101, "Single", 100.0));
        rooms.put(102, new RoomManagement(102, "Double", 150.0));
        rooms.put(103, new RoomManagement(103, "Suite", 250.0));
        rooms.put(104, new RoomManagement(104, "Single", 95.0));
        rooms.put(105, new RoomManagement(105, "Double", 140.0));
        rooms.put(106, new RoomManagement(106, "Suite", 230.0));
        rooms.put(107, new RoomManagement(107, "Single", 105.0));
        rooms.put(108, new RoomManagement(108, "Double", 160.0));
        rooms.put(109, new RoomManagement(109, "Suite", 270.0));
        rooms.put(110, new RoomManagement(110, "Single", 90.0));
    }
}
