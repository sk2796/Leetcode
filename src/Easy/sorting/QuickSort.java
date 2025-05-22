package Easy.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,6,3,7,8,4,5,2,1,10};
        quickSort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivot = calculatePivot(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot+1, high);
        }
    }

    private static int calculatePivot(int[] arr, int low, int high) {
        int pivot = low;
        while(low<high) {
            while(arr[pivot] > arr[low]) {
                low++;
            }
            while(arr[pivot] < arr[high]) {
                high--;
            }
            if(low<high) {
                swap(arr, low, high);
            }
        }
        return high;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
