package Easy.sw;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.
public class ContainsDup2 {
    public static void main(String[] args) {
       int[] nums = {1,0,1,1};
       int k = 1;
        System.out.println(containsDupUsingHash(nums, k));
    }

    private static boolean containsDupUsingHash(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int i = 0;
        while(i< nums.length) {
            if(hmap.containsKey(nums[i])) {
                if(i- hmap.get(nums[i]) <=k) {
                    return true;
                } else {
                    hmap.put(nums[i], i);
                    i++;
                }
            } else {
                hmap.put(nums[i], i);
                i++;
            }
        }
        return false;
    }


    private static boolean containsDup(int[] nums, int k) {
        int i =0;
        while(i< nums.length -1) {
            int j = i+k;
            while((j-i)<=k && j>i && j < nums.length) {
                if(nums[i]==nums[j]) {
                    return true;
                }
                j--;
            }
            i++;
        }

        return false;
    }
//    private static boolean containsDup2(int[] nums, int k) {
//        int i =0, j = i+k;
//        while(j<nums.length) {
//            if(nums[i] == nums[j] && Math.abs(nums[i] - nums[j])<=k) {
//                return true;
//            } else {
//                j++;
//                i = j-k;
//            }
//        }
//        return false;
//    }

}
