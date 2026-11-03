class Solution:
    def maxProfit(self, prices)->int:
        
        tot_profit=0
        
        i=0
        j=1
        
        while i<len(prices) and j<len(prices):
            if prices[j]>prices[i]:
                tot_profit+=(prices[j]-prices[i])
            i+=1
            j+=1
        return tot_profit
