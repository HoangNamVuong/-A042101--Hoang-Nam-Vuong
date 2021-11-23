package lesson03_array_and_method_in_java.exercise;

public class SumDiagonalInTwoDimensionalArray {
    public static void main(String[] args) {
        FindMaxElementTwoDimensionalArray input = new FindMaxElementTwoDimensionalArray();
        int[][] array1 = input.enterArray();
        System.out.println("Sum of diagonal is " + sumDiagonalMain(array1));
    }
    public static int sumDiagonalMain(int[][] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum += array1[i][i];
                break;
            }
        }
        return sum;
    }
    public static int sumDiagonalAuxiliary(int[][] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length-1; i++) {
            sum += array1[i][array1.length - 1 - i];
        }
        return sum;
    }
}
