package lesson01_introduction_to_java.exercise;

import java.util.Scanner;

public class VndToUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number money(USD):");
        double usd = scanner.nextDouble();

        final int rate = 23000;
        double vnd = usd * rate;
        System.out.println("Number VND is: " + vnd);
    }
}
