// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.Random;

// test file for Exercise 1
 
public class TestLoadFactorMaps {
    public static void main(String[] args) {
        ChainHashMap<Integer, Integer> map = new ChainHashMap<>(0.5);
        Random rand = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            int key = rand.nextInt(100000);
            map.put(key, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time with load factor 0.5: " + (end - start) + " ms");
    }
}