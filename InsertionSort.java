//Write a java program to sort a array using Insertion sort technique.

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,5,2,4,1,3,8,6,7};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
