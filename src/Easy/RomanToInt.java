package Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "III";
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("I", 1);
        hmap.put("V", 5);
        hmap.put("X", 10);
        hmap.put("L", 50);
        hmap.put("C", 100);
        hmap.put("D", 500);
        hmap.put("M", 1000);
        int i =0, sum =0;
        if(s.length()>1) {
            while(i<s.length()-1) {
                if(hmap.get(String.valueOf(s.charAt(i)))>= hmap.get(String.valueOf(s.charAt(i+1)))) {
                    sum = sum + hmap.get(String.valueOf(s.charAt(i)));
                    i++;
                } else {
                    sum = sum + hmap.get(String.valueOf(s.charAt(i+1))) - hmap.get(String.valueOf(s.charAt(i)));
                    i+=2;
                }
            }
            if(i==s.length()-1) {
                sum = sum + hmap.get(String.valueOf(s.charAt(i)));
            }
        } else System.out.println(hmap.get(String.valueOf(s.charAt(0))));
        System.out.println(sum);
    }
}
