package Easy.twoPointers;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int k =0;
        int i=0, j=nums.length-1;
        while(i<=j) {
            if(nums[i]!=val) {
                i++;
            } else {
                k++;
                nums[i]=-1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums)+" "+k+" "+i+ "  "+j);
    }
}
