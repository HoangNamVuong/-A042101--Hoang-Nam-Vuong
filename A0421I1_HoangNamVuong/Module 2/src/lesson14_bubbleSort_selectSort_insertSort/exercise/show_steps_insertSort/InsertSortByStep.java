package lesson14_bubbleSort_selectSort_insertSort.exercise.show_steps_insertSort;

public class InsertSortByStep {
    public static void insertSortByStep(int[] list) {
        int element;
        int index;
        boolean needNextPass = true;
        for (int i = 1; i < list.length; i++) {
            needNextPass = false;
            element = list[i];
            index = i;
            while (index > 0 && element < list[index -1]) {
                System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                list[index] = list[index -1];
                index--;
            }
            list[index] = element;

            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
