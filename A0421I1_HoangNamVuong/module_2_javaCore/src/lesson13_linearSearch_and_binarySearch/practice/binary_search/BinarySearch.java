package lesson13_linearSearch_and_binarySearch.practice.binary_search;

public class BinarySearch {
    public static int binarySearch(int[] list, int value) {
        int low = 0;
        int high = list.length - 1;
        while (high > low) {
            int middle = (low + high) / 2;
            if (value == list[middle]) {
                return middle;
            }else if (value > list[middle]) {
                low = middle +1;
            }else {
                high = middle -1;
            }
        }
        return -1;
    }
}
