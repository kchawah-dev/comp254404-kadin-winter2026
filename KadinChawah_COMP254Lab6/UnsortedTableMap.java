// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.ArrayList;

public class UnsortedTableMap<K, V> extends AbstractMap<K, V> {

    private ArrayList<MapEntry<K, V>> table = new ArrayList<>();

    public int size() { return table.size(); }

    public V get(K key) {
        for (MapEntry<K, V> e : table)
            if (e.getKey().equals(key))
                return e.getValue();
        return null;
    }

    public V put(K key, V value) {
        for (MapEntry<K, V> e : table)
            if (e.getKey().equals(key))
                return e.setValue(value);
        table.add(new MapEntry<>(key, value));
        return null;
    }

    public V remove(K key) {
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).getKey().equals(key)) {
                return table.remove(i).getValue();
            }
        }
        return null;
    }

    public Iterable<Entry<K, V>> entrySet() {
        return new ArrayList<>(table);
    }
}