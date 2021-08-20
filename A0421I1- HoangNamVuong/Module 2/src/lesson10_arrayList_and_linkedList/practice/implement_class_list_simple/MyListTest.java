package lesson10_arrayList_and_linkedList.practice.implement_class_list_simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
//        MyList<Integer> listInteger = new MyList<Integer>();
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//        listInteger.add(4);
//
//        System.out.println("element 1: " + listInteger.get(1));
//        System.out.println("element 2: " + listInteger.get(2));
//        System.out.println("element 3: " + listInteger.get(3));
//        System.out.println("element 4: " + listInteger.get(4));

        List<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.addFirst("first a");

        for (String i : linkedList) {
            System.out.println(i);
        }

        arrayList.add("name0");
        arrayList.add("name2");
        arrayList.add("name3");
        arrayList.add(1,"name1");
        for(String i : arrayList) {
            System.out.println(i);
        }
        System.out.println("add by index");
        arrayList.remove(0);
        arrayList.isEmpty();
        for(String i : arrayList) {
            System.out.println(i);
        }
        System.out.println("remove by index");
        arrayList.remove("name3");
        for(String i : arrayList) {
            System.out.println(i);
        }
        System.out.println("remove by object");

    }
}
