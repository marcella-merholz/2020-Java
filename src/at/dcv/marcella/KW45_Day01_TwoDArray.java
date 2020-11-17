package at.dcv.marcella;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KW45_Day01_TwoDArray {

    // Mehrdimensionales Array, Aufgabe Inhalt Reihen addieren
    public static void multiArray() {
        int[][] randomNumbers = new int[7][7];
        createRandomInt(randomNumbers);
        for (int row = 0; row < randomNumbers.length; row++) {
            System.out.println(Arrays.toString(randomNumbers[row]));
        }
        calculateRows(randomNumbers);
        int[] result = calculateRows(randomNumbers); // die Zahlenwerte der Addition werden an ein neues Array übergeben
        System.out.println(Arrays.toString(result));
    }

    private static void createRandomInt(int[][] randomNumbers) { // das Array randomNumbers wird mit Zufallszahlen befüllt
        Random random = new Random();
        for (int row = 0; row < randomNumbers.length; row++) {
            for (int column = 0; column < randomNumbers[row].length; column++) {
                randomNumbers[row][column] = random.nextInt(20);
            }
        }
    }

    private static int[] calculateRows(int[][] randomNumbers) {
        int[] results = new int[randomNumbers.length];
        for (int row = 0; row < randomNumbers.length; row++) {
            int sum = 0;
            for (int column = 0; column < randomNumbers[row].length; column++) {
                sum += randomNumbers[row][column];
            }
            results[row] = sum;
        }
        return results;
    }

    // Aufgabe TicTacToe
    public static void ticTacToe() {
        boolean gameOver = false;
        char[][] field = new char[3][3];
        int player = 1;
        while (!gameOver) {
            nextTurn(field, player);
            gameOver = getCheckGameOver(field, player);
            printField(field);
            player = togglePlayer(player);
        }
    }

    private static void nextTurn(char[][] field, int player) {
        Scanner scanField = new Scanner(System.in);
        System.out.println("Player " + player + " ist an der Reihe.");
        int row = 0;
        int column = 0;
        boolean fieldNotEmpty = true;
        while (fieldNotEmpty) {
            row = getUserInput(scanField, "Reihe");
            column = getUserInput(scanField, "Spalte");
            fieldNotEmpty = field[row - 1][column - 1] != 0;
            if (fieldNotEmpty) {
                System.err.println("Spielfeld bereits belegt!");
            }
        }
        field[row - 1][column - 1] = getPlayersCharacter(player);
    }

    private static int getUserInput(Scanner scanner, String type) {
        int input = 0;
        while (input <= 0 || input > 3) {
            System.out.println("Bitte geben sie die " + type + " an (1-3):");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                scanner.next(); // emptys scanner
            }
        }
        return input;
    }

    private static char getPlayersCharacter(int player) {
        if (player == 1) {
            return 'X';
        }
        return 'O';
    }

    private static boolean getCheckGameOver(char[][] field, int player) {
        // check columns and rows
        for (int i = 0; i < 3; i++) {
            if ((field[0][i] != 0 && field[0][i] == field[1][i] && field[1][i] == field[2][i]) ||
                    (field[i][0] != 0 && field[i][0] == field[i][1] && field[i][1] == field[i][2])) {
                printWinMessage(player);
                return true;
            }
        }

        // check diagonals
        if (field[0][0] != 0 && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
            printWinMessage(player);
            return true;
        }
        if (field[0][2] != 0 && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
            printWinMessage(player);
            return true;
        }

        // check no empty fields left
        for (char[] row : field) {
            for (char element : row) {
                if (element == 0) {
                    return false;
                }
            }
        }
        System.err.println("Spielfeld voll!");
        return true;
    }

    private static void printWinMessage(int player) {
        System.out.println("Spieler " + player + " gewinnt!");
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            System.out.println(Arrays.toString(field[row]));
        }
    }

    private static int togglePlayer(int player) {
        if (player == 1) {
            return 2;
        }
        return 1;
    }


}
