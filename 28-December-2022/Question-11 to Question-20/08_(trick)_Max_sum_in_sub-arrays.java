class Solution {
    
    public static long pairWithMaxSum(long arr[], long n)
    {
        // Your code goes here
        long sum=0;
        long max=-1;
        
        for(int i=0;i<n-1;i++){
            sum=arr[i]+arr[i+1];
            max=Math.max(sum,max);
        }
        return max;
    }
}
