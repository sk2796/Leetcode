package Easy.newStart;

import java.util.*;

//Two Pointers //Array
public class RemoveDups {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2,3,3,4,6,7,8,8,9};
        System.out.println(removeDups(nums));
    }

    private static int removeDups(int[] nums) {
        int i =0, j= 1;
        if(nums.length>0) {
            while(j<nums.length) {
                if(nums[i]==nums[j]) {
                    nums[j] = -10001;
                    j++;
                } else if(nums[i]<nums[j]) {
                    i++;
                    swap(nums, i,j);
                    j++;
                }
            }
        }
        return i+1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
