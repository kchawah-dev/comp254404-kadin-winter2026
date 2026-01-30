// COMP254 Lab 1 - Exercise 3
// Code by Kadin Chawah

public class CircularlyLinkedList<E> {  // Represents a circular linked list

    private static class Node<E> {  // Node with a single link forming a circle
        E element;
        Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    private Node<E> tail = null;  // Tracks the last node in the circle
    private int size = 0;         // Tracks number of elements

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void addLast(E e) {  // Adds a new element to the circular list
        Node<E> newNode = new Node<>(e, null);

        if (isEmpty()) {
            newNode.setNext(newNode);  // First node points to itself
            tail = newNode;
        } else {
            newNode.setNext(tail.getNext());  // Point to first node
            tail.setNext(newNode);            // Old tail points to new node
            tail = newNode;                   // Update tail
        }

        size++;
    }

    public void printList() {  // Prints all elements once around the circle
        if (isEmpty()) return;

        Node<E> curr = tail.getNext();
        for (int i = 0; i < size; i++) {
            System.out.print(curr.getElement() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public CircularlyLinkedList<E> clone() {  // Creates a copy of the list
        CircularlyLinkedList<E> cloned = new CircularlyLinkedList<>();
        if (isEmpty()) return cloned;

        Node<E> curr = tail.getNext();
        for (int i = 0; i < size; i++) {
            cloned.addLast(curr.getElement());
            curr = curr.getNext();
        }

        return cloned;
    }
}