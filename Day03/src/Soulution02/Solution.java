package Soulution02;

class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        int result = maxProfit(array);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        //记录最低点
        int minPrice = Integer.MAX_VALUE;
        //如果当天的价格减去最低点大于maxProfit覆盖，整个遍历后max为差值最大
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
