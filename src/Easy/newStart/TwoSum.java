package Easy.newStart;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //1. Two Sum
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 17;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int secondNum = target - arr[i];
            if(hmap.containsKey(secondNum)) {
                return new int[]{hmap.get(secondNum), i};
            } else hmap.put(arr[i], i);
        }
        return new int[2];
    }
}
