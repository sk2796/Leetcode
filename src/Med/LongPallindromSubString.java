package Med;

import java.util.LinkedHashSet;
import java.util.Set;

// 5. Longest Palindromic Substring
public class LongPallindromSubString {
    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindromeSubstring(s));
        System.out.println(longestSubstringWithoutRepeatedChar(s));
    }

    private static String longestPalindromeSubstring(String s) {

        return s;
    }

    //Get longest substring without repeating characters
    private static String longestSubstringWithoutRepeatedChar(String s) {

        Set<Character> hset = new LinkedHashSet<>();
        int maxlength = 0;
        String result = "";
        StringBuilder sb = new StringBuilder();
        int i = 0; int j = 0;
        while(j < s.length()) {
            if(!hset.contains(s.charAt(j))) {
                hset.add(s.charAt(j));
                sb.append(s.charAt(j));
                j++;
            } else {
                if(maxlength < sb.length())  {
                    maxlength = sb.length();
                    result = sb.toString();
                }

                hset.remove(s.charAt(i));
                sb.deleteCharAt(0);
                i++;
            }
        }

        return result;
    }
}
