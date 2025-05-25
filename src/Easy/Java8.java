package Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        int[] arr = {5,8,7,6,9,2,3,5,4,2,6,8,9,7,7,4,6,6,9,8,4};
        int[] nums = {5,8,4,6};
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int x : nums) {
            if(hmap.containsKey(x)) {
                hmap.put(x, hmap.get(x)+1);
            } else hmap.put(x, 1);
        }
        System.out.println(hmap);
        int max = hmap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        int min = hmap.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
        int single = hmap.entrySet().stream().filter(x -> x.getValue()==1).findFirst().get().getKey();
        Map.Entry<Integer, Integer> integerIntegerEntry = hmap.entrySet().stream().filter(x -> Collections.frequency(Arrays.asList(nums), x) > 1).findFirst().get();
        System.out.println(integerIntegerEntry);
        System.out.println(max);
        System.out.println(min);
        System.out.println(single);
    }
}
