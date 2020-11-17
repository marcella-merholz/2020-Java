package at.dcv.marcella;

import java.util.Arrays;

public class KW46_Day01_Hourlist_Marcella {

    public static void hourList() {
        // Daniel: 7
        // Alex: 9
        // Michael: 8
        // Daniel: 5
        // Daniel: 3
        // Alex: 7
        // Michael: 6
        // Alex: 4
        // Michael: 5
        // 8.00 Euro / Stunde
        // was hat jeder Mitarbeiter verdient?

        String[][] hourList = {
                {"Daniel", "7"},
                {"Alex", "9"},
                {"Michael", "8"},
                {"Daniel", "5"},
                {"Daniel", "3"},
                {"Alex", "7"},
                {"Michael", "6"},
                {"Alex", "4"},
                {"Michael", "5"}};

        int[] sumHours = new int[3];
        int[] countDays = new int[3];
        String[] employee = new String[3];

        getEmployeeHoursDays(hourList, sumHours, countDays, employee);
        calcAvarage(employee, sumHours, countDays);

        int loan = 8;

        System.out.println("Daniel hat " + sumHours[0] * loan + " Euro verdient");
        System.out.println("Alex hat " + sumHours[1] * loan + " Euro verdient");
        System.out.println("Michael hat " + sumHours[2] * loan + " Euro verdient");
    }

    private static void getEmployeeHoursDays(String[][] hourList, int[] sumHours, int[] countDays, String[] employee) {
        for (int i = 0; i < hourList.length; i++) {
            if (hourList[i][0].equals("Daniel")) {
                employee[0] = "Daniel";
                sumHours[0] += Integer.parseInt(hourList[i][1]);
                countDays[0] += 1;
            } else if (hourList[i][0].equals("Alex")) {
                employee[1] = "Alex";
                sumHours[1] += Integer.parseInt(hourList[i][1]);
                countDays[1] += 1;
            } else if (hourList[i][0].equals("Michael")) {
                employee[2] = "Michael";
                sumHours[2] += Integer.parseInt(hourList[i][1]);
                countDays[2] += 1;
            }
        }
    }

    public static void calcAvarage(String[] employee, int[] sumHours, int[] countDays) {
        for (int i = 0; i < countDays.length; i++) {
            if (countDays[i] != 0) {
                float averageHours = (float) sumHours[i] / countDays[i];
                System.out.println("Die durchschnittliche Stundenzahl von " + employee[i] + " sind " + String.format("%.2f", averageHours) + " Stunden.");
            }
        }
    }


}
