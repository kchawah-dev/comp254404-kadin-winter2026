package KadinChawah_COMP254Lab4_Exercise2;

import java.util.Stack;

public class StackTransfer {

    // transfers all elements from stack s to stack t
    public static <E> void transfer(Stack<E> S, Stack<E> T) {

        // keep moving elements until s is empty
        while (!S.isEmpty()) {
            T.push(S.pop()); // remove from s and add to t
        }
    }

    // test the method
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        // add elements to stack s
        S.push(1);
        S.push(2);
        S.push(3);

        // transfer elements
        transfer(S, T);

        // print stack t
        System.out.println("stack t after transfer:");
        while (!T.isEmpty()) {
            System.out.println(T.pop());
        }
    }
}