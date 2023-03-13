// Write a java program to perform Selection sort.
import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {9,5,2,4,1,3,8,6,7};
        System.out.println(Arrays.toString(arr));
        selection(arr);   // calling function.
        System.out.println(Arrays.toString(arr));
    }
    //  function definition.
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int last = arr.length - i - 1;
            for (int j = 0; j < arr.length -i; j++) {
                if(arr[j]> arr[max]){    // taking maximun element.
                    max = j;
                }
            }
            // Swapping element and putting at the last index.
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
}