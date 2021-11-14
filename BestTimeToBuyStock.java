// time complexity: O(n)
// space complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        
        int smallest = 100000;
        int biggestProfit = 0;
        
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<smallest){
                smallest = prices[i];
            }
            
            if(prices[i]-smallest > biggestProfit){
                biggestProfit = prices[i]-smallest;   
            }
        }
        
        return biggestProfit;
  
    }
}
