public class Fibonacci {

    public int fibonacci(int n, String type) {
        if (type.equalsIgnoreCase("iterative")) {
            return fibIterative(n);
        }
        if (type.equalsIgnoreCase("recursive")) {
            return fibRecursive(n);
        }
        return -1;
    }

    public static int fibIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int clone1 = 0, clone2 = 1;
        for (int i = 2; i <= n; i ++) {
            if (i%2 == 0)
                clone1 += clone2;
            else
                clone2 += clone1;
        }
        return Math.max(clone1, clone2);
    }

    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n-1) + fibRecursive(n-2);
    }
}
