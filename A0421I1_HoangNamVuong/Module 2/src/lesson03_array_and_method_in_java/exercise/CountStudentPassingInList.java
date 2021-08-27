package lesson03_array_and_method_in_java.exercise;

public class CountStudentPassingInList {
    public static void main(String[] args) {
        MergeTwoArray input = new MergeTwoArray();
        int[] array = input.enterArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Score of student "+ i + " is: " + array[i]);
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.print("The number of students passing the exam is: " + count);
    }
}
