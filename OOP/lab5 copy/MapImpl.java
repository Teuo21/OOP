package lab5;

import java.util.ArrayList;

public class MapImpl<K, V> implements Map<K, V>
{
    MyLinkedList<K> keys = new MyLinkedList<>();
    MyLinkedList<V> values =  new MyLinkedList<>();

    @Override
    public void add(K key, V value)
    {
        if(this.keys.size() == 0)
        {
            this.keys.add(key);
            this.values.add(value);
        }
        else
        {
            int find = this.keys.indexOf(key);
            if(find == -1)
            {
                this.keys.add(key);
                this.values.add(value);
            }
            else
            {
                this.values.remove(find);
                this.values.add(value, find);
            }

        }
    }

    @Override
    public V remove(K key)
    {
        int index = this.keys.indexOf(key);
        V value = this.values.get(index);
        this.keys.remove(index);
        this.values.remove(index);
        return value;
    }

    @Override
    public int size()
    {
        return this.keys.size();
    }

    @Override
    public boolean isEmpty()
    {
        return this.keys.size() > 0 && this.values.size() > 0;
    }

    @Override
    public MyLinkedList<K> keys()
    {
        return this.keys;
    }

    @Override
    public void print()
    {
        for(int index = 0; index < this.values.size(); index++)
            System.out.println(this.values.get(index));
    }
}
