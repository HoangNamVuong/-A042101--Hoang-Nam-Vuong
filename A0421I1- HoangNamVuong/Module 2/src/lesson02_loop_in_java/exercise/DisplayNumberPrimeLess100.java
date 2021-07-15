package lesson02_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayNumberPrimeLess100 {
    public static void main(String[] args) {
        System.out.println("Number prime less 100 is: ");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " is prime");
            }
        }
//        System.out.println("Enter prime less number?");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        for (int i = 0; i < number; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i + " is prime");
//            }
//        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
