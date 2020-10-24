package at.dcv.marcella;

import java.util.Random;

public class KW43_Day01 {

    public static void currencyCalcResult() {
        double euro = 10.00;
        double exchangeRateUS = 1.18;
        double exchangeRateCHF = 1.07;

        System.out.println(euro + " Euro = " + currencyCalc(euro, exchangeRateCHF) + " Schweizer Franken" );
        System.out.println(euro + " Euro = " + currencyCalc(euro, exchangeRateUS) + " US-Dollar" );
        System.out.println(currencyCalc(euro, "CHF"));
        System.out.println(currencyCalc(euro, "US"));
        System.out.println(currencyCalc(euro, "XY"));
    }

    public static double currencyCalc(double euro, String currency) {
        double exchangeRate = 0.0;
        switch (currency) {
            case "CHF":
                exchangeRate = 1.07;
            case "US":
                exchangeRate = 1.17;
            default:
                System.err.println("unbekannte Währung");
        }
        return currencyCalc(euro, exchangeRate);
    }

    public static double currencyCalc(double euro, double exchangeRate) {
        double result = euro * exchangeRate;
        return result;
    }


    public static void sumRandom () {
        int sum = 0;
        loop: while (true) {
            int ranNumber = randomNumber(10, 30);
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

    /*
    public static int randomNumber() {
        Random ran = new Random();
        int number = ran.nextInt(20) + 10;
        System.out.println(number);
        return number;
    }
    */

    /*
    public static int randomNumber(int min, int max) {
        int varianz = (int) ((max - min + 1) * Math.random());
        int number = min + varianz;
        System.out.println(number);
        return number;
    }
    */

    public static int randomNumber(int min, int max) {
        Random ran = new Random();
        int number = ran.nextInt(max - min + 1) + min;
        System.out.println(number);
        return number;
    }
}
