// Lab 5, Exercise 2
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex2;

public class Exercise2Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n5 = new TreeNode(5);
        TreeNode n15 = new TreeNode(15);
        TreeNode n3 = new TreeNode(3);

        root.left = n5;
        root.right = n15;
        n5.left = n3;

        TreeHeight.computeHeight(root);
    }
}