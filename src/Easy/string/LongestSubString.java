package Easy.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        //3. Longest Substring Without Repeating Characters
        //TODO - Not working
        String s = "bbb";
        int length = longestSubstringWithoutRepeatingChar(s);
        System.out.println(length);
    }

    private static int longestSubstringWithoutRepeatingChar(String s) {
        if(s.length()==1) {
            return 1;
        }
        Set<Character> set = new HashSet<>();
        int i =0, j = 0;
        int max = 0;
        while(j < s.length()) {
            if(set.contains(s.charAt(j))){
                if(s.charAt(i)== s.charAt(j)) {
                    max = Math.max(max, set.size());
                    set.remove(s.charAt(i));
                    set.add(s.charAt(i)); i++;
                } else {
                    while(s.charAt(i) != s.charAt(j)) {
                        max = Math.max(max, set.size());
                        set.remove(s.charAt(i)); i++;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            } else {
                set.add(s.charAt(j));
                j++;
            }
        }
        max = Math.max(max, set.size());
        return max;
    }
}
