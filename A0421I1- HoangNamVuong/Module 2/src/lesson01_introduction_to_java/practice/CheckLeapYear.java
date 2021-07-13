package lesson01_introduction_to_java.practice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year want check? ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                }else {
                    System.out.println(year + " is  Not a leap year");
                }
            }else {
                System.out.println(year + " is a leap year");
            }
        }else {
            System.out.println(year + " is Not a leap year");
        }
    }
}
