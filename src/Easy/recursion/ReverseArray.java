package Easy.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,6,4,7,8,9,0};
        reverseArr(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArr(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        swap(arr, low, high);
        reverseArr(arr, low+1, high-1);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
