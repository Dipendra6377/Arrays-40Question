class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int first=-1;
        int second=-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]<first && arr[i]>second){
                second =arr[i];
            }
        }
        return second;
    }
}
