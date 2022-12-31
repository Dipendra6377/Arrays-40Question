class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int max=0;

        for(int i=0;i<n;i++){
            if(!set.contains(nums[i]-1)){
                int currentnum=nums[i];
                int currentlong=1;

                while(set.contains(currentnum+1)){
                currentnum+=1;
                currentlong+=1;
            }
            max=Math.max(max,currentlong);

            }
        }
        return max;
    }
}
