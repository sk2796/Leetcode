package Easy;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(fact(0));
        System.out.println(climbStarirs(8));;
    }

    private static int climbStarirs(int n) {
        int start = (n%2 == 0) ? (n/2) : ((n+1)/2);
        int j = (n%2 == 0) ? 0 : 1;
        int sum = 0;
        for (int i = start; i <= n; i++) {
            sum = sum + (fact(i)/(fact(i-j) * fact(j)));
            j=j+2;
        }
        return sum;
    }

    private static int fact(int i) {
        int res = 1;
        while(i>0) {
            res = res * i--;
        }
        return res;
    }
}
