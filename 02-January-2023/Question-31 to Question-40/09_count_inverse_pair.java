// two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.



class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long mergeInverse(long[] arr,long l,long m,long h){
        long n1=m-l+1; long n2=h-m;
        long res=0;
        
        long[] arr1=new long[(int)n1];
        long[] arr2=new long[(int)n2];
        
        for(long i=0;i<n1;i++){
            arr1[(int)i] =arr[(int)(i+l)];
        }
        for(long j=0;j<n2;j++){
            arr2[(int)j]=arr[(int)(j+m+1)];
        }
        long i=0;
        long j=0;
        long k=l;
        
        while(i<n1 && j<n2){
            if(arr1[(int)i]<=arr2[(int)j]){
                arr[(int)k++]=arr1[(int)i++];
            }
            else{
                res+=(n1-i);
                arr[(int)k++]=arr2[(int)j++];
            }
        }
        
        while(i<n1){
            arr[(int)k++] =arr1[(int)i++];
            
        }
        while(j<n2){
            arr[(int)k++] =arr2[(int)j++];
        }
        return res;
    }
    static long merge(long[] arr,long l,long h){
        long res=0;
        if(l<h){
            long m=(l+h)/2;
            res+=merge(arr,l,m);
            res+=merge(arr,m+1,h);
            res+=mergeInverse(arr,l,m,h);
        }
        return res;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long ans=merge(arr,0,N-1);
        return ans;
        
    }
