package at.dcv.marcella;

public class KW38_Day01 {

    public static void dataTypes() {
        System.out.println("Hello World");
        char buchstabe = 'M';
        float nochEinFloat = 02.0F;
        System.out.println(buchstabe);
        System.out.println(nochEinFloat);
        System.out.println(buchstabe + nochEinFloat); // !!! hier wird char in float? verwandelt (ASCII-Code Belegung: 77)
    }

    public static void sortInstruction () {
        // Ordne die Anweisungen so, dass die Zahlen in dieser Reihenfolge ausgegeben werden: 8,8,81,81,9,9,7,7
        int neueZahl = 7;
        System.out.println(++neueZahl); // zählt hoch, gibt dann aus
        System.out.println(neueZahl++); // gibt aus, zählt dann hoch
        System.out.println(neueZahl * neueZahl); // neue Zahl ist hier immer noch 9
        System.out.println(neueZahl = neueZahl * neueZahl); // jetzt ist neue Zahl 81
        System.out.println(neueZahl = (neueZahl -9) / 8); // 72 / 8 = 9
        System.out.println(neueZahl--); // gibt erst aus, zählt dann runter
        System.out.println(--neueZahl); // zählt runter, gibt dann aus
        System.out.println(neueZahl); // gibt nur aus
    }
}