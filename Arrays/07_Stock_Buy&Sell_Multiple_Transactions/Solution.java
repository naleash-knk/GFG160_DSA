class Solution {
    public int maxProfit(int[] prices) {
        
        int tot_profit = 0;
        
        int i=0;
        int j=1;
        
        while(i<prices.length && j<prices.length){
            if(prices[j]>prices[i]){
                tot_profit+=(prices[j]-prices[i]);
            }
            i++;
            j++;
        }
        
        return tot_profit;
    }
}