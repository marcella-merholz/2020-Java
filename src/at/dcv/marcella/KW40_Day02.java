package at.dcv.marcella;

import java.util.Arrays;

public class KW40_Day02 {

    public static void bubbleSort() {
        // Sortieralgorithmus (bubblesort)

        int numbers[] = {122, -94, 7, -12, 77, 77, -10, 56, -133};
        int compCounter = 0;

        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers.length - 1 - i; ++j) { // -i verkürzt hier den Zugriff, da die letzten Zahlen bereits sortiert sind
                compCounter++;
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println("Anzahl der Wechsel " + compCounter);
        System.out.println();
    }

    public static void compLexico() {
        //vergleicht Strings lexicographisch: 0: beide gleich, <0: zweite alphabetisch vorher, >0: erste alphabetisch vorher
        String text = "hello";
        System.out.println("textlänge " + text.length());
        System.out.println(text.compareTo("mouse"));
        System.out.println(text.compareTo("hello"));
        System.out.println(text.compareTo("ship"));
        System.out.println();
    }

    public static void sortStringArray() {
        String names[] = {"Cecil", "Marcella", "Jos", "Jos", "Johanna", "Thomas", "Alberta", "Berta"};
        System.out.println(Arrays.toString(names));
        int posShortestName = 0;
        int posLongestName = 0;
        int posA = 0;
        int posZ = 0;
        int sameName = 0;
        // Wieviele Schüler sind in der Klasse?
        for (int i = 0; i < names.length; ++i) {
            System.out.print(names[i].length() + ",");
            // Wer hat den kürzesten Namen (Position + Name)?
            if (names[posShortestName].length() > names[i].length()) {
                posShortestName = i;
            }
        }
        // Wer hat den längsten Namen?
        for (int i = 0; i < names.length; ++i) {
            if (names[posLongestName].length() < names[i].length()) {
                posLongestName = i;
            }
        }
        // Welcher Name steht an der alphabetisch ersten Stelle?
        for (int i = 0; i < names.length; ++i) {
            if (names[posA].compareTo(names[i]) > 0) {
                posA = i;
            }
        }
        // Welcher Name steht an der letzten Stelle?
        for (int i = 0; i < names.length; ++i) {
            if (names[posZ].compareTo(names[i]) < 0) {
                posZ = i;
            }
        }
        // Kommt ein Name zweimal vor? Welcher?
        for (int j = 0; j < names.length; ++j) {
            for (int i = 0; i < names.length - 1 - j; ++i) {
                if (names[j].compareTo(names[i + 1 + j]) == 0) {
                    sameName = j;
                }
            }
        }
        // Ordne in umgekehrter alphabetischer Reihenfolge
        for (int j = 0; j < names.length; ++j) {
            for (int i = 0; i < names.length - 1 - j; ++i) {
                if (names[i].compareTo(names[i + 1]) < 0) {
                    String temp = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println(names.length + 1 + " Schüler sind in der Klasse");
        System.out.println("Der kürzeste Name ist " + names[posShortestName] + " an Position " + (posShortestName + 1));
        System.out.println("Der längste Name ist " + names[posLongestName] + " an Position " + (posLongestName + 1));
        System.out.println("Alphabetisch an erster Stelle steht der Name " + names[posA] + " an Position " + (posA + 1));
        System.out.println("Alphabetisch an letzter Stelle steht der Name " + names[posZ] + " an Position " + (posZ + 1));
        System.out.println("Der Name " + names[sameName] + " kommt zweimal vor");
        System.out.println(Arrays.toString(names));
    }
}