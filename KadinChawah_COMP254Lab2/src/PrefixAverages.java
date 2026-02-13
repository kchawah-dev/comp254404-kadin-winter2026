// COMP254 Lab 2 - Exercise 2
// Code by Kadin Chawah

public class PrefixAverages {

    // O(n^2) prefix average algorithm
    public static double[] prefixAverage1(double[] x) {
        int n = x.length;
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            double total = 0;
            for (int j = 0; j <= i; j++) {
                total += x[j];
            }
            a[i] = total / (i + 1);
        }
        return a;
    }

    // O(n) prefix average algorithm
    public static double[] prefixAverage2(double[] x) {
        int n = x.length;
        double[] a = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            total += x[i];
            a[i] = total / (i + 1);
        }
        return a;
    }
}