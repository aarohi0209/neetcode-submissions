class Solution {
    public int maxProfit(int[] prices) {
        int costPrice = prices[0];
        int sellPrice = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>=sellPrice){
                sellPrice = prices[i];
            }else{
                profit += sellPrice-costPrice;
                costPrice = prices[i];
                sellPrice = prices[i];
            }
        }
        if(sellPrice > costPrice){
            profit += sellPrice-costPrice;
        }
        return profit;
    }
}