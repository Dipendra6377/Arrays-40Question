class Solution{
    static int searchInSorted(int arr[], int n, int k)
    {
        
        // Your code here
        int i=0;
        int j=n-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr[mid]==k){
                return 1;
            }
            else if(arr[mid]<k){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
    
}
