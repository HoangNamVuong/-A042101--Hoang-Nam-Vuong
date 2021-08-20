package lesson10_arrayList_and_linkedList.practice.inplement_class_linkedList_simple;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.add(0,0);
        myLinkedList.add(1,1);
        myLinkedList.addFirst(-1);
        myLinkedList.addFirst(-2);
        myLinkedList.printList();
    }
}
