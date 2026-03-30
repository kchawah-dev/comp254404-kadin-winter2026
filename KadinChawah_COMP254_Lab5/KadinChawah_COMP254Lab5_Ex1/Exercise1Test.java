// Lab 5, Exercise 1
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex1;

public class Exercise1Test {
    public static void main(String[] args) {
        // this is building the tree manually
        TreeNode root = new TreeNode(10);
        TreeNode n5 = new TreeNode(5);
        TreeNode n15 = new TreeNode(15);

        root.left = n5;
        root.right = n15;
        n5.parent = root;
        n15.parent = root;

        BinaryTree tree = new BinaryTree(root);

        TreeNode next = tree.inorderNext(n5);
        if (next != null)
            System.out.println("Next of 5: " + next.value);
        else
            System.out.println("No next node");
    }
}