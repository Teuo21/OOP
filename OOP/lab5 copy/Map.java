package lab5;

public interface Map<K, V>
{
    public void add(K key, V value);
    public V remove(K key);
    public int size();
    public boolean isEmpty();
    public MyLinkedList<K> keys();
    public void print();
}
