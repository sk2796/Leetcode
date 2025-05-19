package Easy;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,0,8,9,7};
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[index] > arr[j]) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
