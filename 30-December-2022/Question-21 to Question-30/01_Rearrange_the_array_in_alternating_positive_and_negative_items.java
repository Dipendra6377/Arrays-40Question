//MY solution  (9ms)

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int j=0;int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=pos[j];
                j++;
            }
            else{
                ans[i]=neg[k];
                k++;
            }
        }
        return ans;
    }
}


//Better solution (~ 3ms)



class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int i=0;
        int j=1;

        for(int x:nums){
            if(x>0){
                ans[i]=x;
                i+=2;
            }
            else{
                ans[j]=x;
                j+=2;
            }
        }
        return ans;
    }
}
