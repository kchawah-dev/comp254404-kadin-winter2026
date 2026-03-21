// COMP254 Lab 4 - Exercise 3
// Code by Kadin Chawah
package KadinChawah_COMP254Lab4_Exercise3;

public class LinkedQueue<E> {

    // node class for queue
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    // checks if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // adds element to the end
    public void enqueue(E e) {
        Node<E> newest = new Node<>(e, null);

        if (isEmpty())
            head = newest;
        else
            tail.next = newest;

        tail = newest;
        size++;
    }

    // removes element from front
    public E dequeue() {
        if (isEmpty()) return null;

        E answer = head.element;
        head = head.next;
        size--;

        if (isEmpty())
            tail = null;

        return answer;
    }

    // concatenates q2 to current queue in o(1) time
    public void concatenate(LinkedQueue<E> Q2) {

        // if q2 is empty, nothing to do
        if (Q2.isEmpty()) return;

        // if current queue is empty, just take q2
        if (this.isEmpty()) {
            this.head = Q2.head;
        } else {
            this.tail.next = Q2.head; // link the two queues
        }

        // update tail and size
        this.tail = Q2.tail;
        this.size += Q2.size;

        // clear q2
        Q2.head = null;
        Q2.tail = null;
        Q2.size = 0;
    }

    // test the method
    public static void main(String[] args) {
        LinkedQueue<Integer> Q1 = new LinkedQueue<>();
        LinkedQueue<Integer> Q2 = new LinkedQueue<>();

        // add elements to both queues
        Q1.enqueue(1);
        Q1.enqueue(2);

        Q2.enqueue(3);
        Q2.enqueue(4);

        // concatenate q2 into q1
        Q1.concatenate(Q2);

        // print q1
        System.out.println("q1 after concatenation:");
        while (!Q1.isEmpty()) {
            System.out.println(Q1.dequeue());
        }

        // check if q2 is empty
        System.out.println("q2 empty? " + Q2.isEmpty());
    }
}
