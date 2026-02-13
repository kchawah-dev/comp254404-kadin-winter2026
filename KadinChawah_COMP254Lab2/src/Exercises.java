// COMP254 Lab 2 - Exercise 1
// Code by Kadin Chawah

public class Exercises {

    // Time Complexity: O(n)
    // Explanation: Single loop runs n times.
    public static void example1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++;
        }
    }

    // Time Complexity: O(n^2)
    // Explanation: Two nested loops each run n times.
    public static void example2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
    }

    // Time Complexity: O(n)
    // Explanation: Loop increments by 2; still linear growth.
    public static void example3(int n) {
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum++;
        }
    }

    // Time Complexity: O(n^3)
    // Explanation: Three nested loops each run n times.
    public static void example4(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum++;
                }
            }
        }
    }

    // Time Complexity: O(log n)
    // Explanation: n is divided by 2 each iteration.
    public static void example5(int n) {
        int sum = 0;
        while (n > 1) {
            n /= 2;
            sum++;
        }
    }
    
    public static void main(String[] args) {

        System.out.println("Running example1 with n = 1000");
        example1(1000);

        System.out.println("Running example2 with n = 1000");
        example2(1000);

        System.out.println("Running example3 with n = 1000");
        example3(1000);

        System.out.println("Running example4 with n = 100");
        example4(100);

        System.out.println("Running example5 with n = 1000");
        example5(1000);

        System.out.println("All Exercise 1 methods executed.");
    }
}