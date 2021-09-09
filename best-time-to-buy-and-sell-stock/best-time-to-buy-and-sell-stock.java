class Solution {
    public int maxProfit(int[] prices) {
        
        int i=0, profit=0, j=0;
        if(prices.length>0){
            int min=prices[0];
            for(i=0; i<prices.length; i++){
                if(min > prices[i]){
                    min = prices[i];
                }
                else 
                    profit = Math.max( profit, prices[i]-min );
            }
        }
                    
        return profit;
    }
        
        
    
}