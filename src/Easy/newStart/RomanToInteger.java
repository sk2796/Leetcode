package Easy.newStart;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        String str = "III";
        int number = romanToInteger(str);
        System.out.println(number);
    }

    private static int romanToInteger(String str) {
        Map<Character, Integer> hmap = new HashMap<>();
        hmap.put('M',1000);
        hmap.put('D',500);
        hmap.put('C',100);
        hmap.put('L',50);
        hmap.put('X',10);
        hmap.put('V',5);
        hmap.put('I',1);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i==str.length()-1) {
                sum = sum + hmap.get(str.charAt(i));
            } else if(hmap.get(str.charAt(i))>= hmap.get(str.charAt(i+1))) {
                sum = sum + hmap.get(str.charAt(i));
            } else {
                sum = sum + hmap.get(str.charAt(i+1)) - hmap.get(str.charAt(i));
                i++;
            }
        }
        return sum;
    }
}
