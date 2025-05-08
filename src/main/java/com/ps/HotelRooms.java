package com.ps;

import java.util.HashMap;

public class HotelRooms {

    private static HashMap<Integer, RoomManagement> rooms = new HashMap<>();

    static {
        rooms.put(101, new RoomManagement(1, "Single", 100.0));
        rooms.put(102, new RoomManagement(2, "Double", 150.0));
        rooms.put(103, new RoomManagement(3, "Suite", 250.0));
        rooms.put(104, new RoomManagement(4, "Single", 95.0));
        rooms.put(105, new RoomManagement(5, "Double", 140.0));
        rooms.put(106, new RoomManagement(6, "Suite", 230.0));
        rooms.put(107, new RoomManagement(7, "Single", 105.0));
        rooms.put(108, new RoomManagement(8, "Double", 160.0));
        rooms.put(109, new RoomManagement(9, "Suite", 270.0));
        rooms.put(110, new RoomManagement(10, "Single", 90.0));
    }


}
