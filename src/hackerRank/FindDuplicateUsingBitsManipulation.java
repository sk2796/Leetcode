package hackerRank;

public class FindDuplicateUsingBitsManipulation {
    public static void main(String[] args) {
        String str = "shubhamskkei";
        printDuplicates(str);
    }

    private static void printDuplicates(String str) {
        int h = 0, x = 0;
        for (char c : str.toCharArray()) {
            x = 1;
            x = x<< (c - 97);
            if((x & h) > 0) {
                System.out.println("dup :"+ c);
            } else h = x | h;
        }
    }
}
