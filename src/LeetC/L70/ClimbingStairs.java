package LeetC.L70;

public class ClimbingStairs {
    public static void main(String[] args) {
        int[] dp = new int[6];
        System.out.println(climbStairs(6, dp));
//        System.out.println(climbStairs1(6));// time limit too much
    }

    public static int climbStairs1(int n) {
        int[] dp = new int[6];
        if(n==1 || n== 2) {
            dp[n-1] = n;
            return n;
        }
        if(dp[n-2]==0) {
            dp[n-2] = climbStairs1(n-1);
        }
        if(dp[n-3]==0) {
            dp[n-3] = climbStairs1(n-2);
        }
        return dp[n-3] + dp[n-2];
    }

    public static int climbStairs(int n, int[] dp) {
        if(n==1 || n== 2) {
            dp[n-1] = n;
            return n;
        }
        if(dp[n-2]==0) {
            dp[n-2] = climbStairs(n-1, dp);
        }
        if(dp[n-3]==0) {
            dp[n-3] = climbStairs(n-2, dp);
        }
        return dp[n-3] + dp[n-2];
    }
}
