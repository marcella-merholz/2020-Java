package at.dcv.marcella;

import java.util.Arrays;
import java.util.Random;

public class KW44_Day01_Holiday_Wichteln {

    private static Random random = new Random();

    public static void wichteln() {
        String[] names = {"Anna", "Lisa", "Robert", "Peter", "Lucie", "Sarah", "Tom", "Paul"};
        String[] randomNames = new String[names.length / 2];
        if (names.length % 2 != 0) {
            System.out.println("Die Anzahl der Teilnehmenden ist ungerade. Eine Person bleibt übrig.");
        }
        for (int i = 0; i <= names.length / 2 - 1; i++) {
                int randomPosition = random.nextInt(names.length / 2);
                randomNames[i] = names[randomPosition];
        }
        System.out.println(Arrays.toString(randomNames));
    }

    /*    String[] randomNames = getRandomNames(names);
        System.out.println(Arrays.toString(randomNames));

    }

    private static String[] getRandomNames(String[] names) {
        for (int i = 0; i <= names.length/2; i++) {
            names[i] = names[random.nextInt(names.length/2)];
            }
        System.out.println(Arrays.toString(names));
        return getRandomNames(names);
    }
*/

}
