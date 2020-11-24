package at.dcv.trainer;

import javax.swing.*;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args){
        // types - Datentypen
        // primitives - Primitive Datentypen
        byte singleByte;
        float floatingPointNumber = 1.3f;
        double doubleValue = 2.3d;
        double anotherDoubleValue = 2.3;
        int integer = 1;
        long longNumber = 4L;
        short smallNumber = 2;
        boolean bit = true;
        char character = 'a';
        // non-primitives
        String someString = "Hello Java!";
        int[] anArray = {1, 2, 3};

        // wrapper classes
        Integer.parseInt("1");
        Integer.max(1, 2);
        Double.parseDouble("1.2");
        Boolean.logicalAnd(true, false);

        // operators
        integer++;
        integer--;
        integer += 2;
        integer -= 3;
        doubleValue = 4.7 + 3.8 * -2.2 / 1.6;
        int loabate = 16 % 5; // 1
        boolean equals = 2 == 3;

        // boolean operators
        bit = !bit;
        boolean and = true && false; // false
        boolean or = true || false; // true

        // control structures - Kontrollstrukturen
        if (true) {
            // only this is computated
        } else if (true) {
            // this is skipped
        } else {

        }

        switch (integer) {
            case 2:
                System.out.println("Hey");
                break;
            case 3:
            case 4:
                System.out.println("Ho!");
                break;
            default:
                System.out.println("HeyHo!");
        }

        while (and){
            // do it
        }

        do {
           // do it
        } while (or);

        for (int counter = 0; counter < 5; counter+=2) {
            System.out.println("Counter: " + counter);
        }

        int[] array = {1,2,3};
        for (int singleValue : array) {
            System.out.println("Value: " + singleValue);
        }

        // util / helper classes
        Math.random();
        Arrays.toString(new int[]{1,2,3});
        Integer.parseInt("4");
        Arrays.copyOf(anArray, 3);
    }
}
