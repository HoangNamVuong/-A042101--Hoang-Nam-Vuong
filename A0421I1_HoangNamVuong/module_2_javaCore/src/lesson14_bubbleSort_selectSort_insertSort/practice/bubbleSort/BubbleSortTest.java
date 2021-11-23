package lesson14_bubbleSort_selectSort_insertSort.practice.bubbleSort;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        BubbleSort.bubbleSort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
