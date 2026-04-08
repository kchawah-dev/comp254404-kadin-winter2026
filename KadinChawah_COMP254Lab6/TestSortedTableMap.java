// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

public class TestSortedTableMap {
    public static void main(String[] args) {
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(10, "A");
        map.put(20, "B");

        System.out.println("Contains 10: " + map.containsKey(10));
        System.out.println("Contains 30: " + map.containsKey(30));
    }
}