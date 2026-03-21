// COMP254 Lab 4 - Exercise 1
// Code by Kadin Chawah
package KadinChawah_COMP254Lab4_Exercise1;

//represents a position holding an element
interface Position<E> {
 E getElement();
}

//positional list interface
interface PositionalList<E> {
 Position<E> first();
 Position<E> after(Position<E> p);
 Position<E> addFirst(E e);
 Position<E> addLast(E e);
 int indexOf(Position<E> p);
}

//linked list implementation
public class LinkedPositionalList<E> implements PositionalList<E> {

 // node class representing each element
 private static class Node<E> implements Position<E> {
     private E element;
     private Node<E> next;

     public Node(E e, Node<E> n) {
         element = e;
         next = n;
     }

     public E getElement() {
         return element;
     }
 }

 private Node<E> head = null;

 // returns first position in the list
 public Position<E> first() {
     return head;
 }

 // returns the position after p
 public Position<E> after(Position<E> p) {
     Node<E> node = (Node<E>) p;
     return node.next;
 }

 // adds element at the beginning
 public Position<E> addFirst(E e) {
     head = new Node<>(e, head);
     return head;
 }

 // adds element at the end
 public Position<E> addLast(E e) {
     if (head == null) return addFirst(e);

     Node<E> current = head;

     // traverse to last node
     while (current.next != null)
         current = current.next;

     current.next = new Node<>(e, null);
     return current.next;
 }

 // finds the index of a given position
 public int indexOf(Position<E> p) {
     int index = 0;
     Position<E> current = first();

     // traverse list until we find p
     while (current != null) {
         if (current == p)
             return index;

         current = after(current);
         index++;
     }

     return -1; // not found
 }

 // test the method
 public static void main(String[] args) {
     LinkedPositionalList<Integer> list = new LinkedPositionalList<>();

     Position<Integer> p1 = list.addFirst(10);
     Position<Integer> p2 = list.addLast(20);
     Position<Integer> p3 = list.addLast(30);

     System.out.println("index of 10: " + list.indexOf(p1));
     System.out.println("index of 20: " + list.indexOf(p2));
     System.out.println("index of 30: " + list.indexOf(p3));
 }
}
