class Solution{
    static int subsetXOR(int arr[], int n, int k) {
        // code here
        int xorr=0;
        int cnt=0;
        
        HashMap<Integer,Integer> visited = new HashMap<>();
        
        int c = 0; 
        int cpx = 0;
        //int n = A.length;
        for(int i = 0;i<n;i++) {
            cpx = cpx ^ arr[i]; 
            if(visited.get(cpx^k) != null) 
                c += visited.get(cpx ^ k); 
            if(cpx == k) {
                c++; 
            }
            if(visited.get(cpx) != null) 
                visited.put(cpx, visited.get(cpx) + 1); 
            else 
                visited.put(cpx, 1); 
        }
        return c; 
    }
}
