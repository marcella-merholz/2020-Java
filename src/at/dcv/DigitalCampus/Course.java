package at.dcv.DigitalCampus;

import java.util.Arrays;

public class Course {

    private String name;
    private String type;
    private int groupSize;
    private Room room;
    private Student[] students;
    private Trainer trainer;

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Course(String name, String type, int groupSize) {
        this.name = name;
        this.type = type;
        this.groupSize = groupSize;
    }

    @Override
    public String toString() {
        return "Kurs: " + name + " " + type;

    }

    public void printData() {
        System.out.println(this);
        System.out.println(this.room);
        System.out.println(Arrays.toString(this.students));
        System.out.println(this.trainer);
    }

}
