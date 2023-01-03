class Solution{
    static int subsetXOR(int arr[], int n, int k) {
        // code here
        int max_ele = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max_ele)
                max_ele = arr[i];

    // Maximum possible XOR value
    int m = (1 << (int)(Math.log(max_ele)/Math.log(2) + 1)) - 1;
    if (k > m)
        return 0;
        int[][] dp = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=0;
            }
        }
        
        dp[0][0]=1;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=dp[i-1][j]+dp[i-1][j^arr[i-1]];
            }
        }
        return dp[n][k];
    }
}
