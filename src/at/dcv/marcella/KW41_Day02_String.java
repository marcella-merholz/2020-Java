package at.dcv.marcella;

public class KW41_Day02_String {

    public static void string() {

        String helloWorld = "Hello World! ";

        System.out.println("\"" + helloWorld + "\".charAt(1) returns " + helloWorld.charAt(0));
        System.out.println();

        System.out.println("\".compareTo(Apfelsaft)\" returns " + helloWorld.compareTo("Apfelsaft"));
        System.out.println("\".compareTo(Orangensaft)\" returns " + helloWorld.compareTo("Orangensaft"));
        System.out.println("\".compareTo(Hello World!)\" returns " + helloWorld.compareTo("Hello World!"));
        System.out.println();

        System.out.println("\".compareTo(HELLO WORLD!)\" returns " + helloWorld.compareTo("HELLO WORLD"));
        System.out.println("\".compareToIgnoreCase(HELLO WORLD!)\" returns " + helloWorld.compareToIgnoreCase("HELLO WORLD"));
        System.out.println();

        System.out.println("\".equals(Apfelsaft)\" returns " + helloWorld.equals("Apfelsaft"));
        System.out.println("\".equals(Orangensaft)\" returns " + helloWorld.equals("Orangensaft"));
        System.out.println("\".equals(Hello World! )\" returns " + helloWorld.equals("Hello World! "));
        System.out.println();

        System.out.println("\"" + helloWorld + "\".concat(" + helloWorld + ")\" returns " + helloWorld.concat(helloWorld));
        System.out.println();

        System.out.println("\"" + helloWorld + "\".contains(Apfelsaft)\" returns " + helloWorld.contains("Apfelsaft"));
        System.out.println("\"" + helloWorld + "\".contains(Worl)\" returns " + helloWorld.contains("Worl"));
        System.out.println();

        System.out.println("\"" + helloWorld + ".startsWith(Hell)\" returns " + helloWorld.startsWith("Hell"));
        System.out.println("\"" + helloWorld + ".endsWith(ld)\" returns " + helloWorld.endsWith("ld"));
        System.out.println();

        System.out.printf("%5d%n", 100); // ordnet auf Dezimalstellen
        System.out.printf("%05d%n", 100);

        String myFormatedString = String.format("%05d%n", 100); // String.format bezieht sich nicht auf konkreten String (wie Beispiel "hello World"), sondern auf String-Klasse
        System.out.print(myFormatedString);
        System.out.println();

        System.out.println("\"" + helloWorld + ".indexOf(e)\" returns " + helloWorld.indexOf("e"));
        System.out.println("\"" + helloWorld + ".indexOf(o)\" returns " + helloWorld.indexOf("o")); // indexOf gibt immer nur den ersten Treffer aus
        System.out.println("\"" + helloWorld + ".indexOf(o, 6)\" returns " + helloWorld.indexOf("o", 6)); // fängst ab Position 6 an wieder zu suchen
        System.out.println();

        System.out.println("\"" + helloWorld + ".lastIndexOf(o)\" returns " + helloWorld.lastIndexOf("o"));
        System.out.println();

        String blanks = "             ";
        System.out.println("\"" + blanks + "\" isBlank() " + blanks.isBlank());
        System.out.println("\"" + blanks + "\" isEmpty() " + blanks.isEmpty());
        System.out.println("\"\" isEmpty() " + "".isEmpty());
        System.out.println();

        System.out.println("\"" + helloWorld + ".length()\" returns " + helloWorld.length());
        System.out.println();

        System.out.println("\"" + helloWorld + ".repeat(3)\" returns " + helloWorld.repeat(3));
        System.out.println();

        System.out.println(helloWorld.replaceAll("World", "Gyula"));
        System.out.println(helloWorld.replaceAll(" World", ""));
        String textForReplace = "irgend ein   Text";
        System.out.println(textForReplace);
        System.out.println(textForReplace.replaceAll(" ", "-"));
        System.out.println(textForReplace.replaceAll("[ ]+", " "));
        System.out.println(textForReplace.replaceAll("[aeiouAEIOU]", "#"));
        System.out.println(textForReplace.replaceAll("[a-z]", "#"));
        System.out.println(textForReplace.replaceAll("Text", "Fisch"));
        System.out.println();
        String deutscheSprache = "Ä Ö Ü ä ö ü ß"; // siehe "regular expressions"
        System.out.println(deutscheSprache
            .replaceAll("[Ä]", "Ae")
            .replaceAll("[Ö]", "Oe")
            .replaceAll("[Ü]", "Ue")
            .replaceAll("[ä]", "ae")
            .replaceAll("[ö]", "oe")
            .replaceAll("[ü]", "ue")
            .replaceAll("[ß]", "ss")
        );
        System.out.println();
        // prüft Postleitzahl mit .matches
        String testPLZ1 = "1234";
        String testPLZ2 = "234";
        String testPLZ3 = "123456";
        String testPLZ4 = "1aaa";
        System.out.println(testPLZ1 + " is a valid postal code? " + testPLZ1.matches("[1-9][0-9]{3}")); // die erste Ziffer muss zwischen 1 und 9 liegen, die folgenden 3 zwischen 0 und 9
        System.out.println(testPLZ2 + " is a valid postal code? " + testPLZ2.matches("[1-9][0-9]{3}"));
        System.out.println(testPLZ3 + " is a valid postal code? " + testPLZ3.matches("[1-9][0-9]{3}"));
        System.out.println(testPLZ4 + " is a valid postal code? " + testPLZ4.matches("[1-9][0-9]{3}"));
        System.out.println();
        String iban = "AT49 1420 0200 1066 1782";
        System.out.println(iban + " is a valid iban code? " + iban.matches("[A-Z]{2}[0-9]{2}(?:[ ][0-9]{4}){4}")); // ?: damit durch die () in der () kein match im match erstellt wird
        // regex test websiten; zB regex101.com
        System.out.println();
        String whiteSpaces = " Apf elsaft   ";
        System.out.println("\"" + whiteSpaces + ".strip()\" returns #" + whiteSpaces.strip() + "#");
        System.out.println("\"" + whiteSpaces + ".stripLeading()\" returns #" + whiteSpaces.stripLeading() + "#");
        System.out.println("\"" + whiteSpaces + ".stripTrailing()\" returns #" + whiteSpaces.stripTrailing() + "#");
        System.out.println("\"" + whiteSpaces + ".trim()\" returns #" + whiteSpaces.trim() + "#");
        System.out.println();
        System.out.println("\"" + helloWorld + ".substring(4)\" returns " + helloWorld.substring(4));
        System.out.println("\"" + helloWorld + ".substring(4, 7)\" returns " + helloWorld.substring(4, 7));


        System.out.println();
        String[] words = helloWorld.split(" ");
        System.out.println("Split auf Words: ");
        for (String oneWord : words) {
            System.out.println(oneWord);
        }


    }
}
