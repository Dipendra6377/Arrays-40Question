//All the straight forward solution should work, but if the interviewer twists the question slightly by giving the difference array of prices, 
//Ex: for {1, 7, 4, 11}, if he gives {0, 6, -3, 7}, you might end up being confused.

//Here, the logic is to calculate the difference (maxCur += prices[i] - prices[i-1]) of the original array, and find a contiguous subarray giving maximum profit. If //the difference falls below 0, reset it to zero.

    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;                                                         //using example :::::::::::::::::
      
      
      
        for(int i = 1; i < prices.length; i++) {                                              //profit[] ={7,1,5,3,6,4}    //difference b/w profit {-6,4,-2,3,-2}
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);                           // max cur = 0 as difference of 1-7=-6 less than 0 so it is 0
                                                                                         // if sum of differe go below 0 set it to  0 max(0,max+=prices[i]-prices[i-1]
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;                                                                
    }

 //like this maxcur of all array   maxcur       maxcur+=profit[i]-profit[i-1]
//                                  0               0 +=7-1=-6
//                                  4               0 +=5-1= 4
//                                  2               4 +=3-5= 2
//                                  5               2 +=6-3= 5
//                                  3               5 +=4-6= 3
//maxsoFar will be max of maxcur and maxsofar    which is 5
// so 5 will be returned
