package Easy;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res[] = new int[nums.length];
        int k=0;
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(res[k]!=nums[i]) {
                res[++k] = nums[i];
            }
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
