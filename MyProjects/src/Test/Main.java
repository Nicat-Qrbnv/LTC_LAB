package Test;

import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 3; // Change n to see the performance impact
        System.out.println("Fibonacci using Recursion: " + fibonacci(n));
    }
}
