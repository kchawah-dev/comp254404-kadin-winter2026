// Kadin Chawah
// Data Structures and Algorithms
// Lab 7

public class ExerciseOneTest {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // insert values
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // test search
        int searchKey = 40;

        BinarySearchTree.Node result = tree.treeSearch(searchKey);

        if (result != null) {
            System.out.println("Key " + searchKey + " found in tree.");
        } else {
            System.out.println("Key " + searchKey + " NOT found.");
        }

        // test missing key
        searchKey = 100;
        result = tree.treeSearch(searchKey);

        if (result != null) {
            System.out.println("Key " + searchKey + " found in tree.");
        } else {
            System.out.println("Key " + searchKey + " NOT found.");
        }
    }
}