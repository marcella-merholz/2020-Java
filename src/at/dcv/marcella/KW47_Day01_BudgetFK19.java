package at.dcv.marcella;

import java.util.Arrays;

public class KW47_Day01_BudgetFK19 {

    public static void budgetFK19() {

        String[][] budgetFK19 = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\offenerhaushalt_fk_2019.csv", ";");
        System.out.println(budgetFK19.length);

        String[][] clearBudget = getClearBudget(budgetFK19);
        System.out.println(clearBudget.length);

        int sumFK19 = getSumClearBudget(clearBudget);
        System.out.println("Die Summe aller Ausgaben beträgt: " + sumFK19 + "\n");

        String[][] sortedBudget = getSortedArray(clearBudget);
        printTopMax(sortedBudget, 10);
        printTopMin(sortedBudget, 20);

        String[] bereich = {"Volksschule", "Volksschule", "Mittelschule", "Polytechnische"};
        int anteilBereich = getAnteilBereich(clearBudget, bereich);
        getAnteilPerCent(clearBudget, bereich[2], sumFK19, anteilBereich);
        int anteilSchulen = getAnteilSchulen(clearBudget);
        int anteilKindergarten = getAnteilKindergarten(clearBudget);
    }

    private static String[][] getClearBudget(String[][] budgetFK19) {
        int clearBudgetLength = budgetFK19.length;
        for (int i = 0; i < budgetFK19.length; i++) {
            boolean isValid = isValidInt(budgetFK19[i][2]);
            int voranschlag = 0;
            if (isValid) {
                voranschlag = Integer.parseInt(budgetFK19[i][2]);
            }
            if (!isValid || voranschlag == 0) {
                budgetFK19[i][2] = "x";
                clearBudgetLength--;
            }
        }

        String[][] clearBudget = new String[clearBudgetLength][3];
        int clearBudgetIndex = 0;
        for (int i = 0; i < budgetFK19.length; i++) {
            if (budgetFK19[i][2] != "x") {
                clearBudget[clearBudgetIndex] = budgetFK19[i];
                clearBudgetIndex++;
            }
        }
        return clearBudget;
    }

    private static boolean isValidInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getSumClearBudget(String[][] budget) {
        int sumBudget = 0;
        for (int i = 0; i < budget.length; i++) {
            sumBudget += Integer.parseInt(budget[i][2]);
        }
        return sumBudget;
    }

    public static String[][] getSortedArray(String[][] arrayToSort) {
        String[][] copyArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for (int i = 0; i < copyArray.length; ++i) {
            for (int j = 0; j < copyArray.length - 1 - i; ++j) { // -i verkürzt hier den Zugriff, da die letzten Zahlen bereits sortiert sind
                if (Integer.parseInt(copyArray[j][2]) < Integer.parseInt(copyArray[j + 1][2])) {
                    String[] temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }
            }
        }
        return copyArray;
    }

    public static void printTopMax(String[][] sortedBudget, int range) {
        System.out.println("Die " + range + " höchsten Ausgaben waren: ");
        for (int i = 0; i < range; i++) {
            System.out.println(Arrays.toString(sortedBudget[i]));
        }
        System.out.println("\n");
    }

    public static void printTopMin(String[][] sortedBudget, int range) {
        System.out.println("Die " + range + " niedrigsten Ausgaben waren: ");
        for (int i = sortedBudget.length - range; i < sortedBudget.length; i++) {
            System.out.println(Arrays.toString(sortedBudget[i]));
        }
        System.out.println("\n");
    }

    private static int getAnteilBereich(String[][] clearBudget, String[] bereich) {
        int anteilBereich = 0;
        for (int i = 0; i < clearBudget.length; i++) {
            for (int j = 0; j < bereich.length; j++) {
                if (clearBudget[i][0].contains(bereich[j])) {
                    anteilBereich += Integer.parseInt(clearBudget[i][2]);
                    break;
                }
            }
        }
        System.out.println("Der Anteil der Ausgaben für den ausgewählten Bereich beträgt; " + anteilBereich);
        return anteilBereich;
    }

    private static double getAnteilPerCent(String[][] clearBudget, String bereich, int sumFK19, int anteilBereich) {
        float anteilPerCent = (anteilBereich / (float) sumFK19 * 100);
        System.out.println("Der Anteil des ausgewählten Bereiches an den gesammten Ausgaben in Prozent ist: " + String.format("%.2f", anteilPerCent) + "%.");
        return anteilPerCent;
    }

    private static int getAnteilSchulen(String[][] clearBudget) {
        int anteilSchulen = 0;
        for (int i = 0; i < clearBudget.length; i++) {
            if (clearBudget[i][0].contains("Volksschule") ||
                    clearBudget[i][0].contains("Mittelschule") ||
                    clearBudget[i][0].contains("Polytechnische")) {
                anteilSchulen += Integer.parseInt(clearBudget[i][2]);
            }
        }
        System.out.println("Der Anteil der Ausgaben für Schulen beträgt; " + anteilSchulen);
        return anteilSchulen;
    }

    private static int getAnteilKindergarten(String[][] clearBudget) {
        int anteilKindergarten = 0;
        for (int i = 0; i < clearBudget.length; i++) {
            if (clearBudget[i][0].contains("Kindergarten") ||
                    clearBudget[i][0].contains("Ganztagskindergarten")) {
                anteilKindergarten += Integer.parseInt(clearBudget[i][2]);
            }
        }
        System.out.println("Der Anteil der Ausgaben für Kindergärten beträgt: " + anteilKindergarten);
        return anteilKindergarten;
    }


}
