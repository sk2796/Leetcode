package Easy.string;

public class ValidPallindrome {

    public static void main(String[] args) {

        //125. Valid Palindrome
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPallidrome(s));
    }

    private static boolean isValidPallidrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0; int j = s.length()-1;
        while (i <j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        System.out.println(s);
        return true;
    }
}
