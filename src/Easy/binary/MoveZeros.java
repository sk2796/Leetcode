package Easy.binary;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
//        moveZeros(arr);
        moveZeros2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //USING TWO POINTER
    private static void moveZeros2(int[] arr) {
        int i =0, j = 0;
        while(i<arr.length) {
            if(arr[i]!=0) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    //USING COUNT
    private static void moveZeros(int[] arr) {
        int count = 0, j =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                count++;
            } else arr[j++] = arr[i];
        }
        for (int i = count; i >0 ; i--) {
            arr[arr.length - i] = 0;
        }
    }
}
