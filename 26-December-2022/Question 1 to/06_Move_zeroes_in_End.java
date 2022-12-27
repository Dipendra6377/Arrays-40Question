// Better solution
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;

        for(int i=0;i<n;i++){
            if(nums[j]!=0){
                j++;
                continue;
            }
            if(nums[j]==0){
                if(nums[i]!=0){
                    swap(nums,i,j);
                    j++;
                }
            }
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}




//Altenate solution
class Solution {
    public void moveZeroes(int[] nums) {
        int ptr0= 0, ptr1= 0, n= nums.length;

        while (ptr0 < n && ptr1 < n) {
            if (nums[ptr0] != 0) {
                ptr0++;
            }

            else if (nums[ptr1] != 0) {
                nums[ptr0]= nums[ptr1];
                nums[ptr1]= 0;
                ptr0++;
            }

            ptr1++;
        }
    }
}
