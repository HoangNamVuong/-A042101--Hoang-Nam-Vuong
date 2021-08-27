package lesson03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String yourString = scanner.nextLine();
        System.out.println("Enter a character want count:");
        char character = scanner.nextLine().charAt(0);
        System.out.println("Your string is: " + yourString);
        System.out.println("Your character is: " + character);

        System.out.println("Character " + character + " appear " + countCharacterInString(character, yourString)
                           + " time in string");
    }
    public static int countCharacterInString(char character, String yourString) {
        int count = 0;
        for (int i = 0; i < yourString.length(); i++) {
            if (yourString.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
