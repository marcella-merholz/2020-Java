package at.dcv.marcella;

public class KW40_Day01 {

    public static void businessResultForEach() {
        // Aufgabe Suche nach: zwei hintereinander kommende Monate mit negativen Ergebnis?
        // Lösung mit for-each-Schleife
        int[] businessResult = {1, 2, -5, -3, 10, -2, 1, -3, 0, 3, 6, 7};
        boolean wasNegative = false;
        for (int result : businessResult) {     // for-each-Schleife: Datentyp definieren (Zahlen, String ...) : Array-Name
            if (result < 0) {
                if (wasNegative) {  // bei der ersten Zahl < 0 läuft die Schleife noch weiter, da wasNegative mit false initialisiert
                    System.out.println("2 oder mehr Monate mit negativem Ergebnis");
                    break;
                } else {
                    wasNegative = true; // wird bei der ersten Zahl < 0 auf true gesetzt, d.h. folgt nun noch eine negative Zahl, dann System.out.println
                }
            } else {
                wasNegative = false;
            }
        }

        int negCounter = 0;
        int interval = 0;
        for (int result : businessResult) {
            if (result < 0) {
                negCounter++;
                if (interval < negCounter) {    // wichtig! die Übergabe muss an dieser Stelle* stattfinden, ansonsten falsch, wenn das negative Intervall am Ende des Arrays
                    interval = negCounter;
                }
            } else {    // *nicht hier
                negCounter = 0;
            }
        }
        System.out.println("Das längste Interval mit negativem Monatsergebnis waren " + (interval) + " Monate");

        int maxValue = Integer.MIN_VALUE;
        int secMaxValue = Integer.MIN_VALUE;
        for (int result : businessResult) {
            if (result >= maxValue) {
                secMaxValue = maxValue;
                maxValue = result;
            } else if (result >= secMaxValue) {  // für den Fall, dass der zweitgrößte Wert nach dem größten Wert kommt. dann trifft die erste if-Bedingung nicht zu.
                secMaxValue = result;
            }
        }
        System.out.println("Das zweitbeste Monatsergebnis war " + secMaxValue);
        System.out.println();
    }

    public static void leapyear() {
        // Schaltjahr ausgeben
        for (int year = 1800; year <= 2100; year++) {
            if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
                System.out.println(year + " ist ein Schaltjahr.");
            }
        }
    }
}
