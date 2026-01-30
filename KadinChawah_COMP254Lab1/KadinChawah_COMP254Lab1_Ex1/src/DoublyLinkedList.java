// COMP254 Lab 1 - Exercise 1
// Code by Kadin Chawah

public class DoublyLinkedList<E> {  // Represents a generic doubly linked list

    private static class Node<E> {  // Represents a node with links in both directions
        E element;                 // Stores the value in this node
        Node<E> prev;             // Points to the previous node
        Node<E> next;             // Points to the next node

        public Node(E e, Node<E> p, Node<E> n) {  // Creates a node with its value and connections
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() { return element; }  // Returns the stored value
        public Node<E> getPrev() { return prev; }  // Returns the previous node
        public Node<E> getNext() { return next; }  // Returns the next node

        public void setPrev(Node<E> p) { prev = p; }  // Updates the previous reference
        public void setNext(Node<E> n) { next = n; }  // Updates the next reference
    }

    private Node<E> header;   // Sentinel node before the first element
    private Node<E> trailer;  // Sentinel node after the last element
    private int size = 0;     // Tracks how many elements are in the list

    public DoublyLinkedList() {  // Builds an empty list using header and trailer
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() { return size; }  // Returns the number of elements

    public boolean isEmpty() { return size == 0; }  // Checks if the list is empty

    public void addLast(E e) {  // Adds a new element to the end of the list
        Node<E> newNode = new Node<>(e, trailer.getPrev(), trailer);
        trailer.getPrev().setNext(newNode);
        trailer.setPrev(newNode);
        size++;
    }

    public void printList() {  // Prints all elements from start to end
        Node<E> curr = header.getNext();
        while (curr != trailer) {
            System.out.print(curr.getElement() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public void concatenate(DoublyLinkedList<E> other) {  // Attaches another list to this one
        if (other.isEmpty()) return;

        Node<E> thisLast = this.trailer.getPrev();       // Last node of this list
        Node<E> otherFirst = other.header.getNext();    // First node of the other list
        Node<E> otherLast = other.trailer.getPrev();    // Last node of the other list

        thisLast.setNext(otherFirst);       // Connect this list to the other list
        otherFirst.setPrev(thisLast);

        this.trailer.setPrev(otherLast);    // Update trailer to the new last node
        otherLast.setNext(this.trailer);

        size += other.size;                 // Update total size
    }
}