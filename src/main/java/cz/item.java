package cz;

public class item {
    public String name;
    public String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public item(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
