package lesson02_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayFirstTwentyPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers prime display?");
        int amountOfPrime = scanner.nextInt();
        int count = 0;
        int check = 2;

        while (count < amountOfPrime) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(check); i++) {
                if (check % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(check + " is prime");
                count++;
            }
            check++;
        }
    }
}
// if you need display twenty number prime then replace variable "amountOfPrime" to number twenty.