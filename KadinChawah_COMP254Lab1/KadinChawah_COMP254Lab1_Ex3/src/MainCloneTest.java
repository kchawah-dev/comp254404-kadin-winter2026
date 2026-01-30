// COMP254 Lab 1 - Exercise 3
// Code by Kadin Chawah

public class MainCloneTest {  // Runs and tests the clone method

    public static void main(String[] args) {

        System.out.println("Kadin Chawah - COMP254 Lab 1, Exercise 3 (Clone Test)");

        CircularlyLinkedList<Integer> original = new CircularlyLinkedList<>();
        original.addLast(10);
        original.addLast(20);
        original.addLast(30);

        CircularlyLinkedList<Integer> cloned = original.clone();  // Copies the list

        System.out.print("original list: ");
        original.printList();

        System.out.print("cloned list: ");
        cloned.printList();
    }
}