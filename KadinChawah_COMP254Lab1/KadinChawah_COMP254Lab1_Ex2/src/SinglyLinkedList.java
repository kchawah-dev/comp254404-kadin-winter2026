// COMP254 Lab 1 - Exercise 2
// Code by Kadin Chawah

public class SinglyLinkedList<E> {  // Represents a generic singly linked list

    public static class Node<E> {   // Represents a node with a single forward link
        E element;                 // Stores the value
        Node<E> next;             // Points to the next node

        public Node(E e, Node<E> n) {  // Creates a node with its value and next reference
            element = e;
            next = n;
        }

        public E getElement() { return element; }  // Returns the stored value
        public Node<E> getNext() { return next; }  // Returns the next node
        public void setNext(Node<E> n) { next = n; }  // Updates the next reference
    }

    private Node<E> head = null;  // First node in the list
    private Node<E> tail = null;  // Last node in the list
    private int size = 0;         // Tracks how many elements exist

    public int size() { return size; }  // Returns the list size

    public boolean isEmpty() { return size == 0; }  // Checks if the list is empty

    public void addLast(E e) {  // Adds a new element to the end
        Node<E> newNode = new Node<>(e, null);

        if (isEmpty()) {
            head = newNode;          // First element becomes the head
        } else {
            tail.setNext(newNode);  // Link previous tail to new node
        }

        tail = newNode;  // Update tail
        size++;
    }

    public void printList() {  // Prints all elements in order
        Node<E> curr = head;
        while (curr != null) {
            System.out.print(curr.getElement() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public Node<E> getHead() {  // Returns the head node
        return head;
    }

    public void swapNodes(Node<E> node1, Node<E> node2) {  // Swaps two nodes in the list
        if (node1 == node2) return;

        Node<E> prev1 = null, prev2 = null, curr = head;

        // Find the nodes that come before node1 and node2
        while (curr != null && (prev1 == null || prev2 == null)) {
            if (curr.getNext() == node1) prev1 = curr;
            if (curr.getNext() == node2) prev2 = curr;
            curr = curr.getNext();
        }

        if (prev1 != null) prev1.setNext(node2); else head = node2;
        if (prev2 != null) prev2.setNext(node1); else head = node1;

        Node<E> temp = node1.getNext();     // Swap next references
        node1.setNext(node2.getNext());
        node2.setNext(temp);
    }
}