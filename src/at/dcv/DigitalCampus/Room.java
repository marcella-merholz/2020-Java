package at.dcv.DigitalCampus;

public class Room {

    private String name;
    private int floor;
    private Building building;

    public Room(String name, int floor, Building building) {
        this.name = name;
        this.floor = floor;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Raum: " + name + " " + floor + ", " + building;
    }
}
