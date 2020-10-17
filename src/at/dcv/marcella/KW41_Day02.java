package at.dcv.marcella;

public class KW41_Day02 {

    public static void faktorial() {
        int param = 5;
        System.out.println("" + param + " ! = " + faktRecursion(param));
    }

    public static long faktRecursion(int n) {
        // System.out.println("fakt(" + n + ") begin");
        long result = 1;
        if (n > 1) {
            result = n * faktRecursion(n - 1);
        }
        // System.out.println("fakt(" + n + ") end");
        return result;
    }

    public static void faktWithoutRecursion(int n) {
        long result = n;
        for (long i = n; i > 1; --i) {
              result *= (i - 1);
        }
        System.out.println(result);
    }

    public static long fakt2(int n) {
        long result = 1;
        for (int i = 1; i <= n; ++i) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }




}
