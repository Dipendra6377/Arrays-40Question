class Compute {
    
    public int largest(int arr[], int n)
    {
        int max=-1;
        
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }
        
        return max;
    }
}
