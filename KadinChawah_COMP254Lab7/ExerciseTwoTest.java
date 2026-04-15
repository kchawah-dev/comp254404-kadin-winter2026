// Kadin Chawah
// Data Structures and Algorithms
// Lab 7

import java.util.LinkedList;
import java.util.Queue;

public class ExerciseTwoTest {

    public static void main(String[] args) {

        Queue<Integer> input = new LinkedList<>();

        // add test data
        input.add(5);
        input.add(2);
        input.add(9);
        input.add(1);
        input.add(6);
        input.add(3);

        System.out.println("Original Queue: " + input);

        Queue<Integer> sorted = MergeSortQueues.mergeSort(input);

        System.out.println("Sorted Queue: " + sorted);
    }
}