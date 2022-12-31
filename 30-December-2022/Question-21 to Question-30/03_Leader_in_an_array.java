// simple approach O(n^2)

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code her
        ArrayList<Integer> list =new ArrayList<>();
        
        for(int i=0;i<n-1;i++){
            int leader= arr[i];
            int k=i+1;
            while(k<n &&leader>=arr[k]){
                k++;
            }
            if(k==n){
                list.add(leader);
            }
        }
        list.add(arr[n-1]);
        return list;
    }
}


//optimized code O(N)

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code her
        ArrayList<Integer> list =new ArrayList<>();
        
        int max=Integer.MIN_VALUE;
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        
        return list;
    }
}
