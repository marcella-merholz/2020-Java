package at.dcv.DigitalCampus;

public class Trainer {

    public String name;

    public Trainer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainer: " + name;
    }
}
