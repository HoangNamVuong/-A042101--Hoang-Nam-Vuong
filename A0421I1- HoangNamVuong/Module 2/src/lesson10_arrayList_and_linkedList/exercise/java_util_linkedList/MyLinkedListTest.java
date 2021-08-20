package lesson10_arrayList_and_linkedList.exercise.java_util_linkedList;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> nameLinkedList = new MyLinkedList<>();
        nameLinkedList.add(0,"name-0");
        nameLinkedList.add(1,"name-1");


        System.out.println(nameLinkedList);
    }
}
