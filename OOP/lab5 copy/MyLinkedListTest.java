package lab5;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void testAddToEmptyList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        assertEquals(10, list.get(0));
    }

    @Test
    void testAddAtIndexHead() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(1, 0);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void testAddAtIndexTail() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3, 2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void testAddAtInvalidIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 3));
    }

    @Test
    void testGetFirstAndLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(2));
    }

    @Test
    void testGetNegativeIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void testGetOutOfBoundsIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void testRemoveHead() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.remove());
        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void testRemoveAtIndexMiddle() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2, list.remove(1));
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void testRemoveAtIndexTail() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.remove(2));
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void testRemoveMakesListEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.remove();
        assertThrows(NoSuchElementException.class, list::remove);
    }

    @Test
    void testRemoveInvalidIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(3));
    }

    @Test
    void testMixedOperations() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("A");
        list.add("C");
        list.add("B", 1);
        list.remove(0);
        assertEquals("B", list.get(0));
        assertEquals("C", list.get(1));
    }

    @Test
    void testStringsAsGenericType() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }
}
