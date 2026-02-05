package Easy.math;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //66. Plus One
        int[] arr = {8,9,1,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] arr) {
        int sum = arr[arr.length-1] + 1;
        if(sum==10) {
            int cf = 1;
            arr[arr.length-1] = 0;
            int i = arr.length-2;
            while(i >=0 && cf==1) {
                if(arr[i] + 1 ==10) {
                    arr[i] = 0;
                    i--;
                } else {
                    arr[i] = arr[i]+1;
                    i--;
                    cf = 0;
                }


            }
            if(cf==1) {
                int[] res = new int[arr.length+1];
                System.arraycopy(arr, 0, res, 1, arr.length);
                res[0] = 1;
                return res;
            }
            return arr;
        } else {
            arr[arr.length-1]++;
        }
        return arr;
    }
}
