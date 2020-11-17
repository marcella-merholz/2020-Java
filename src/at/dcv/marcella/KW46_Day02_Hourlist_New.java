package at.dcv.marcella; // in eigenes package umwandeln

import java.util.Arrays;

public class KW46_Day02_Hourlist_New {

    public static void hourList() {

        String[][] hourList = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\Stunden.csv", ",");
        for (int i = 0; i < hourList.length; i++) {
            System.out.println(Arrays.toString(hourList[i]));
        }

        int employeeNumber = countEmployees(hourList);
        int[] sumHours = new int[employeeNumber];
        int[] countDays = new int[employeeNumber];
        String[] employee = new String[employeeNumber];

        getEmployeeHoursDays(hourList, sumHours, countDays, employee);
        calcLoan(employee, sumHours);
        calcAvarage(employee, sumHours, countDays);
    }

    private static int countEmployees(String[][] hourList) {
        int counterEmployees = 0;
        String everyemployee = "#";

        for (int i = 1; i < hourList.length; i++) {
            if (everyemployee.indexOf("#" + hourList[i][0] + "#") < 0){ // < 0 bedeutet, daß es nicht im String everyEmployee vorkommt.
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
            while (i < employee.length && !found){
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

    public static void printResults() {

    }

}
