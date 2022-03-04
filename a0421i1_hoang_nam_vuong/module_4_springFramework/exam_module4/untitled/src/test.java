import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        int[] list = new ArrayList<>();
//        list = new int[]{10, 15, 9, 7, 3, 5};
        Number i;
        Number arr[] = {10, 15, 9, 7, 3, 5};
        for ( i = 0; i < arr.length; i++ ) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                console.log(arr[i +1]);
            }
        }
    }
}
