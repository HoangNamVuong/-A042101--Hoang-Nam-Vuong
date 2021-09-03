package lesson13_linearSearch_and_binarySearch.exercise.search_maxString;

import java.util.LinkedList;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String enterString = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < enterString.length(); i++) {
            LinkedList<Character> listString = new LinkedList<>();
            listString.add(enterString.charAt(i));

            for (int j = i + 1; j < enterString.length(); j++) {
                if (enterString.charAt(j) > listString.getLast()) {
                    listString.add(enterString.charAt(j));
                }
            }
            if (listString.size() > max.size()) {
                max.clear();
                max.addAll(listString);
            }
            listString.clear();
        }

        for (Character i : max) {
            System.out.println(i);
        }
    }
}
