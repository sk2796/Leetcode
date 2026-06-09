package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1018. Binary Prefix Divisible By 5
public class BinaryPrefix {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        //using recursion
//        boolean[] rresult = findBooleanPrefixR(nums, 0, nums.length-1);
//        boolean[] result = findBooleanPrefix(nums);
        List<Boolean> result = findBooleanPrefixBitwise(nums);
//        System.out.println(Arrays.toString(result));
        result.forEach(System.out::println);
    }

    private static List<Boolean> findBooleanPrefixBitwise(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;
        for (int n : nums) {
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }
        return res;
    }

    //
    private static boolean[] findBooleanPrefix(int[] nums) {
        boolean[] result = new boolean[nums.length];
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j>=0; j--) {
                sum = (int) (sum + (nums[j] * Math.pow(2, i-j)));
            }
            sums[i] = sum;
            if(sum == 0 || sum % 5 == 0) {
                result[i] = true;
            }
        }
        System.out.println(Arrays.toString(sums));
        return result;
    }


    //Working
    private static boolean[] findBooleanPrefixR(int[] nums, int start, int end) {
        if(start==end) {
            if(nums[0]==0)
                return new boolean[]{true};
            else return new boolean[]{false};
        }
        boolean[] temp = findBooleanPrefixR(nums, 0, end - 1);
        boolean[] newArr = new boolean[end+1];
        System.arraycopy(temp, 0, newArr, 0, temp.length);
        System.out.println(Arrays.toString(newArr));
        int binToDec = binToDecimal(nums,0, end);
        if(binToDec == 0 || binToDec % 5 ==0) {
            newArr[end] = true;
        }

        return newArr;
    }

    private static int binToDecimal(int[] nums, int start, int end) {
        int sum = 0;
        while(start<=end) {
            sum = (int) (sum + (nums[end - start] * Math.pow(2, start)));
            start++;
        }
        return sum;
    }
}
