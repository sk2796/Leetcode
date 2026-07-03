package LC.math;

public class Bits {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(hammingWeight(n));
        System.out.println(reverseBits(n));
    }

    // 190. Reverse Bits
    //TODO
    private static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n = n/2;
        }
        System.out.println(sb);
        while(sb.length()<=32) {
            sb.append('0');
        }
        System.out.println(sb);
        int i = sb.length()-1;
        int sum = 0;
        int multiplier = 1;
        while(i >=0) {
            sum = sum + (multiplier * sb.charAt(sb.length() - i - 1) - '0');
            multiplier = multiplier * 2;
            i--;
        }
        return sum;
    }

    // 191. Number of 1 Bits
    private static int hammingWeight(int n) {
        int count = 0;
        while(n>0) {
            count = n%2==0 ? count : count+1;
            n = n/2;
        }
        return count;
    }
}
