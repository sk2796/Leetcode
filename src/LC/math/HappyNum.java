package LC.math;

public class HappyNum {
    public static void main(String[] args) {
        int n = 19;
        while(n!=1) {
            n = sumOfSquares(n);
            if(n <10) {
                System.out.println("rnr[");
                break;
            }
        }
        System.out.println(n);
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while(n > 0) {
            sum = sum + ((n % 10) * (n % 10));
            n = n/10;
        }
        return sum;
    }
}
