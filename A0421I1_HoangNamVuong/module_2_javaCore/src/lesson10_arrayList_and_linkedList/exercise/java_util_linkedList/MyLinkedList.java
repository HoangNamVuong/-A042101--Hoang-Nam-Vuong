package lesson10_arrayList_and_linkedList.exercise.java_util_linkedList;

public class MyLinkedList<E> {
    private MyNode head;
    private int numNodes;

    public MyLinkedList() {
        numNodes = 0;
        head = null;
    }

    class MyNode {
        MyNode next;
        Object data;

        public MyNode(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index >= numNodes) {
            throw new ArrayIndexOutOfBoundsException();
        }

        MyNode node = head;
        for(int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        MyNode insert = new MyNode(element);
        insert.next = node.next; //insert.next = temp
        node.next = insert;
        numNodes++;
    }

    public void addFirst(E element) {
        MyNode insert = new MyNode(element);
        insert.next = head;
        head = insert;
        numNodes++;
    }

    public void addLast(E element) {
        MyNode insert = new MyNode(element);
        MyNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = insert;
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            E element = (E)head.data;
            head = head.next;
            numNodes--;
            return element;
        }

        MyNode node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        E element = (E) node.next.data;
        node.next = node.next.next;
        numNodes--;
        return element;
    }

    public boolean remove(Object element) {
        MyNode node = head;
        if (node.data == element) {
            head = node.next;
            numNodes--;
            return true;
        }
        while (node.next != null) {
            if (node.next.data == element) {
                node.next = node.next.next;
                numNodes--;
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
