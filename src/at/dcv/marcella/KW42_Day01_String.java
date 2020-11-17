package at.dcv.marcella;

import java.util.Arrays;

public class KW42_Day01_String {

    public static void string() {
        String meinSatz = "Das ist ein Satz. Einmal mehr sage ich eines zu euch: Ein Mensch hat Hände.";
        var charcaters = meinSatz.toCharArray();
        System.out.println(Arrays.toString(charcaters));
        int counter = 0;
        for (var character : charcaters) {
            System.out.println(character);
            if (character == '.') {
                counter++;
            }
        }
        System.out.println(counter);

        // Codebeispiel von Erich
        var ergebnis = meinSatz.split("\\.").length;
        System.out.println(ergebnis);
    }

    // sog. "Noise" bereinigen, dh alles entfernen, was nicht gebraucht wird.
    // Methode dafür erstellen
    private static String normalizeText(String textToNormalize){
        textToNormalize = textToNormalize.replaceAll("[;,:\\.\\?!]", " "); // Punkt und Fragezeichen müssen im regex immer "escapen"
        textToNormalize = textToNormalize.toLowerCase(); // alles in Kleinbuchstaben umwandeln
        // Umlaute
        return textToNormalize;
    }

    public static void stringHand() {
        // Aufgabe: wie oft kommt das Wort "Hand" vor?
        String satzHand = "Das ist eine Hand. Mit der Hand kann ich winken. Freundlichen Menschen gebe ich die Hand. Im Winter trage ich Handschuhe. Gibst du mir deine Hand?";
        String satzHandNormalized = normalizeText(satzHand);
        System.out.println(satzHandNormalized);
        String[] satzHandNormalizedArray = satzHandNormalized.split(" ");
        int counter = 0;
        for (String word : satzHandNormalizedArray) {
            if (word.equals("hand")) {
                counter++;
            }
        }
        System.out.println("Das Wort hand kommt " + counter + "-mal vor");
    }

    public static void cleanSentence() {
        // Aufgabe noch nicht gelöst: Wie kann ich ein Leerzeichen einfügen!
        // Aufgabe: Wie viele Worte enthält die folgende Zeichenfolge?
        // Algorithmus: Satz strukturieren (Leerzeichen einfügen, falsche Zeichen ersetzen), Worte ermitteln, Worte zählen
        String myString = "ImWinter;trage_ich Handschuhe.";
        myString = myString.replaceAll("[;_]", " ");
        for (int i = 1; i < myString.length(); ++i) {
            int upperCase = myString.charAt(i);
            int lowerCase = myString.charAt(i -1);
            if ((upperCase > 65 && upperCase < 90) && (lowerCase > 97 && upperCase < 122)) {
                System.out.println(myString.charAt(i));
            }
        }
        String[] myStringArray = myString.split(" ");
        for (String oneWord : myStringArray) {
        }
        System.out.println("Der Satz hat " + (myStringArray.length +1) + " Wörter");

        /*------------------------------------
        // von Lucas: #1 Clean and structure sentence
        String sentenceWinter = "ImWinter;trage_ich Handschuhe.";
        String sentenceWinterNormalized = sentenceWinter
                .replaceAll("[.;_]", " ")
                .replaceAll("(?<=[a-z])(?=[A-Z])", " "); // was passiert hier?

        System.out.println("Clean sentence: " + sentenceWinterNormalized);
        */

    }

    public static String splitWord(String word) {
        System.out.println(word);
        char[] chars = word.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                word = word.substring(0, i) + " " + word.substring(i);
            }
        }
        System.out.println(word);
        return word;
    }

}
