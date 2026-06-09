package LC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// 15. 3Sum
public class Array3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,2,-6,-4};
        List<List<Integer>> result = find3sum(nums);
        result.forEach( res -> res.forEach(System.out::println));
    }

    private static List<List<Integer>> find3sum(int[] nums) {
        List<List<Integer>> listofList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int target = -1 * nums[i];

            HashMap<Integer, Integer> hmap = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                if(i!=j) {
                    int newTarget = target - nums[j];
                    if(hmap.containsKey(newTarget)) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(hmap.get(newTarget));
                        list1.add(nums[j]);
                        Collections.sort(list1);
                        hmap.remove(newTarget);
                        if(!isAvailble(listofList, list1)) {
                            listofList.add(list1);
                        }
                    } else hmap.put(nums[j], nums[j]);
                }
            }
        }
        return listofList;
    }

    private static boolean isAvailble(List<List<Integer>> listofList, List<Integer> list1) {
        for (List<Integer> list : listofList) {
            return list.stream().allMatch(x -> list1.stream().anyMatch(k -> x==k));
        }
        return false;
    }
}
