package lab5;

import java.util.EmptyStackException;

public class MyStack<T> implements Stackable<T>
{
    private MyLinkedList<T> list;
    private int size;

    public MyStack()
    {
        this.list = new MyLinkedList<>();
        this.size = 0;
    }

    public void push(T value)
    {
        this.list.add(value, 0);
        this.size++;
    }

    public T pop()
    {
        if(this.isEmpty())
            throw new EmptyStackException();
        T value = this.list.get(0);
        this.list.remove(0);
        return value;
    }

    public T peek()
    {
        return this.list.get(0);
    }

    public boolean isEmpty()
    {
        return this.size == 0;
    }

    public void print()
    {
        for(int i = list.size(); i >= 0; i--)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    public int size()
    {
        return this.size;
    }
}
