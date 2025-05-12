package Easy.twoPointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctAverage {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        int res = countDistinctAvg(nums);
        System.out.println(res);
    }

    private static int countDistinctAvg(int[] nums) {
        Set<Double> hset = new HashSet<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i=0, j= nums.length-1;
        while(i <= j) {
            double avg = (double) (nums[i++] + nums[j--]) / 2;
            hset.add(avg);
        }
        return hset.size();
    }
}
