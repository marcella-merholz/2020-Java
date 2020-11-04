package at.dcv.marcella;

public class KW39_Day01 {

    public static void multiply() {
        for (int i = 1; i <= 10; i++) {
            int j = 1;
            int ergebnis = i * j;
            System.out.println(i + " x " + j + " = " + ergebnis + "\n");
            break;
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int ergebnis = i * j;
                System.out.println(i + " x " + j + " = " + ergebnis);
            }
        }
        System.out.println("\n");

        // do-while-schleife beispiel
        int i = 0;
        do {
            i++;
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + i * j);
                j++;
            } while (j <= 10);
        } while (i < 10);
    }

    public static void prime() {
        for (int i = 1; i <= 100; i++) {
            boolean isPrim = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrim = false;
                    break;
                }
            }
            if (isPrim) {
                System.out.println(i + " ist eine Primzahl");
            } else {
                System.out.println(i + " ist keine Primzahl");
            }
        }
    }

    public static void palindrom() {
        boolean isPalindrom = true;
        String WordToCheck = "marcella";
        for (int i = 0; i < WordToCheck.length() / 2; i++) {
            char charToCheck1 = WordToCheck.charAt(i);
            char charToCheck2 = WordToCheck.charAt(WordToCheck.length() - 1 - i);
            if (charToCheck1 != charToCheck2) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println(WordToCheck + " ist ein Palindrom");
        } else {
            System.out.println(WordToCheck + " ist kein Palindrom");
        }
    }

    // Sternaufgabe
    public static void stars() {
        String stern = "*";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(stern);
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(stern);
            }
            System.out.println();
        }
    }

}
