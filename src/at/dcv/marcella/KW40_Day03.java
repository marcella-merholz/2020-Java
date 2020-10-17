package at.dcv.marcella;

import java.util.Arrays;

public class KW40_Day03 {

    public static void refactoring() {

        String[] animals = new String[]{"Maus", "Hase", "Igel", "Elefant"};
        System.out.println("Array animals unsortiert " + Arrays.toString(animals));
        String[] sortedArrayAnimals = bubblesort(animals);

        String[] names = new String[]{"Daniel", "Klaus", "Sabrina", "Alex"};
        System.out.println("Array names unsortiert " + Arrays.toString(names));
        String[] sortedArrayNames = bubblesort(names);

        int longestElementIndex = getLongestElementIndex(names);
        System.out.println("Index " + longestElementIndex + " hat den längsten Namen");
        System.out.println();

    }

    // refactoring manuell
    /***
     * Makes a copy of the original array and returns the sorted copy
     * @param arrayToSort array to sort
     * @return sorted copy of the array
     */
    // java doc, der grüne Kommentar, eingeben mit: /*** + Enter, dieser Kommentar wird dann angezeigt, wenn man mit der Maus über den Namen (in diesem Fall "bubblesort") fährt
    // kann man auch in andere Klasse importieren über: Functions.bubblesort(names)

    public static String[] bubblesort(String[] arrayToSort) {
        String[] arrayCopy = Arrays.copyOf(arrayToSort, arrayToSort.length);
        boolean swapped = true; // damit überhaupt in Schleife geht
        while (swapped) {
            swapped = false; // initial auf false setzen, damit nachher überprüft werden kann, ob ausgetauscht wird
            for (int i = 0; i < arrayCopy.length - 1; ++i) {
                if (arrayCopy[i].compareTo(arrayCopy[i + 1]) > 0) {
                    swapped = true; // damit die Schleife wiederholt
                    String tempString = arrayCopy[i]; // temp ist Platzhalter
                    arrayCopy[i] = arrayCopy[i + 1];
                    arrayCopy[i + 1] = tempString;
                }
            }
        }
        System.out.println("Array sortiert " + Arrays.toString(arrayCopy));
        System.out.println();
        return arrayCopy;
    }

    private static int getLongestElementIndex(String[] longestOfNames) {
        // refactor über intelliJ: Block markieren, rechte Maustaste, Refactor, Extract Method. macht private weil Grundregel in java: immer niedrigste Sichtbarkeit

        int longestElementIndex = 0;
        int longestElementLength = 0;
        for (int i = 0; i < longestOfNames.length; ++i) {
            if (longestOfNames[i].length() > longestElementLength) {
                longestElementIndex = i;
                longestElementLength = longestOfNames[i].length();
            }
        }
        return longestElementIndex;
    }


    public static void recursion() {
        // Rekursion: Eine Funktion kann sich selber aufrufen
        counter1(1, 10);
        System.out.println();
        counter2(1, 5);
        System.out.println();
    }

    public static void counter1(int start, int end) {
        System.out.println(start);
        int increment = start + 1;
        // wichtig: Abbruchbedingung formulieren
        if (start < end) {
            counter1(increment, end);
        }
    }

    public static void counter2(int start, int end) {
        System.out.println(start);
        if (start < end) {
            counter2(start + 1, end);
        }
    }


}
