package com.assignment10;

public class SList<T> {
    Link<T> head;

    public SList() {
        head = null;
    }

    public SListIterator<T> iterator() {
        return new SListIterator<>(head);
    }

    static class Link<T> {
        T data;
        Link<T> next;

        Link(T data, Link<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFront(T data) {
        head = new Link<>(data, head);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        SListIterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
