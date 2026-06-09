package LeetC.L70;

public class L121BestTimeToSellStock {
    //121. Best Time to Buy and Sell Stock
    public static void main(String[] args) {
        int[] prices = {7,12,2,3,6,4};
        System.out.println(maxProfit(prices));;
    }

    private static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int buy = prices[0];
        for(int price : prices) {
            if(price> buy) {
                max = Math.max(max, price - buy);
            }else buy = price;
        }
        return max;
    }
}
