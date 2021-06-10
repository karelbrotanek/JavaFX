package cz;

import java.util.ArrayList;

public class map {
    private ArrayList<room> rooms;

    public ArrayList<room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<room> rooms) {
        this.rooms = rooms;
    }

    public map(ArrayList<room> rooms) {
        this.rooms = rooms;
    }
}
