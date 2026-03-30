// Lab 5, Exercise 3
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex3;

public class Exercise3Test {
    public static void main(String[] args) {
        HeapPriorityQueue pq = new HeapPriorityQueue();

        pq.insert(20);
        pq.insert(5);
        pq.insert(15);
        pq.insert(2);

        pq.printHeap();
    }
}