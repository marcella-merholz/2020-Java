package at.dcv.marcella;

public class KW38_Day03 {

    // Modulo. Hier: zeige alle Zahlen von 1 bis 10 an, deren Restwert, wenn man sie durch 3 teilt, 0 ist. 3, 6, 9.
    public static void modulo() {
        int i = 0;
        while (i <= 10) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // Das kleine 1 x 1
    public static void multiplySmall() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int ergebnis = i * j;
                System.out.println(i + " x " + j + " = " + ergebnis);
            }
        }
    }

    // Primzahlen bis 100 ausgeben
    public static void prime1() {
        for (int prim = 2; prim <= 100; prim++) {
            boolean isPrim = true; // zu Beginn true, da immer durch sich selbst teilbar
            for (int divisor = 2; divisor < prim; divisor++) {
                if (prim % divisor == 0) { // prüft, ob es noch durch eine andere Zahl als sich selbst teilbar ist
                    isPrim = false;
                    break;
                }
            }
            if (isPrim) {
                System.out.println(prim);
            }
        }
    }

    // Arrays. Beachte! Arrays indizieren immer ab 0!
    public static void arrays() {
        String[] suitcase = {"umbrella", "television", "laptop", "keyboard", "welding machine", "flowers", "10 inch rack"};
        int i = 0;
        while (i < suitcase.length) { // Länge des Arrays
            System.out.println(suitcase[i]); // Array an Position i
            i++;
        }

        for (int j = 0; j < suitcase.length; j++) { // das Gleiche mit for-Schleife
            System.out.println(suitcase[j]);
        }

        // for each loop (wenn man alle Indizes auslesen will)
        for (String teilAusKoffer : suitcase) {
            System.out.println(teilAusKoffer);
        }
    }

    // Strings sind auch eine Form von Arrays. Auslesen eines Strings mit charAt
    public static void charAt() {
        String name = "marcella";
        char buchstabe = name.charAt(0);
        System.out.println(buchstabe);
    }

    // Prüfen, ob es sich bei dem Wort um ein Palindrom handelt
    public static void palindrom1(String name) {
        boolean isPalindrom = true;

        for (int i = 0; i < name.length() / 2; i++) {
            char charakterToCheck1 = name.charAt(i);
            char charakterToCheck2 = name.charAt(name.length() - 1 - i); // -1 weil ab 0 indiziert
            if (charakterToCheck1 != charakterToCheck2) {
                isPalindrom = false;
                break; // wenn der Buchstabe an erster und letzter Stelle (resp. an zweiter und vorletzter etc.) nicht gleich sind, wird der Wert falsch gesetzt und die Schleife beendet.
            }
        }
        if (isPalindrom) {
            System.out.println(name + " ist ein Palindrom");
        } else {
            System.out.println(name + " ist kein Palindrom");
        }
    }

}
