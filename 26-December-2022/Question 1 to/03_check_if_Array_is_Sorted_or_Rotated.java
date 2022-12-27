class Solution {
    public boolean check(int[] nums) {
        boolean arrayDecrease = false;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(arrayDecrease==true){
                    return false;
                }
                else{
                    arrayDecrease=true;
                }
            }
        }
        return !arrayDecrease || nums[nums.length-1]<=nums[0];
    }
}
