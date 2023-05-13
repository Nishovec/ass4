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
            else {
                HashNode<K, V> curr = chainArray[index];
                while (curr.next != null) {
                    if (curr.next.equals(key)) {
                        curr.value = value;
                        return;
                    }
                    curr = curr.next;
                }
                if (curr.key.equals(key)) {
                    curr.value = value;

                }
                else {
                    curr.next = node;
                }
            }
            size ++;

        }
    }
    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> curr = chainArray[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            return null;
        }
    }
    public V remove (K key) {
        int index = hash(key);
        Hashnode<K, V> curr = chainArray[index];
        HashNode<K, V> prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    chainArray[index] = curr.next;
                }
                else {
                    prev.next = curr.next;
                }
                size--;
                return curr.value;
            }
            prev = curr;
            curr = curr.next;

        }
        return null;
    }
    public boolean contains(V value) {
        for ( int = i; i < M; i++) {
            HashNode<K, V> curr = chainArray[i];
            while (curr != null) {
                if (curr.value.equals(value)) {
                    return true;
                }
                curr = curr.next;
            }
        }
        return false;
    }
    public K getkey(V value) {
        for ( int i = 0; i < M; i++) {
            HashNode<K ,V> curr =chainArray[i];
            while (curr != null) {
                if (curr.value.equals(value)) {
                    return curr.key;
                }
                curr = curr.next
            }
        }
        return null;
    }
}
