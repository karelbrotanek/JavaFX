package cz;

import java.util.ArrayList;

public class room {
    private String name;
    private String description;
    private room left_room;
    private room upper_room;
    private  room right_room;
    private room lower_room;
    private boolean locked;
    private ArrayList<item> items;
    public void addItem(item i){
        items.add(i);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public room getLeft_room() {
        return left_room;
    }

    public void setLeft_room(room left_room) {
        this.left_room = left_room;
    }

    public room getUpper_room() {
        return upper_room;
    }

    public void setUpper_room(room upper_room) {
        this.upper_room = upper_room;
    }

    public room getRight_room() {
        return right_room;
    }

    public void setRight_room(room right_room) {
        this.right_room = right_room;
    }

    public room getLower_room() {
        return lower_room;
    }

    public void setLower_room(room lower_room) {
        this.lower_room = lower_room;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public ArrayList<item> getItems() {
        return items;
    }

    public void setItems(ArrayList<item> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        String str = name + "\n";
        str = str + description + "\n";
        if (upper_room != null){
            str = str + "door up open \n";
        }
        return str;
    }

    public room(String name, String description, boolean locked) {
        this.name = name;
        this.description = description;
        this.locked = locked;
        this.upper_room = null;
        this.left_room = null;
        this.lower_room = null;
        this.right_room = null;
        this.items = new ArrayList<item>();
    }
}
