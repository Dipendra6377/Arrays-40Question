// this question can also be done using kadanes Algotithm
// 
class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        
        int maxprofit=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<maxprofit){
                maxprofit=prices[i];
            }
            max=Math.max(max,prices[i]-maxprofit);
        }
        return max;

        
    }
}
