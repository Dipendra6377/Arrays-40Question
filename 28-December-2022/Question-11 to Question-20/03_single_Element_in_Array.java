class Solution {
    public int singleNumber(int[] nums) {
        int result=0;

        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
}


//1      1   =    0
//0      0   =    0
//same number will alway give 0
