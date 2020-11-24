package at.dcv.marcella;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CheatSheat {

    private static Random random = new Random();

    public static void substringTest() {
        // The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
        // Thus the length of the substring is endIndex-beginIndex.
        String text = "Hello World!";
        //             012345678...
        System.out.println(text.substring(2, 2));
    }

    public static void testFunction() {
        String sentenceNumbers = ("Null Eins Zwei Drei Vier");

        System.out.println(sentenceNumbers.length());
        System.out.println(sentenceNumbers.charAt(10));
        System.out.println(sentenceNumbers.indexOf("Z"));

        char[] sN = sentenceNumbers.toCharArray(); // zerlegt den Satz in einzelne Zeichen, die dann weiter verarbeitet werden können
        for (char character : sN) {
            System.out.println(character);
        }

        String[] numbers = sentenceNumbers.split(" "); // zerlegt den Satz in einzelne Worte
        for (String word : numbers) {
            System.out.println(word);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[3]);

        String[] numbersCopy = Arrays.copyOf(numbers, numbers.length - 2);
        System.out.println(Arrays.toString(numbersCopy));

        int[] numeric = {0, 1, 2, 3, 4};
        for (int number : numeric) {
            System.out.println(number);
        }
        System.out.println(Arrays.toString(numeric));
        System.out.println(numeric.length);
        System.out.println(numeric[3]);

        int[] randomIntArray = new int[5];
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = random.nextInt(10); // erstellt ein neues Integer-Array mit Zufallszahlen
        }
        System.out.println(Arrays.toString(randomIntArray));

        String[] randomStringArray = new String[5];
        for (int i = 0; i < randomStringArray.length; i++) {
            int randomPosition = random.nextInt(randomStringArray.length); // erstellt ein neues String-Array mit aus dem Array "numbers" an zufällig gewälter Position enthaltenen Worten
            randomStringArray[i] = numbers[randomPosition];
        }
        System.out.println(Arrays.toString(randomStringArray));

        int oneToInt = Integer.parseInt("1"); // verwandelt Zeichen in Zahl
        System.out.println(oneToInt);
        int twoToInt = Integer.valueOf("2"); // verwandelt Zeichen in Zahl
        System.out.println(twoToInt);
        int characterAsciiValue = Integer.valueOf('a'); // gibt den ASCII-Code des Zeichens aus
        System.out.println(characterAsciiValue);
        int asciiZahl = 'a'; // gibt den ASCII-Code des Zeichens aus
        System.out.println(asciiZahl);
    }

    public static void twoDimArray() {

        Scanner scanner = new Scanner(System.in);

        String[][] listOfDrinks = new String[5][];
        for (int i = 0; i < 1; i++) {
            System.out.println("Bitte geben Sie Ihren Namen ein.");
            String name = scanner.next();
            for (int j = 0; j < 1; j++) {
                System.out.println("Bitte geben Sie das gewünschte Getränk ein.");
                String drink = scanner.next();
                listOfDrinks[0][i] = drink;
            }
            System.out.println(Arrays.toString(listOfDrinks));
            listOfDrinks[i][1] = name;
        }
        System.out.println(Arrays.toString(listOfDrinks));
    }

    public static void fillTwoDimArray() {
        String[][] oldTDArray = {
                {"Daniel", "7"},
                {"Alex", "9"},
                {"Michael", "8"}};

        String[][] newTDArray = new String[3][2];

        for (int i = 0; i < 3; i++) {
            newTDArray[i] = oldTDArray[i];
            System.out.println(Arrays.toString(newTDArray[i]));
        }
    }

    public static void format() {
    System.out.printf("|%15s|%10.2f|%5s| %n", "hey", 0.3, "a");
        System.out.printf("|%15s|%10.2f|%5s| %n", "ho", 1.2, "ab");
        System.out.printf("|%15s|%10.2f|%5s| %n", "test", 1396743.45, "abc");
        System.out.printf("|%15s|%10.2f|%5s| %n", "format", 45536.243, "abcd");
        System.out.printf("|%15s|%10.2f|%5s| %n", "output", 0.0, "abcde");
        System.out.printf("|%15s|%10.2f|%5s| %n", "right",45.7, "abc");
    }


    /*
            cond ? toDo1 : toDo2;   // Verkürzte Schreibweise: ?
            if (cond) {             // entspricht "if"
                toDo1;
            } else {
                toDo2;
            }
    */

}
