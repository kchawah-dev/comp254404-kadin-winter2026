// COMP254 Lab 2 - Exercise 3
// Code by Kadin Chawah

import java.util.Random;

public class UniquenessExperiment {

    public static void main(String[] args) {

        System.out.println("Uniqueness Algorithm Runtime Analysis");
        System.out.println("------------------------------------");

        testUnique1();
        testUnique2();
    }

    private static void testUnique1() {
        int n = 1000;

        while (n <= 100000) {   // Prevent infinite growth
            int[] data = randomIntArray(n);

            long start = System.currentTimeMillis();
            Uniqueness.unique1(data);
            long end = System.currentTimeMillis();

            long time = end - start;

            System.out.println("unique1 n = " + n + " time = " + time + " ms");

            if (time > 60000) {
                System.out.println("Exceeded 1 minute at n = " + n);
                break;
            }

            n += 5000;   // Increase gradually instead of doubling
        }
    }

    private static void testUnique2() {
        int n = 1000;

        while (true) {
            int[] data = randomIntArray(n);

            long start = System.currentTimeMillis();
            Uniqueness.unique2(data);
            long end = System.currentTimeMillis();

            if (end - start > 60_000) {
                System.out.println("unique2 max n (<= 1 minute): " + (n / 2));
                break;
            }
            n *= 2;
        }
    }

    private static int[] randomIntArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }
}