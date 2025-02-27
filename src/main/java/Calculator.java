public class Calculator {
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static double power(double x, double y) {
        return Math.pow(x, y);
    }
    public static void main(String[] args) {
        System.out.println("Calculator is running...");
    }
}

