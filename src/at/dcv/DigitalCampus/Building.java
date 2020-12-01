package at.dcv.DigitalCampus;

public class Building {

    private String name;
    private String adress;

    public Building(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Standort: " + name + " " + adress;
    }
}


