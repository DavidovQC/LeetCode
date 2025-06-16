class Solution{
    public int maxProfit(int[] prices) {
        int lowestBuy = prices[0];
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lowestBuy){
                lowestBuy = prices[i];
            }
            prices[i] = prices[i] - lowestBuy;
        }
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > max){
                max = prices[i];
            }
        }

        return max;
    }
}
