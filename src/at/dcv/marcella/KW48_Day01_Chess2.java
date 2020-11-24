package at.dcv.marcella;

import java.util.Random;

public class KW48_Day01_Chess2 {

    private static Random random = new Random();

    public static void chess() {

        int sizeChessboard = 8;
        int[] positionBlack = {7, 0};
        int[] positionWhite = {0, 7};
        String currentPlayer = "black";
        printField(sizeChessboard, positionBlack, positionWhite);

        while (!checkGameOver(positionBlack, positionWhite)) {
            if (currentPlayer == "black") {
                movePosition(sizeChessboard, positionBlack);
            } else {
                movePosition(sizeChessboard, positionWhite);
            }
            printField(sizeChessboard, positionBlack, positionWhite);
            currentPlayer = togglePlayer(currentPlayer);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ie) {/*ignore*/}
        }

        System.out.println(currentPlayer + " hat gewonnen");
    }

private static void printField(int size, int[] positionBlack, int[] positionWhite) {
        char blackKnight = 9822;
        char whiteKnight = 9816;

        System.out.println("   A B C D E F G H");
        for (int i = 0; i < size; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < size; j++) {
                if (i == positionBlack[0] && j == positionBlack[1]) {
                    System.out.print(blackKnight);
                } else if (i == positionWhite[0] && j == positionWhite[1]) {
                    System.out.print(whiteKnight);
                } else if ((i % 2) == (j % 2)) {
                    System.out.print(" X");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void movePosition(int size, int[] position) {
        int[] originalPosition = {position[0], position[1]};
        boolean stepOK = false;
        while (!stepOK) {
            int moveCase = random.nextInt(9);
            switch (moveCase) {
                case 1 -> {
                    position[0] += 2;
                    position[1] += 1;
                }
                case 2 -> {
                    position[0] += 1;
                    position[1] += 2;
                }
                case 3 -> {
                    position[0] -= 2;
                    position[1] += 1;
                }
                case 4 -> {
                    position[0] -= 1;
                    position[1] += 2;
                }
                case 5 -> {
                    position[0] += 2;
                    position[1] -= 1;
                }
                case 6 -> {
                    position[0] += 1;
                    position[1] -= 2;
                }
                case 7 -> {
                    position[0] -= 2;
                    position[1] -= 1;
                }
                case 8 -> {
                    position[0] -= 1;
                    position[1] -= 2;
                }
            }
            if (position[0] >= 0 && position[0] < size && position[1] >= 0 && position[1] < size) {
                stepOK = true;
            } else {
                position[0] = originalPosition[0];
                position[1] = originalPosition[1];
            }
        }
    }

    private static String togglePlayer(String currentPlayer) {
        if (currentPlayer == "black") {
            currentPlayer = "white";
        } else {
            currentPlayer = "black";
        }
        return currentPlayer;
    }

    public static boolean checkGameOver(int[] positionBlack, int[] positionWhite) {
        for (int i = 0; i < positionBlack.length; i++) {
            if (positionBlack == positionWhite) {
                return true;
            }
        }
        return false;
    }


}
