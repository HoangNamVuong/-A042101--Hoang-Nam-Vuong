package lesson14_bubbleSort_selectSort_insertSort.exercise.insertSort;

public class InsertSortTest {
    public static void main(String[] args) {
        int[] arr = {5,1,6,7,8,4,7,8};
        InsertSort.sort(arr);
        for ( int i : arr) {
            System.out.println(i);
        }
    }
}
