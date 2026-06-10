package Med;

import java.util.*;

// 128. Longest Consecutive Sequence
public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for(int i : nums) {
            hset.add(i);
        }
        int max = 0;
        for (int num : nums) {
            if (!hset.contains(num - 1)) {
                int current = num;
                int count = 1;
                while (hset.contains(current + 1)) {
                    current = current + 1;
                    count++;
                }
                if(max < count) {
                    max = count;
                }
            }
        }
        return max;
    }
}
