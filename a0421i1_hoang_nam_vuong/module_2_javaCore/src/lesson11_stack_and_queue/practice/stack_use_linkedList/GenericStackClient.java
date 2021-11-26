package lesson11_stack_and_queue.practice.stack_use_linkedList;

import java.util.*;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("stack of Integers");
        stackOfIntegers();
        System.out.println("stack of String");
        stackOfString();
    }

    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        stack.push("1");

        System.out.println("begin pop");
        System.out.println(stack.size());

        System.out.println("after pop");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("begin pop");
        System.out.println(stack.size());

        System.out.println("after pop");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();
    Queue<String> queue1 = (Queue<String>) new ArrayList<String>();
    Queue<String> queue2 = new PriorityQueue<>();
    Queue<String> queue3 = new ArrayDeque<>();
}
