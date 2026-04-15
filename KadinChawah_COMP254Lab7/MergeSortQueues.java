// Kadin Chawah
// Data Structures and Algorithms
// Lab 7

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortQueues {

    // merge two sorted queues
    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }

        while (!q1.isEmpty()) {
            result.add(q1.poll());
        }

        while (!q2.isEmpty()) {
            result.add(q2.poll());
        }

        return result;
    }

    // bottom-up merge sort
    public static Queue<Integer> mergeSort(Queue<Integer> input) {
        Queue<Queue<Integer>> queueOfQueues = new LinkedList<>();

        // put each element into its own queue...
        while (!input.isEmpty()) {
            Queue<Integer> single = new LinkedList<>();
            single.add(input.poll());
            queueOfQueues.add(single);
        }

        // ...then merge the pairs
        while (queueOfQueues.size() > 1) {
            Queue<Integer> q1 = queueOfQueues.poll();
            Queue<Integer> q2 = queueOfQueues.poll();

            Queue<Integer> merged = merge(q1, q2);
            queueOfQueues.add(merged);
        }

        return queueOfQueues.poll();
    }
}