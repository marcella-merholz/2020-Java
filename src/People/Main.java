package People;

public class Main {
    public static void main(String[] args) {

        People p1 = new People("Klaus", "Nussbaumer", 1978, "Bregenz", 'm');
        People p2 = new People("Sabrina", "Vonbrühl", 1974, "Feldkirch", 'f');
        People p3 = new People("Marcella", "Merholz", 1977, "Marktheidenfeld", 'f');
        People p4 = new People("Marcella", "Merholz", 1977, "Dornbirn", 'f');

        printPerson(p3);
        printPerson(p4);

        p1.setLastName("Mustermann");

        printPerson(p1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        if (p3.equals(p4)) {
            System.out.println("sind identisch.");
        } else {
            System.out.println("sind unterschiedlich.");
        }

        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSimpleName());

    }

    public static void printPerson (People p){
        System.out.printf("%-14s %-14s %-6d %-18s %s%n", p.getFirstName(), p.getLastName(), p.getBirthYear(),p.getBirthPlace(),p.getGender());
    }

}
