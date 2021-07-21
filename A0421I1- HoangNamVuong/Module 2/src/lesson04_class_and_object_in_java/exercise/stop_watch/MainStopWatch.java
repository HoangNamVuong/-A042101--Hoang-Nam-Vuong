package lesson04_class_and_object_in_java.exercise.stop_watch;

import java.time.LocalTime;

public class MainStopWatch {
    public static int[] selectionSort(int... array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random()*1000);
        }
        LocalTime start = LocalTime.now();
        array = selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time elapsed is: " + stopWatch.getElapsedTime());
        for (int time : array) {
            System.out.println(time);
        }
    }
}
