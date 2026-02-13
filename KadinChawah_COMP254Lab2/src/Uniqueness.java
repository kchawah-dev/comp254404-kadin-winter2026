// COMP254 Lab 2 - Exercise 3
// Code by Kadin Chawah

import java.util.Arrays;

public class Uniqueness {

    // O(n^2) uniqueness algorithm
    public static boolean unique1(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] == data[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // O(n log n) uniqueness algorithm
    public static boolean unique2(int[] data) {
        int[] temp = Arrays.copyOf(data, data.length);
        Arrays.sort(temp);

        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                return false;
            }
        }
        return true;
    }
}