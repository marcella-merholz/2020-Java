package at.dcv.marcella;

public class KW38_Day01 {

    public static void dataTypes() {

        System.out.println("Hello World");

        char buchstabe = 'M';
        float nochEinFloat = 02.0F;
    }

    public static void sortInstruction () {
        // Ordne die Anweisungen so, dass die Zahlen in dieser Reihenfolge ausgegeben werden: 8,8,81,81,9,9,7,7
        int neueZahl = 7;
        System.out.println(++neueZahl); // zählt hoch, gibt dann aus
        System.out.println(neueZahl++); // gibt aus, zählt dann hoch
        System.out.println(neueZahl * neueZahl);
        System.out.println(neueZahl = neueZahl * neueZahl);
        System.out.println(neueZahl=(neueZahl-9) / 8);
        System.out.println(neueZahl--);
        System.out.println(--neueZahl);
        System.out.println(neueZahl);
    }
}
