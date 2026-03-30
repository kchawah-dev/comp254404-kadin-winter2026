// An above note: This is a copy of file of the same name
// from Exercise 1. This is necessary for 
// TreeHeight.java to work in this Exercise.

// Lab 5, Exercise 2
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex2;

public class TreeNode {
    int value;
    TreeNode left, right, parent;

    public TreeNode(int value) {
        this.value = value;
        this.left = this.right = this.parent = null;
    }
}