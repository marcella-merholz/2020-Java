package at.dcv.marcella;

import java.util.Arrays;

public class KW42_Day01 {

    public static void String() {

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
        textToNormalize = textToNormalize.toLowerCase();
        // Umlaute
        return textToNormalize;
    }

    public static void StringHand() {
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


    public static String splitWord(String word) {

        char[] chars = word.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] >= 90) {
                return word.substring(0, i) + " " + word.substring(i);
            }
        }
        System.out.println(word);
        return word;
    }



}
