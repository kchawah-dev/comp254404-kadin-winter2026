// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.ArrayList;

public abstract class AbstractMap<K, V> implements SimpleMap<K, V> {

    protected static class MapEntry<K, V> implements Entry<K, V> {
        private K k;
        private V v;

        public MapEntry(K key, V value) {
            k = key;
            v = value;
        }

        public K getKey() { return k; }
        public V getValue() { return v; }

        protected void setKey(K key) { k = key; }
        protected V setValue(V value) {
            V old = v;
            v = value;
            return old;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterable<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();
        for (Entry<K, V> e : entrySet())
            keys.add(e.getKey());
        return keys;
    }

    public Iterable<V> values() {
        ArrayList<V> values = new ArrayList<>();
        for (Entry<K, V> e : entrySet())
            values.add(e.getValue());
        return values;
    }
}