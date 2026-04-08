package Easy.newStart;

import java.util.Arrays;

public class PlusOne {

    //66. Plus One
    public static void main(String[] args) {
        int[] arr = {9,9,9,8};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] arr) {
        int cf = 1;
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i] = arr[i] + cf;
            if(arr[i]>9) {
                arr[i] = arr[i]%10;
                cf = 1;
            } else cf = 0;
        }
        if(cf == 1) {
            int[] newArr = new int[arr.length+1];
            newArr[0] = cf;
            System.arraycopy(arr, 1, newArr, 1, arr.length-1);
            return newArr;
        }

        return arr;
    }
}
