package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUnique {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,2,1};
        int res = findUnique(a);
        System.out.println(res);
    }

    private static int findUnique(int[] a) {
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int x : a) {
            if(hMap.containsKey(x)) {
                hMap.put(x, hMap.get(x)+1);
            } else hMap.put(x, 1);
        }
        return hMap.entrySet().stream().filter(x -> x.getValue() == 1).map(res -> res.getKey()).collect(Collectors.toList()).get(0);
    }
}
