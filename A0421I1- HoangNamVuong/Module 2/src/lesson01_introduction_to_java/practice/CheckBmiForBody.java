package lesson01_introduction_to_java.practice;

import java.util.Scanner;

public class CheckBmiForBody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter weight(kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("Enter height(meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);

        if (bmi < 18) {
            System.out.println("Under weight");
        }else if (bmi < 25) {
            System.out.println("Normal");
        }else if (bmi < 30) {
            System.out.println("Over weight");
        }else {
            System.out.println("Obese");
        }
    }
}
