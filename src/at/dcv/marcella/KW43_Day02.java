package at.dcv.marcella;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KW43_Day02 {

    public static void runden() {
        float[] values = {1.0f, 1.15f, 1.5f, 1.91f, 11f, 19f, 120f};

        for (float f: values) {
            System.out.print(f + " | ");
            System.out.print(Math.round(f) + " | "); // Nach .5 Regel
            System.out.print(Math.floor(f) + " | "); // abrunden
            System.out.print(Math.ceil(f)); // aufrunden
            System.out.println();
        }
        System.out.println("-----------------------");

        float faktor = 10.0f;
        for (float f: values) {
            System.out.print(f + " | ");
            System.out.print(faktor*Math.round(f/faktor) + " | "); // Nach .5 Regel
            System.out.print(faktor*Math.floor(f/faktor) + " | "); // abrunden
            System.out.print(faktor*Math.ceil(f/faktor)); // aufrunden
            System.out.println();
        }
    }

    private static Random random = new Random();

    public static void zufall() {
        String[] words = {"Apfel", "Birne", "Cocosnuss", "Datel", "Erdbeeren", "Kiwi"};
        for (int i = 0; i < 10; ++i) {
            System.out.println("Zufallszahl(" + i + "): " + random.nextInt(100));
            System.out.println("Zufallszahl(" + i + "): " + words[random.nextInt(words.length)]);
        }
    }

    /* Walking Man nicht der richtige Ansatz

    public static void wanderingX() {
        String[] field = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        System.out.println(Arrays.toString(field));

        int position = field[10];
        boolean reachedBorder = position != 0 || position != 19;
        while (true) {
            int randomMove = random.nextInt(11);
            switch (randomMove) {
                case 1 - 3:
                    field[position] = " ";
                    position = position + 1;
                    field[position] = "X";
                case 4 - 7:
                    field[position] = " ";
                    position = position - 1;
                    field[position] = "X";
                default:
                    position = position;
            }
            System.out.println(Arrays.toString(field));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {}
        }
    }
    */

    public static void wanderingX() {
        int width = widthUserInput();
        int actualPosition = Math.round(width / 2.0f);
        while (!(actualPosition == 1 || actualPosition == width)) {
            actualPosition = move(actualPosition);
            printField(width, actualPosition);
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {/*ignore*/}
        }
    }

    public static int widthUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Breite des Spielfeldes ein");
        int widthInput = Integer.MIN_VALUE;
        while (widthInput == Integer.MIN_VALUE) {
            try {
                String line = sc.nextLine();
                widthInput = Integer.valueOf(line.trim()); // konvertiert String auf integer
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist keine Zahl, bitte geben Sie die Breite numerisch ein.");
            }
        }
        return widthInput;
    }

    public static int move(int actualPos) {
        int randomMove = random.nextInt(10);
        if (randomMove < 3) {
            actualPos -= 1;
        } else if (randomMove > 3 && randomMove < 6) {
            actualPos += 1;
        }
        return actualPos;
    }

    public static void printField(int width, int pos) {
        System.out.print("[");
        for (int i = 1; i < pos; ++i) {
            System.out.print(" ");
        }
        System.out.print("X");

        for (int i = pos + 1; i <= width; ++i) {
            System.out.print(" ");
        }
        System.out.println("]");
    }
}

