// COMP254 Lab 1 - Exercise 1
// Code by Kadin Chawah

public class MainConcatTest {  // Runs and tests the concatenate method

    public static void main(String[] args) {  // Entry point of the program

        System.out.println("Kadin Chawah - COMP254 Lab 1, Exercise 1 (Concatenate Test)");

        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();  // Creates first list
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<>();  // Creates second list
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        list1.concatenate(list2);  // Joins list2 onto the end of list1

        System.out.print("Here is the concatenated list: ");
        list1.printList();         // Prints the combined list
    }
}