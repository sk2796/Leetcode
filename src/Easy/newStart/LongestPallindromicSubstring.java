package Easy.newStart;

import java.util.HashMap;
import java.util.Map;

public class LongestPallindromicSubstring {
    public static void main(String[] args) {
        String s = "bb";

        //5. Longest Palindromic Substring
//        String longest = longestSubString(s);
//        System.out.println(longest);

        //409. Longest Palindrome
        int longestPallindromeLen = longestPallindromeLength(s);
        System.out.println(longestPallindromeLen);
    }

    private static int longestPallindromeLength(String s) {
        Map<Character, Integer> hmap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(hmap.containsKey(c)) {
                hmap.put(c, hmap.get(c)+1);
            } else hmap.put(c, 1);
        }

        hmap.entrySet().forEach(System.out::println);

        boolean isOdd = false;
        int evenCount = 0;
        for (Map.Entry entry : hmap.entrySet()) {
            int value = (int) entry.getValue();
            if(value % 2== 0) {
                evenCount = evenCount + value;
            } else if(value > 1){
                isOdd = true;
                evenCount = evenCount + value -1;

            } else isOdd = true;
        }

        return isOdd ? evenCount + 1 : evenCount;
    }


    private static String longestSubString(String s) {
        String res = "";


        return res;
    }

    static boolean isPallindrome(String s) {
        if(s.length()<=1) {
            return true;
        }
        else return (s.charAt(0)== s.charAt(s.length()-1)) && isPallindrome(s.substring(1, s.length()-1));
    }
}
