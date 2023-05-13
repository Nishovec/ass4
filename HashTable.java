public class HashTable<K, V> {
    private K key;
    private V value;
    private HashNode<K, V> next;
    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;

    }
    public booleane equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if (!(obj instanceof MyTestingClass)) {
            return false;
        }
        MyTestingClass other = (MyTestingClass) obj;
        return this.x == other.x && this.y.equals(other.y);
    }

    @Override
    public String toString() {
        return "{" + key + " " + value + "}";
    }
}
