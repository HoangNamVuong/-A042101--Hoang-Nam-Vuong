package lesson11_stack_and_queue.exercise.reverse_array_use_stack;

import java.util.Stack;

public class ReverseArrayUseStack {
    public static void main(String[] args) {
        int[] arrayNew = arrayInteger();
        reverseArray(arrayNew);
        for (int i : arrayNew) {
            System.out.println(i);
        }
    }
    public static int[] arrayInteger() {
        int[] arrayInteger = {2,2,3,4,56,6,8};
        return arrayInteger;
    }

    public static void reverseArray(int[] arrayInteger) {
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < arrayInteger.length; i++) {
            integerStack.push(arrayInteger[i]);
        }

        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = integerStack.pop();
        }
    }
}
