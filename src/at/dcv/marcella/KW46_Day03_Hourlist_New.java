package at.dcv.marcella;

import java.util.Arrays;

public class KW46_Day03_Hourlist_New {

    public static void hourList() {

        String[][] hourList = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\Stunden.csv", ",");

        String[][] clearHourlist = getClearHourlist(hourList);

        int employeeNumber = countEmployees(clearHourlist);
        int[] sumHours = new int[employeeNumber];
        int[] countDays = new int[employeeNumber];
        String[] employee = new String[employeeNumber];

        getEmployeeHoursDays(clearHourlist, sumHours, countDays, employee);

        calcLoan(employee, sumHours);

        calcAvarage(employee, sumHours, countDays);

    }

    private static String[][] getClearHourlist(String[][] hourList) {
        int clearHourlistLength = hourList.length;
        for (int i = 0; i < hourList.length; i++) {
            boolean isValid = isValid(hourList[i][1]);
            if (!isValid) {
                System.out.println(hourList[i][1] + " ist keine gültige Eingabe");
                hourList[i][1] = "x";
                clearHourlistLength--;
            }
        }

        String[][] clearHourlist = new String[clearHourlistLength][2];
        int clearHourlistIndex = 0;
        for (int i = 0; i < hourList.length; i++) {
            if (hourList[i][1] != "x") {
                clearHourlist[clearHourlistIndex] = hourList[i];
                clearHourlistIndex++;
            }
        }
        return clearHourlist;
    }

    public static boolean isValid(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException nfe) { // only allow integer values
            return false;
        }
    }

    private static int countEmployees(String[][] hourList) {
        int counterEmployees = 0;
        String everyemployee = "#";

        for (int i = 1; i < hourList.length; i++) {
            if (everyemployee.indexOf("#" + hourList[i][0] + "#") < 0) { // < 0 bedeutet, daß es nicht im String everyEmployee vorkommt.
                everyemployee += hourList[i][0] + "#";
                counterEmployees++;
            }
        }
        System.out.println(counterEmployees);
        return counterEmployees;
    }

    private static void getEmployeeHoursDays(String[][] hourList, int[] sumHours, int[] countDays, String[] employee) {
        for (int j = 1; j < hourList.length; j++) {

            boolean found = false;
            int i = 0;
            while (i < employee.length && !found) {
                if (employee[i] == null) {
                    employee[i] = hourList[j][0];
                }
                if (employee[i].equals(hourList[j][0])) {
                    sumHours[i] += Integer.parseInt(hourList[j][1]);
                    countDays[i] += 1;
                    found = true;
                }
                ++i;
            }
        }
    }

    private static void calcLoan(String[] employee, int[] sumHours) {
        double loan = 8.00;
        for (int i = 0; i < employee.length; i++) {
            double loanPerEmployee = sumHours[i] * loan;
            System.out.println(employee[i] + " hat " + loanPerEmployee + " Euro verdient");
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
