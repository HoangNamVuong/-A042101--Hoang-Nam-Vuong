package lesson02_loop_in_java.practice;

import java.util.Scanner;

public class DemoLoopAndArray {
    public static void main(String[] args) {
//        demoForI();
//        int[] a = {1, 8, 9, 10};
//        displayArray(a);
//        demoFindAns();
        int arr[] = new int[5];
//        inputArray(arr);
//        displayArray(arr);
        demoArrayChar();
    }

    public static void demoForI() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + 5*i);
            System.out.printf("5 x %d = %d\n", i, 5*i);
        }
    }

    public static void displayArray(int a[]) {
        for (int i : a) {
            System.out.printf("Phan tu trong mang: %d\n", i);
        }
    }

    public static void demoFindAns() {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int expectedAnswer = input.nextInt();
        while (number1 + number2 != expectedAnswer){
            System.out.println("Wrong answer");
            System.out.println("Please input the other answer: ");
            expectedAnswer = input.nextInt();
            input.nextLine();
        }
        System.out.println("You gotit!");
    }

    public static void inputArray(int[] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap phan tu thu %d: \n", i);
            a[i] = scanner.nextInt();
        }
    }

    public static void demoArrayChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            System.out.printf("Ky tu thu %d: %c\n", i, str.charAt(i));
//        }
        for (int i = 0; i < ch.length; i++) {
            System.out.printf("Ky tu thu %d: %c\n", i, ch[i]);
        }
    }
}
