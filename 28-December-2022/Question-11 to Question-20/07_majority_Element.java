class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
            }
            if(ele!=nums[i]){
                count--;
            }
            else{
                count++;
            }
        }

        count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                count++;
            }
        }
        if(count>nums.length/2){
            return ele;
        }
        return -1;
    }
}
