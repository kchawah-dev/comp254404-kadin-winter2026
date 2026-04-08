// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.Iterator;

public interface SimpleMap<K, V> {
    int size();
    boolean isEmpty();
    V get(K key);
    V put(K key, V value);
    V remove(K key);
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<Entry<K, V>> entrySet();

    interface Entry<K, V> {
        K getKey();
        V getValue();
    }
}