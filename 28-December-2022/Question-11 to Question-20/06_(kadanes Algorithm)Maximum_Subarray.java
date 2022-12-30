//Solution

class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int max_Of_Array = 0;
        int start=0;
        int end=0; int s=0;

        for(int i=0;i<nums.length;i++){
            max_Of_Array+=nums[i];

            if(max_Of_Array>max){
                max=max_Of_Array;
                start=s;
                end=i;
            }

            if(max_Of_Array<0){
                max_Of_Array=0;
                s=i+1;
          
            }
        }
        return max;

    }
}


//Alternate Approach using DP

class Solution {
    public int maxSubArray(int[] nums) {
        /**
            -2,1,-3,4,-1,2,1,-5,4
            dp 
        */
        int[] dp = new int[nums.length];
        
        dp[0]=nums[0];
        int max = dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(nums[i], nums[i]+dp[i-1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
