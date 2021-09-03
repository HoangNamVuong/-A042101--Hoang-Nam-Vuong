package lesson14_bubbleSort_selectSort_insertSort.practice.selectionSort;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] list = {7,4,4,6,7,8,9,2,1,4};
        SelectionSort.selectionSort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
