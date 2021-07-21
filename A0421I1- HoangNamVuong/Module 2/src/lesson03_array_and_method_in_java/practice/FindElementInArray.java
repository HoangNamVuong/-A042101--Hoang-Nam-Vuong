package lesson03_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Camila"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name student?");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) { // equals() is method compare string.
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + name + " in the list");
        }
    }
}
