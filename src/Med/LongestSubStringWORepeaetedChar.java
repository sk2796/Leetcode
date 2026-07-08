package Med;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStringWORepeaetedChar {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hset = new LinkedHashSet<>();
        int max = 0; int count = 0; int i = 0; int j = 0;
        while(i < s.length()) {
            if(!hset.contains(s.charAt(i))) {
                hset.add(s.charAt(i));
                count++; i++;
                max = Math.max(max, count);
            } else {
                hset.remove(s.charAt(j)); j++;
                count--;
            }
        }
        return max;
    }
}
