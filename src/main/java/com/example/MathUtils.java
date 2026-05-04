package com.example;

public class MathUtils {

    // 1. perimeter
    public static int perimeter(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return 2 * (a + b);
    }

    // 2. area
    public static int area(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return a * b;
    }

    // 3. solve quadratic
    public static String solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) return "No solution";
            return "One root";
        }

        double delta = b*b - 4*a*c;

        if (delta < 0) return "No real roots";
        if (delta == 0) return "Double root";
        return "Two roots";
    }

    // 4. days in month
    public static int daysInMonth(int month, int year) {
        if (month < 1 || month > 12) throw new IllegalArgumentException();

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    return 29;
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    // 5. prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 6. alternating sum
    public static int sumAlternating(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sum -= i;
            else sum += i;
        }
        return sum;
    }

    // 7. gcd
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException();
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 8. factorial
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    // sum factorial
    public static int sumFactorial(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}