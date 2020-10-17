package at.dcv.marcella;

public class KW38_Day02 {

    public static void bool() {

        int schoki = 1;
        boolean schokiKaufen = schoki <= 2;
        if (schokiKaufen) {
            System.out.println("Schoki kaufen");
        } else
            System.out.println("ist noch Schoki da");

        boolean geld = false;
        boolean karte = false;
        if (geld || karte) {
            System.out.println("Schuhe kaufen");
        } else System.out.println("keine Schuhe kaufen");
    }

    public static void pi() {
        // Pi-Annäherung  4 - 4/3 + 4/5 - 4/7 + 4/9 ...
        double PiZahl = 4.0;
        System.out.println(PiZahl);
        PiZahl -= 4.0 / 3;
        System.out.println(PiZahl);
        PiZahl += 4.0 / 5;
        System.out.println(PiZahl);
        PiZahl -= 4.0 / 7;
        System.out.println(PiZahl);
        PiZahl += 4.0 / 9;
        System.out.println(PiZahl);
        PiZahl -= 4.0 / 11;
        System.out.println(PiZahl);
        PiZahl += 4.0 / 13;
        System.out.println(PiZahl);
        PiZahl -= 4.0 / 15;
        System.out.println(PiZahl);
    }

    public static void loops() {
    // while und for-Schleife

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            ++i;
        }

        int j = 0;
        for (j = 0; j < 10; ++j) {
            System.out.println(j);
        }

        // Pi-Annäherung mit for-Schleife

        int nenner = 3;
        double calcPi = 4.0;

        for (int counter = 0; counter < 100; counter++) {
            calcPi -= 4.0 / nenner;
            nenner += 2;
            calcPi += 4.0 / nenner;
            nenner += 2;

            System.out.println(calcPi);
        }
    }

    public static void sum() {
// Summe bis 100 ausrechnen 1 + 2 + 3 + 4 ... 100
        int summe = 0;

        for (int i = 0; i <= 100; i++) {
            summe = summe + i;
            System.out.println(summe);
        }
    }

    public static void multiplyFor() {
// multiplizieren 1 * 2 * 3 ... 20

        long multiplikation = 1;

        for (int i = 1; i <= 20; i++) {
            multiplikation = multiplikation * i;
            System.out.println(multiplikation);
        }
    }

    public static void rowColumnOutput() {
// Quadrat aus Buchstaben A erstellen mit variabler Anzahl an Zeilen und Buchstaben pro Zeile

        String text = "A";

        for (int size = 1; size <= 5; size++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }
}
