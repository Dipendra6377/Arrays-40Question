class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0;
        int max=0;
        
        for(int i=0;i<n;i++){
             sum+=arr[i];
             if(sum==0){
                 max=Math.max(max,i+1);
             }
             
             if(!map.containsKey(sum)){
                 map.put(sum,i);
             }
             else{
                 max=Math.max(i-map.get(sum),max);
             }
        }
        return max;
    }
}
