// Lab 5, Exercise 2
// Code by Kadin Chawah

package KadinChawah_COMP254Lab5_Ex2;

public class TreeHeight {

	// The below method Kadin will explain after testing Exercise 2. ************************************************************************
	
    public static int computeHeight(TreeNode node) {
        if (node == null) return -1;

        int leftHeight = computeHeight(node.left);
        int rightHeight = computeHeight(node.right);

        int height = Math.max(leftHeight, rightHeight) + 1;

        System.out.println("Node: " + node.value + " Height: " + height);

        return height;
    }
    
    // The above method Kadin will explain after testing Exercise 2. ************************************************************************
}