package lesson14_bubbleSort_selectSort_insertSort.exercise.show_steps_insertSort;

import lesson14_bubbleSort_selectSort_insertSort.practice.show_steps_bubbleSort.BubbleSortByStep;

import java.util.Scanner;

public class InsertSortByStepTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        InsertSortByStep.insertSortByStep(list);
    }
}
