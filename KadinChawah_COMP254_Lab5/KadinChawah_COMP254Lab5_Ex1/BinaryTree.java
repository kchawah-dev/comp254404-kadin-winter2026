// Lab 5, Exercise 1
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex1;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }


    // The below method Kadin will explain after testing Exercise 1. ************************************************************************
    
    public TreeNode inorderNext(TreeNode p) {
        if (p == null) return null;

        // case 1: right subtree exists
        if (p.right != null) {
            return leftMost(p.right);
        }

        // case 2: go up until node is left child
        TreeNode parent = p.parent;
        while (parent != null && p == parent.right) {
            p = parent;
            parent = parent.parent;
        }
        return parent;
    }
    
    // The below method Kadin will explain after testing Exercise 1. ************************************************************************

    private TreeNode leftMost(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}