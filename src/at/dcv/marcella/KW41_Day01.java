package at.dcv.marcella;

public class KW41_Day01 {

    public static void pascal() {

    /*
    Gibt das pascalsche Dreieck aus
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    1 6 15 20 15 6 1
    1 7 21 35 35 21 7 1
    1 8 28 56 70 56 28 8 1
    1 9 36 84 126 126 84 36 9 1
    */

        int maxRows = 10;
        for (int row = 1; row <= maxRows; ++row) {
            for (int column = 1; column <= row; ++column) {
                int result = pascalCalc(row, column);
                System.out.print(result + " ");
            }
            System.out.println(" ");
        }
    }

    public static int pascalCalc(int row, int column) {
        if (column == 1 || column == row) {
            return 1;
        } else {
            return pascalCalc(row -1, column -1) + pascalCalc(row -1, column);
        }
    }


    public static void pascalCache() {
        // Laufzeitoptimierung durch speichern der Ergebnisse im Cache
        // Zweidimensionales Array (Reihe, Spalte)

        int maxRows = 100;
        long[][] cache = new long[maxRows][maxRows];
        for (int row = 1; row <= maxRows; ++row) {
            System.out.println(" ");
            for (int column = 1; column <= row; ++column) {
                long result = pascalCacheCalc(row, column, cache);
                System.out.print(result + " ");
            }
        }
    }

    public static long pascalCacheCalc(int row, int column, long[][] cache) {
        // Cache Hit, merkt sich die bereits errechneten Positionen
        if (cache[row - 1][column - 1] != 0) {
            return cache[row - 1][column - 1];
        }
        if (column == 1 || column == row) {
            return 1;
        }
        long result = pascalCacheCalc(row - 1, column - 1, cache) + pascalCacheCalc(row - 1, column, cache);
        cache[row - 1][column - 1] = result;
        return result;
    }


}
