package com.assignment10;

import java.util.NoSuchElementException;

public class SListIterator<T> {
    private SList.Link<T> current;
    private SList.Link<T> previous;
    private SList<T> list;

    public SListIterator(SList.Link<T> current) {
        this.current = current;
        this.previous = null;
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T data = current.data;
        previous = current;
        current = current.next;
        return data;
    }

    public void insert(T data) {
        current.next = new SList.Link<>(data, current.next);
        current = current.next;
    }

    public void remove() {
        if (current == null) {
            throw new NoSuchElementException();
        }
        if (previous == null) {
            list.head = current.next;
        } else {
            previous.next = current.next;
        }
        current = current.next;
    }
}

