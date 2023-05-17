package com.assignment10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);
        System.out.println(list);

        SListIterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x == 2) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}

