package at.dcv.marcella;

public class KW38_Day03 {

    public static void modulo() {
// Modulo. Hier: zeige alle Zahlen von 1 bis 10 an, deren Restwert, wenn man sie durch 3 teilt, 0 ist. 3, 6, 9.
        int i = 0;

        while (i <= 10) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void multiplySmall() {
// Das kleine 1 x 1

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int ergebnis = i * j;
                System.out.println(i + " x " + j + " = " + ergebnis);
            }
        }
    }

    public static void prime1() {
/*
// Primzahlen falscher Versuch 1

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {

                boolean self = i % i == 0; // eine Zahl durch sich selbst ist ja immer 0
                boolean others = j % i != 0;

                if (self && others) {
                    System.out.println(i);
                }
            }
        }
*/

/*
// Primzahlen falscher Versuch 2

            for (int i = 2; i <= 100; i++) {
                for (int j = 2; j < i; j++) {

                    boolean keinePrimzahl = i % j == 0;

                    if (keinePrimzahl) {
                        break;
                    } else {
                        System.out.println(i); // geht nicht, müsste außerhalb der if-Anweisung stehen
                    }
                }
            }
*/

// Primzahlen Lösung CC

        for (int prim = 2; prim <= 100; prim++) {
            boolean isPrim = true;
            for (int divisor = 2; divisor < prim; divisor++) {

                if (prim % divisor == 0) {
                    isPrim = false;
                    break;
                }
            }
            if (isPrim) {
                System.out.println(prim);
            }
        }
    }

    public static void arrays() {
        String[] suitcase = {"umbrella", "television", "laptop", "keyboard", "welding machine", "flowers", "10 inch rack"};
        int i = 0;

        while (i < suitcase.length) {
            System.out.println(suitcase[i]);
            i++;
        }

        for (int j = 0; j < suitcase.length; j++) {
            System.out.println(suitcase[j]);
        }

// for each loop (wenn man alle indizes auslesen will)
        for (String item : suitcase) {
            System.out.println(item);
        }
        // Beachte ! Arrays indizieren immer ab 0!
    }

    public static void charAt() {
        // Strings sind auch eine Form von Arrays.
        String name = "marcella";
        char buchstabe = name.charAt(0);
        System.out.println(buchstabe);
    }

    public static void palindrom1() {
        String name = "otto";
        boolean isPalindrom = true;

        for (int i = 0; i < name.length() / 2; i++) {
            char charakterToCheck1 = name.charAt(i);
            char charakterToCheck2 = name.charAt(name.length() - 1 - i);
// wenn der Buchstabe an erster und letzter Stelle (resp. an zweiter und vorletzter etc.) nicht gleich sind, wird der Wert falsch gesetzt und die Schleife beendet.
            if (charakterToCheck1 != charakterToCheck2) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println(name + " ist ein Palindrom");
        } else {
            System.out.println(name + " ist kein Palindrom");
        }

    }
}
