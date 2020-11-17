package at.dcv.marcella;

import java.util.Arrays;

public class KW47_Day01_BudgetFK19 {

    public static void budgetFK19() {

        String[][] budgetFK19 = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\offenerhaushalt_fk_2019.csv", ";");
        System.out.println(budgetFK19.length);

        String[][] clearBudget = getClearBudget(budgetFK19);
        System.out.println(clearBudget.length);

        int sumFK19 = getSumClearBudget(clearBudget);
        System.out.println(sumFK19);

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




}
