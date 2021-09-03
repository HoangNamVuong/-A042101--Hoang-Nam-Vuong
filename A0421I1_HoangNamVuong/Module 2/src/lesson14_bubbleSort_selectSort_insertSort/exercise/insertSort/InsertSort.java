package lesson14_bubbleSort_selectSort_insertSort.exercise.insertSort;

public class InsertSort {
    public static void sort(int[] arr) {
        int element;
        int index;
        for (int i = 1; i < arr.length; i++) {
            element = arr[i];
            index = i;
            while (index > 0 && element < arr[index -1]) {
                arr[index] = arr[index -1];
                index--;
            }
            arr[index] = element;
        }
    }
}
