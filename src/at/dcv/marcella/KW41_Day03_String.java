package at.dcv.marcella;

public class KW41_Day03_String {

    public static void string() {

        System.out.println("Hello".charAt(1));
        System.out.println("Hello".substring(3)); // erzeuge neues Objekt vom Typ String, ab Index 3
        System.out.println("Hello".substring(1, 4)); // von Index 1 bis Index 3
        System.out.println("Hello".contains("ll"));
        System.out.println((int) 'l');
        System.out.println((int) 'L'); // Groß- / Kleinschreibung beachten

        String[] words = "Das ist ein Satz".split(" ");
        for (String oneWord : words) {
            System.out.println(oneWord);
        }

        // Aufgabe: wie oft kommt das Wort "ein" im folgenden Satz vor?
        // Algorithmus: zerlege die Zeichnfolge (String) in einzelne Worte (split, Array), vergleiche, zähle
        String meinSatz = "Das ist ein Satz. Einmal mehr sage ich eines zu euch: Ein Mensch hat Hände.";
        int wortAnzahl = 0;
        String[] worte = meinSatz.split(" ");
        for (int i = 0; i < worte.length; ++i) {
            if (worte[i].equals("ein")) {
                wortAnzahl++;
            }
        }
        System.out.println("Anzahl Wort \"ein\": " + wortAnzahl);

        // Aufgabe: wie oft kommt das Satzzeichen "." vor?
        int punktAnzahl = 0;
        for (int i = 0; i < meinSatz.length(); ++i) {
            if (meinSatz.charAt(i) == '.') {
                punktAnzahl++;
            }
        }
        System.out.println("Anzahl \".\": " + punktAnzahl);

        // Aufgabe: wie oft kommt das Wort "Hand" im folgenden Satz vor?
        String satzHand = "Das ist eine Hand. Mit der Hand kann ich winken. Freundlichen Menschen gebe ich die Hand. Im Winter trage ich Handschuhe. Gibst du mir deine Hand?";
        int handAnzahl = 0;
        String[] worte2 = satzHand.split(" ");
        for (int i = 0; i < worte2.length; ++i) {
            String worte2OhneSatzzeichen = worte2[i].substring(0, worte2[i].length()-1);
            if (worte2[i].equals("Hand") || worte2OhneSatzzeichen.equals("Hand")) {
                handAnzahl++;
            }
        }
        System.out.println("Anzahl Wort \"Hand\": " + handAnzahl);
    }

    // Von Lucas: Write a function, which mirrors the functionality of substring(int start, int end)
    public static void substringFunction(String string, int start, int end) {
        System.out.println("String: " + string);
        System.out.println("Start: " + start);
        System.out.println("End: " + end);

        for (int i = start; i < end; i++) {
            System.out.print(string.charAt(i));
        }
    }

}
