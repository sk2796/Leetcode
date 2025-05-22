package Easy;

import java.util.HashMap;
import java.util.Map;

public class Java8 {
    public static void main(String[] args) {
        int[] arr = {5,8,7,6,9,2,3,5,4,2,6,8,9,7,7,4,6,6,9,8,4};
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int x : arr) {
            if(hmap.containsKey(x)) {
                hmap.put(x, hmap.get(x)+1);
            } else hmap.put(x, 1);
        }
        System.out.println(hmap);
        int max = hmap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        int min = hmap.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
        int single = hmap.entrySet().stream().filter(x -> x.getValue()==1).findFirst().get().getKey();
        System.out.println(single);
    }
}
