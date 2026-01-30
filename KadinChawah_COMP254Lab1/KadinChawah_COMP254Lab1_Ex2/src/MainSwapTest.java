// COMP254 Lab 1 - Exercise 2
// Code by Kadin Chawah

public class MainSwapTest {  // Runs and tests the swapNodes method

    public static void main(String[] args) {

        System.out.println("Kadin Chawah - COMP254 Lab 1, Exercise 2 (swapNodes Test)");

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        SinglyLinkedList.Node<Integer> node1 = list.getHead().getNext();         // Second node
        SinglyLinkedList.Node<Integer> node2 = node1.getNext().getNext();       // Fourth node

        System.out.print("before swap: ");
        list.printList();

        list.swapNodes(node1, node2);  // Swaps the selected nodes

        System.out.print("after swap: ");
        list.printList();
    }
}