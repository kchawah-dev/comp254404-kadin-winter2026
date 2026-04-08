// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.ArrayList;

public class ChainHashMap<K, V> extends AbstractHashMap<K, V> {

    private ArrayList<UnsortedTableMap<K, V>> table;

    public ChainHashMap(int cap, double loadFactor) {
        super(cap, loadFactor);
    }

    public ChainHashMap(double loadFactor) {
        super(loadFactor);
    }

    protected void createTable() {
        table = new ArrayList<>();
        for (int i = 0; i < capacity; i++)
            table.add(null);
    }

    protected V bucketGet(int h, K k) {
        UnsortedTableMap<K, V> bucket = table.get(h);
        if (bucket == null) return null;
        return bucket.get(k);
    }

    protected V bucketPut(int h, K k, V v) {
        UnsortedTableMap<K, V> bucket = table.get(h);
        if (bucket == null) {
            bucket = new UnsortedTableMap<>();
            table.set(h, bucket);
        }
        int oldSize = bucket.size();
        V answer = bucket.put(k, v);
        n += (bucket.size() - oldSize);
        return answer;
    }

    protected V bucketRemove(int h, K k) {
        UnsortedTableMap<K, V> bucket = table.get(h);
        if (bucket == null) return null;
        int oldSize = bucket.size();
        V answer = bucket.remove(k);
        n -= (oldSize - bucket.size());
        return answer;
    }

    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        for (UnsortedTableMap<K, V> bucket : table)
            if (bucket != null)
                for (Entry<K, V> e : bucket.entrySet())
                    buffer.add(e);
        return buffer;
    }
}