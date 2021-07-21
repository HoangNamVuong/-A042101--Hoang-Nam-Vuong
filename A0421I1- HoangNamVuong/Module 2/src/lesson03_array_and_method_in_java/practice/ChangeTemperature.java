package lesson03_array_and_method_in_java.practice;

import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choiceCase;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("Enter your choice");
            choiceCase = scanner.nextInt();

            switch (choiceCase) {
                case 1:
                    System.out.println("Enter fahrenheit:");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Celsius is: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius:");
                    celsius = scanner.nextDouble();
                    System.out.println("fahrenheit is: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please choice right number in menu");
            }
        } while (choiceCase != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
