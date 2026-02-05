package Easy.newStart;

import java.util.Arrays;

public class ArrayPairSum {

    //561. Array Partition
    public static void main(String[] args) {
        int[] arr = {1,4,2,3};
        int maxSumOfPair = maxsumOfPair(arr);
        System.out.println(maxSumOfPair);
    }

    private static int maxsumOfPair(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; ) {
            sum = sum + arr[i];
            i = i+2;
        }
        return sum;
    }
}
