package at.dcv.DigitalCampus;

import java.util.Arrays;

public class Course {

    private String name;
    private String type;

    private Room room;
    private Student[] students;
    private Trainer[] trainer;

    public Course(String name, String type, int groupSize) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Kurs: " + name + " " + type;
    }

    public void setTrainers(Trainer[] trainer) {
        this.trainer = trainer;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setRoom(Room room) {
        this.room = room;
    }

    public void printData() {
        System.out.println(this);
        System.out.println(this.room);
        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }
        for (Trainer eachTrainer : trainer){
            System.out.println(eachTrainer);
        }
    }

}
