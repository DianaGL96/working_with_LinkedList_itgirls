package ru.diana.working_with_LinkedList.main;
import ru.diana.working_with_LinkedList.util.MyLinkedList;

public class Main {
    public static void main (String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        System.out.println("Исходный список: " + myLinkedList.getList());
        myLinkedList.removeEven();
        System.out.println("Список после удалёния чётных чисел: " + myLinkedList.getList());
    }
}
