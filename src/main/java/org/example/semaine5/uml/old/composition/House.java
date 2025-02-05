package org.example.semaine5.uml.old.composition;

import java.util.ArrayList;
import java.util.List;

class House {
    private String address;
    private List<Room> rooms;

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
        this.rooms.add(new Room("Bedroom"));
        this.rooms.add(new Room("Kitchen"));
    }

    public void showRooms() {
        System.out.println("House at: " + address);
        for (Room room : rooms) {
            System.out.println(" - " + room.getType());
        }
    }
}
