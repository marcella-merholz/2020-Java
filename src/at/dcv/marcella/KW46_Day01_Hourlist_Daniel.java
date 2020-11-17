package at.dcv.marcella;

public class KW46_Day01_Hourlist_Daniel {

    public static void hourlist() {

        String[][] hourList = gethoursList();

        int[] hoursSum = calculateSum(hourList);

        int loanPerHour = 8;
        int[] salary = calculateLoan(hoursSum, loanPerHour);

        printLoan(salary);
    }

    private static void printLoan(int[] salary) {
        System.out.println("Alex bekommt " + salary[0] + "€ ausbezahlt.");
        System.out.println("Daniel bekommt " + salary[1] + "€ ausbezahlt.");
        System.out.println("Michael bekommt " + salary[2] + "€ ausbezahlt.");
    }

    private static int[] calculateLoan(int[] hoursSum, int loanPerHour) {
        int[] salary = new int[3];
        for (int i = 0; i < hoursSum.length; i++){
            salary[i] = hoursSum[i] * loanPerHour;
        }
        return salary;
    }

    private static int[] calculateSum(String[][] hourList) {
        int[] hoursSum = new int[3];
        for(String[] entry : hourList){
            String name = entry[0];
            int hours = Integer.parseInt(entry[1]);
            int hoursSumIndex = 0;
            switch(name){
                case "Alex":
                    hoursSumIndex = 0;
                    break;
                case "Daniel":
                    hoursSumIndex = 1;
                    break;
                case "Michael":
                    hoursSumIndex = 2;
                    break;
            }
            hoursSum[hoursSumIndex] += hours;
        }
        return hoursSum;
    }

    private static String[][] gethoursList() {
        String[][] hourList = {{"Daniel", "7"},
                {"Alex", "9"},
                {"Michael", "8"},
                {"Daniel", "5"},
                {"Daniel", "3"},
                {"Alex", "7"},
                {"Michael", "6"},
                {"Alex", "4"},
                {"Michael", "5"}};
        return hourList;
    }
}


