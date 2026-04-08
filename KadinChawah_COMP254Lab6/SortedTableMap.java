// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.ArrayList;

public class SortedTableMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    private ArrayList<MapEntry<K, V>> table = new ArrayList<>();

    private int findIndex(K key, int low, int high) {
        if (high < low) return low;
        int mid = (low + high) / 2;
        int comp = key.compareTo(table.get(mid).getKey());
        if (comp == 0) return mid;
        else if (comp < 0)
            return findIndex(key, low, mid - 1);
        else
            return findIndex(key, mid + 1, high);
    }

    public int size() { return table.size(); }

    public V get(K key) {
        int j = findIndex(key, 0, size() - 1);
        if (j == size() || !table.get(j).getKey().equals(key))
            return null;
        return table.get(j).getValue();
    }

    public V put(K key, V value) {
        int j = findIndex(key, 0, size() - 1);
        if (j < size() && table.get(j).getKey().equals(key))
            return table.get(j).setValue(value);
        table.add(j, new MapEntry<>(key, value));
        return null;
    }

    public V remove(K key) {
        int j = findIndex(key, 0, size() - 1);
        if (j == size() || !table.get(j).getKey().equals(key))
            return null;
        return table.remove(j).getValue();
    }

    public boolean containsKey(K key) {
        int j = findIndex(key, 0, size() - 1);
        return (j < size() && table.get(j).getKey().equals(key));
    }

    public Iterable<Entry<K, V>> entrySet() {
        return new ArrayList<>(table);
    }
}