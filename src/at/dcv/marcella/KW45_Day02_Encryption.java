package at.dcv.marcella;

public class KW45_Day02_Encryption {

    private static String book = "da muss ich mir noch den Text von Irene holen. Vorerst nehmen wir mal einen Beispieltext in dem ein j vorkommt, außerdem noch ein v und zu guter letzt ein a";

    // Beispiel von Irene
    public static void jointSolutionEncryption() {
        System.out.println(encryption("java"));
        // System.out.println(decryption("556 7 383 31"));
    }

    public static String encryption(String text) {
        String encryptedText = "";
        int position = 0;
        int lastPosition = 0;
        for (int i = 0; i < text.length(); i++) {
            //System.out.println(text.charAt(i));
            position = book.indexOf(text.charAt(i), position);
            //System.out.println(book.indexOf(text.charAt(i)));
            //Brauchen wir nicht mehr, weil jetzt einfach die Positionsangabe reicht, ab wo der nächste Buchstabe gesucht wird.
            //System.out.println(position);
            //Absolute Position im Text.
            encryptedText += (position - lastPosition) + " ";
            lastPosition = position;
        }
        return encryptedText;
    }
    public static String decryption(String encryptedText) {
        String decryptedText = "";
        int lastPosition = 0;
        String [] words = encryptedText.split(" ");
        //int testVariable = Integer.valueOf("556");
        //System.out.println(book.charAt(testVariable));
        for (int i = 0; i < words.length; ++i) {
            int position = Integer.valueOf(words[i]);
            //System.out.println(book.charAt(position + lastposition));
            decryptedText += book.charAt(position + lastPosition);
            lastPosition = position + lastPosition;
        }

        return decryptedText;
    }
}
