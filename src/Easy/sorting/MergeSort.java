package Easy.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,9,0,3,4};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        } else {
            showArr(arr,low,high);
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            System.out.println();
            mergeSort(arr, mid+1, high);
            System.out.println();
            merge(arr, low, mid, high);
        }
    }

    private static void showArr(int[] arr, int low, int high) {
        while(low<=high) {
            System.out.print(arr[low++]+" ");
        }
        System.out.println();
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        System.out.println("merging two arr");
        showArr(arr,low, mid);
        showArr(arr, mid+1, high);
        int[] temp = new int[high - low +1];
        int i = low, j = mid+1; int k =0;
        while(i<=mid && j<=high) {
            if(arr[i]<=arr[j]) {
                temp[k++] = arr[i++];
            } else temp[k++] = arr[j++];
        }
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=high) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[low+l] = temp[l];
        }
    }
}
