package at.dcv.marcella;

import java.util.Random;

public class KW43_Day01 {

    public static void currencyCalcResult() {
        double euro = 10.00;
        double exchangeRateUS = 1.18;
        double exchangeRateCHF = 1.07;

        System.out.println(euro + " Euro = " + currencyCalc(euro, exchangeRateCHF) + " Schweizer Franken" );
        System.out.println(euro + " Euro = " + currencyCalc(euro, exchangeRateUS) + " US-Dollar" );
        System.out.println(euro + " Euro = " + currencyCalc(euro, "CHF"));
        System.out.println(euro + " Euro = " + currencyCalc(euro, "US"));
        System.out.println(euro + " Euro = " + currencyCalc(euro, "XY"));
    }

    public static double currencyCalc(double euro, double exchangeRate) { // wenn euro + exchangeRate übergeben wird startet diese Methode
        double result = euro * exchangeRate;
        return result;
    }

    public static double currencyCalc(double euro, String currency) { // wenn euro + currrency übergeben wird startet diese Methode
        double exchangeRate = 0.0;
        switch (currency) {
            case "CHF":
                exchangeRate = 1.07;
                break;
            case "US":
                exchangeRate = 1.17;
                break;
            default:
                System.err.println("unbekannte Währung");
                break;
        }
        return currencyCalc(euro, exchangeRate); // hier Zugriff auf die Methode (euro, exchangeRate)
    }


    public static void sumRandom () {
        int sum = 0;
        loop: while (true) {
            int ranNumber = randomNumber(10, 30); // Ausgelagerte Methode um eine Zufallszahl im Bereich zwischen den übergebenen Werten zu erhalten
            switch (ranNumber) {
                case 15:
                case 25:
                    break loop;
                default:
                    sum += ranNumber;
            }
        }
        System.out.println(sum);
    }

    /* 1. Ansatz, feste Werte, keine Übergabe
    public static int randomNumber() {
        Random ran = new Random();
        int number = ran.nextInt(20) + 10;
        System.out.println(number);
        return number;
    }
    */

    /* 2. Ansatz, variable Werte werden übergeben (definiert mit min und max)
    public static int randomNumber(int min, int max) {
        int varianz = (int) ((max - min + 1) * Math.random());
        int number = min + varianz;
        System.out.println(number);
        return number;
    }
    */

    // 3. Ansatz
    public static int randomNumber(int min, int max) {
        Random ran = new Random();
        int number = ran.nextInt(max - min + 1) + min;
        System.out.println(number);
        return number;
    }
}
