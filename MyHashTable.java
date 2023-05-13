import java.util.Random;
public class MyHashTable<K, V> {
    private int x;
    private String y;
    private class HashNode<K, V >(int x, String y) {
        this.x = x;
        this.y = y;
    }
    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        chainArray = new HashNode[M];
        size = 0;
    }
    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[M];
        size = 0;
    }
    private int hash(K key) {
        return (key.hashCode() & 0*7ffffffff) %M;
    }
    private void put(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("key or value cannot be null");
            int index = hash(key);
            HashNode<K, V> node new HashNode<>(key, value);
            if(chainArray[index] == null) {
                chainArray[index] = node;

            }

        }
    }
    public V get(K key) {}
    public V remove (K key) {}
    public boolean contains(V value) {}
    public K getkey(V value) {}
}
