// Data Structures and Algorithms
// Lab 6
// Code by Kadin Chawah

import java.util.ArrayList;
import java.util.Random;

public abstract class AbstractHashMap<K, V> extends AbstractMap<K, V> {

    protected int n = 0;
    protected int capacity;
    private int prime;
    private long scale, shift;
    protected double maxLoadFactor;

    public AbstractHashMap(int cap, int p, double loadFactor) {
        prime = p;
        capacity = cap;
        maxLoadFactor = loadFactor;
        Random rand = new Random();
        scale = rand.nextInt(prime - 1) + 1;
        shift = rand.nextInt(prime);
        createTable();
    }

    public AbstractHashMap(int cap, double loadFactor) {
        this(cap, 109345121, loadFactor);
    }

    public AbstractHashMap(double loadFactor) {
        this(17, loadFactor);
    }

    protected int hashValue(K key) {
        return (int) ((Math.abs(key.hashCode() * scale + shift) % prime) % capacity);
    }

    public int size() {
        return n;
    }

    public V get(K key) {
        return bucketGet(hashValue(key), key);
    }
    
    // Explained below in demonstration

    public V put(K key, V value) {
        V answer = bucketPut(hashValue(key), key, value);
        if (n > capacity * maxLoadFactor)
            resize(2 * capacity - 1);
        return answer;
    }
    
    // Explained above in demonstration

    public V remove(K key) {
        return bucketRemove(hashValue(key), key);
    }
    
    // Explained below in demonstration

    private void resize(int newCap) {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        for (Entry<K, V> e : entrySet())
            buffer.add(e);
        capacity = newCap;
        createTable();
        n = 0;
        for (Entry<K, V> e : buffer)
            put(e.getKey(), e.getValue());
    }
    
    // Explained above in demonstration

    protected abstract void createTable();
    protected abstract V bucketGet(int h, K k);
    protected abstract V bucketPut(int h, K k, V v);
    protected abstract V bucketRemove(int h, K k);
}