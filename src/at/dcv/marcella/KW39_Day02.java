package at.dcv.marcella;

import java.util.Arrays;

public class KW39_Day02 {

    public static void main(String[] args) {

/*
// Anweisung soll zu folgender Ausgabe führen: [7, 5, 9, 4, 3]

        int [] bingo = {7,5,9,4,3};
        // prints array with toString method
        System.out.println(Arrays.toString(bingo));

        System.out.print("[");
        for (int counter = 0; counter < bingo.length; counter++) {
            System.out.print(bingo[counter]);
            if (counter < bingo.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
*/

/* Aufgabe suche nach
        _ Was ist das Gesamtergebnis? (Summe der Monatsergebnisse)
        _ Was ist das beste Monatsergebnis?
        _ In welchem Monat war das beste Monatsergebnis?
        _ Was ist das schwächste Monatsergebnis?
        _ In welchem Monat war das schwächste Monatsergebnis?
        _ War zwei hintereinander kommende Monate mit negativen Ergebnis?
        _ Was war das längste Intervall mit negativen Ergebnis?
        _ Was war das zweitbeste Ergebnis?
*/
        int[] businessResult = {1, 2, -5, 3, 10, -2, -1, -3, 0, 3, 6, 100};
        // das möchte ich noch hinkriegen: String [] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        System.out.println(Arrays.toString(businessResult));
        {
            int summe = 0;
            for (int i = 0; i < businessResult.length; i++) {
                summe += businessResult[i];
            }
            System.out.println("Gesamtergebnis: " + summe);
        }
        System.out.println();
        {
            int maximum = businessResult[0];
            int month = 0;
            for (int i = 0; i < businessResult.length; i++) {

                if (maximum < businessResult[i]) {  // wenn der Wert kleiner als i ist, wird er durch i ersetzt
                    maximum = businessResult[i];
                    month = i + 1;
                }
            }
            System.out.println("das beste Monatsergebnis war: " + maximum + " im Monat " + month);
        }
        System.out.println();
        {
            int minimum = businessResult[0];
            int month = 0;
            for (int i = 0; i < businessResult.length; i++) {

                if (minimum > businessResult[i]) {
                    minimum = businessResult[i];
                    month = i + 1;
                }
            }
            System.out.println("das schlechteste Monatsergebnis war: " + minimum + " im Monat " + month);
        }
        System.out.println();
        {
            for (int i = 0; i < businessResult.length -1; i++) {
                boolean isNegative = businessResult[i] < 0 && businessResult[i + 1] < 0;    // prüft, ob zwei aufeinander folgende Werte negativ sind
                if (isNegative) {
                    System.out.println("Zwei aufeinander folgende negative Monatsergebnisse in den Monaten " + (i + 1) + " und " + (i + 2));
                }
            }

        }
        System.out.println();
        {
            for (int i = 0; i < businessResult.length -2; i++) {
                boolean isNegative = businessResult[i] < 0 && businessResult[i + 1] < 0 && businessResult[i + 2] < 0;
                if (isNegative) {
                    System.out.println("Drei aufeinander folgende negative Monatsergebnisse in den Monaten " + (i + 1) + " und " + (i + 2) + " und " + (i + 3));
                }
            }

        }
        System.out.println();
        {
            int counter = 0;
            int interval = 0;
            for (int i = 0; i < businessResult.length -1; i++) {
                boolean isNegative = businessResult[i] < 0 && businessResult[i + 1] < 0;
                if (isNegative) {
                    counter ++;
                } else {
                    if (interval < counter) {
                        interval = counter;
                        counter = 0;
                    }
                }
            }
            System.out.println("Das längste Interval mit negativem Monatsergebnis waren " + (interval + 1) + " Monate" );

        }
        System.out.println();
        {
            int maximum = businessResult[0];
            int secondBest = businessResult[0];
            int month = 0;
            for (int i = 0; i < businessResult.length -1; i++) {
                if (maximum < businessResult[i]) {
                    maximum = businessResult[i];
                }
            }
            for (int i = 0; i < businessResult.length; i++) {
                if (businessResult[i] <= maximum && secondBest < businessResult[i]) {
                    secondBest = businessResult[i];
                    month = i + 1;
                }
            }
            System.out.println("Das zweitbeste Monatsergebnis war " + secondBest + " im Monat " + month);
        }
        System.out.println();
    }
}
