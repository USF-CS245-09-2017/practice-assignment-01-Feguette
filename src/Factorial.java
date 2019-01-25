public class Factorial {

    public int factorial(int n, String type) {
        if (type.equalsIgnoreCase("iterative")) {
            return factIterative(n);
        }
        if (type.equalsIgnoreCase("recursive")) {
            return factRecursive(n);
        }
        return -1;
    }

    public static int factIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n*factRecursive(n-1);
    }
}
