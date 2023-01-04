//A reverse pair is a pair (i, j) where:

//  0 <= i < j < nums.length and
//  nums[i] > 2 * nums[j].



class Solution {
    public int mergesort(int[] arr,int l,int m,int h){
        int cnt=0;
        int j=m+1;

        for(int i=l;i<=m;i++){
            while(j<=h && arr[i]>2*(long)arr[j]){
                j++;
            }
            cnt+=(j-(m+1));
        }

        ArrayList<Integer> temp=new ArrayList<>();

        int left=l; int right=m+1;

        while(left<=m && right<=h){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);  
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left<=m){
            temp.add(arr[left++]);
        }

        while(right<=h){
            temp.add(arr[right++]);
        }

        for(int i=l;i<=h;i++){
            arr[i]=temp.get(i-l);
        }

        return cnt;

    }
    public int merge(int[] arr,int l,int h){
        if(l>=h) return 0;
        
        int mid=(l+h)/2;
        int rev=merge(arr,l,mid);
        rev+=merge(arr,mid+1,h);
        rev+= mergesort(arr,l,mid,h);

        return rev;
    }
    public int reversePairs(int[] nums) {
        return merge(nums,0,nums.length-1);
    }
}
