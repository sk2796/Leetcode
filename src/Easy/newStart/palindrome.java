package Easy.newStart;

public class palindrome {
    public static void main(String[] args) {
        int x = 12321;
        System.out.println(isPallindrome(x));
    }

    private static boolean isPallindrome(int x) {
        String str = String.valueOf(x);
        int i = 0, j = str.length()-1;
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            } else {
                i++; j--;
            }
        }
        return true;
    }
}
