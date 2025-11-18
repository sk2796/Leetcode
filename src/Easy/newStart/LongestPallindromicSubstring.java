package Easy.newStart;

//5. Longest Palindromic Substring
public class LongestPallindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String longest = longestSubString(s);
        System.out.println(longest);
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
