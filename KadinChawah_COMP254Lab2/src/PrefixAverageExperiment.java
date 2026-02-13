// COMP254 Lab 2 - Exercise 2
// Code by Kadin Chawah

import java.util.Random;

public class PrefixAverageExperiment {

    public static void main(String[] args) {

        int[] sizes = {500, 1000, 2000, 4000, 8000};

        System.out.println("Prefix Average Experimental Analysis");
        System.out.println("-----------------------------------");

        for (int n : sizes) {
            double[] data = randomDoubleArray(n);

            long start = System.nanoTime();
            PrefixAverages.prefixAverage1(data);
            long end = System.nanoTime();
            long time1 = end - start;

            start = System.nanoTime();
            PrefixAverages.prefixAverage2(data);
            end = System.nanoTime();
            long time2 = end - start;

            System.out.println("n = " + n);
            System.out.println("prefixAverage1 time: " + time1 + " ns");
            System.out.println("prefixAverage2 time: " + time2 + " ns");
            System.out.println();
        }
    }

    private static double[] randomDoubleArray(int n) {
        Random rand = new Random();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }
}