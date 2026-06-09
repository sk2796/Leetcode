package LC.string;

import java.util.*;

public class LongestSubString {

    public static void main(String[] args) {
        //3. Longest Substring Without Repeating Characters
        String s = "babcdcb";
//        int length = longestSubstringWithoutRepeatingChar(s);
        int length = longestSubstringWithoutRepeatingChar1(s);
        System.out.println(length);
    }

    private static int longestSubstringWithoutRepeatingChar1(String s) {
        int max = 0;
        Set<Character> set = new LinkedHashSet<>();
        int i = 0, j = 0;
        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            } else if(s.charAt(i) != s.charAt(j)) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.remove(s.charAt(i));
                i++;
                set.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, set.size());
        }
        return max;
    }


    //Working
    private static int longestSubstringWithoutRepeatingChar(String s) {
        int max = 0;
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
                max = Math.max(max, list.size());
            } else if(s.charAt(i) == s.charAt(i-1)) {
                list.clear();
                list.add(s.charAt(i));
                max = Math.max(max, list.size());
            } else {
                max = Math.max(max, list.size());
                int index = list.indexOf(s.charAt(i));
                for (int j = 0; j <= index; j++) {
                    list.remove(0);
                }
                list.add(s.charAt(i));
            }
        }
        return max;
    }
}
