package at.dcv.DigitalCampus;

public class Main {

    public static void main(String[] args) {

        Building FK = new Building("Arbeiterkammer Feldkirch", "Widnau 6, 6800 Feldkirch");
        Building DO = new Building("Rhomberg Areal", "Färbergasse, 6850 Dornbirn");

        Room DC = new Room("C3", 3, FK);

        Course CC_BB = new Course("CC Basics JAVA Feldkirch BB", "berufsbegleitend", 12);

        Trainer Daniel = new Trainer("Daniel", "Grießer", "street", "streetNumber", 6800, "city", "country");
        Trainer Gyula = new Trainer("Gyula", "Horvarth", "street2", "streetNumber2", 6800, "city2", "country2");

        Student Alex = new Student("Alex");
        Student Ali = new Student("Ali");
        Student Bokhee = new Student("Bokhee");
        Student Dan = new Student("Dan");
        Student Erich = new Student("Erich");
        Student Irene = new Student("Irene");
        Student Klaus = new Student("Klaus");
        Student Lukas = new Student("Lukas");
        Student Marcella = new Student("Marcella");
        Student Mihael = new Student("Mihael");
        Student Sabrina = new Student("Sabrina");
        Student Samet = new Student("Samet");

        CC_BB.setRoom(DC);
        CC_BB.setStudents(new Student[]{Alex, Ali, Bokhee, Dan, Erich, Irene, Klaus, Lukas, Marcella, Mihael, Sabrina, Samet});
        CC_BB.setTrainers(new Trainer[]{Daniel, Gyula});
        CC_BB.printData();
    }

}
