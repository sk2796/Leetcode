package Easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,6,8};
        int[] res = twosum(arr, 8);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length-1; i++) {
            int[] res = new int[2];
            int next = target - arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]==next) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return new int[2];
    }
}
