package at.dcv.marcella;

import java.util.Random;

public class KW47_Day03_Chess {

    private static Random random = new Random();

    public static void chess() {

        int sizeChessboard = 8;
        int[] position = {7, 0};
        printField(sizeChessboard, position);

        while (!checkPosition(position)) {
            movePosition(sizeChessboard, position);
            printField(sizeChessboard, position);
            try {
                Thread.sleep(900);
            } catch (InterruptedException ie) {/*ignore*/}
        }

        System.out.println("Sie haben die Position H8 erreicht!");
    }

    private static void printField(int size, int[] position) {
        char knight = 9822;
        char white = 9646;

        System.out.println("  A B C D E F G H");
        for (int i = 0; i < size; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < size; j++) {
                if (i == position[0] && j == position[1]) {
                    System.out.print(knight);
                } else if ((i % 2) == (j % 2)) {
                    System.out.print(white);
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

    public static boolean checkPosition(int[] position) {
        for (int i = 0; i < position.length; i++) {
            if (position[0] == 0 && position[1] == 7) {
                return true;
            }
        }
        return false;
    }


}
