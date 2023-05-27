package arrays.easy;

public class BestTimeToBuyAndSellStock {

    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
    //Best Time to Buy and Sell Stock II
    //You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
    //
    //On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
    //
    //Find and return the maximum profit you can achieve.
    public static void main(String[] args) {
//        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices = new int[]{1, 7, 2, 3, 6, 7, 6, 7};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {
        int i = 0;
        int valley;
        int peak;
        int maxprofit = 0;

        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }

        return maxprofit;
    }

}
