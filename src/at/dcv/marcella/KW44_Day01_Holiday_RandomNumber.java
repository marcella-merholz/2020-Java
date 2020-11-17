package at.dcv.marcella;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KW44_Day01_Holiday_RandomNumber {

    private static Random random = new Random();

    private static int getScannerInput() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
        }
    }

    public static void luckyGame() {
        int randomNumber = random.nextInt(49) + 1;
        boolean lostGame = true;
        System.out.println("Eine Zufallszahl zwischen 1 und 50 wurde generiert. Sie haben 10 Versuche diese zu erraten. Bitte geben Sie hier Ihre Nummer ein.");
        for (int i = 1; i <= 10; ++i) {
            int scannerNumber = getScannerInput();
            if (scannerNumber > 50 || scannerNumber < 1) {
                System.err.println("Bitte geben Sie ein Zahl zwischen 1 und 50 ein!");
            } else if (scannerNumber < randomNumber && i < 10) {
                System.out.println("Die gesuchte Zahl ist größer. Bitte versuchen Sie es noch einmal.");
            } else if (scannerNumber > randomNumber && i < 10) {
                System.out.println("Die gesuchte Zahl ist kleiner. Bitte versuchen Sie es noch einmal.");
            } else if (scannerNumber == randomNumber){
                System.out.println("Gewonnen! " + scannerNumber + " ist die richtige Zahl!");
                lostGame = false;
                break;
            }
        }
        if (lostGame) {
            System.err.println("Leider kein Treffer.");
        }
    }

}
