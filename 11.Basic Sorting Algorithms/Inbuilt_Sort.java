import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort { 
    
    public static void printArr(Integer arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 2, 4, 3};
        // Arrays.sort(arr, 0, 3);
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
