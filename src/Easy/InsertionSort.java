package Easy;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,9,0,3};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                } else break;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
