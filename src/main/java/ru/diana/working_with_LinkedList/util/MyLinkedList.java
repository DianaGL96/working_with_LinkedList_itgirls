package ru.diana.working_with_LinkedList.util;
import java.util.LinkedList;

public class MyLinkedList {
    private LinkedList<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    public void add (int value) {
        list.add(value);
    }

    public void removeEven () {
        while (!list.isEmpty() && list.getFirst() % 2 == 0) {
            list.removeFirst();
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) % 2 == 0) {
                list.remove(i + 1);
                i--;
            }
        }
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
