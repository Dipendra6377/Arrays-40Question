class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        
        
        
        ArrayList<Integer> list=new ArrayList<>(set);
        
        Collections.sort(list);
        
        return list;
    }
}

