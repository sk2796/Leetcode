package Easy;

import java.util.Arrays;

import static java.util.Collections.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,9,0,3};
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            boolean swag = false;
            for (int i = 0; i < arr.length-j-1; i++) {
                if(arr[i] > arr [i+1]) {
                    swag = true;
                    swap(arr, i, i+1);
                }
            }
            if(!swag){
                break;
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
