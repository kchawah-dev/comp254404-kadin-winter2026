// Lab 5, Exercise 3
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex3;

import java.util.ArrayList;

public class HeapPriorityQueue {
    private ArrayList<Integer> heap = new ArrayList<>();

    public void insert(int value) {
        heap.add(value);
        upheap(heap.size() - 1);
    }

    
    // The below method Kadin will explain after testing Exercise 3. ************************************************************************
    
    private void upheap(int i) {
        if (i == 0) return;

        int parent = (i - 1) / 2;

        if (heap.get(i) < heap.get(parent)) {
            // swap
            int temp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, temp);

            // recursive call
            upheap(parent);
        }
    }
    
    // The above method Kadin will explain after testing Exercise 3. ************************************************************************

    public void printHeap() {
        System.out.println(heap);
    }
}