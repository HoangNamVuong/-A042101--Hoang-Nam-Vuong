package lesson11_stack_and_queue.exercise.reverse_array_use_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUseStack {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner scanner = new Scanner(System.in);
        //String string = scanner.nextLine();
        String string = "hoang nam vuong";

        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            wStack.push(string.charAt(i));
        }
        System.out.println(wStack);

        while (!wStack.isEmpty()) {
            wStack.pop();
        }
    }
}
