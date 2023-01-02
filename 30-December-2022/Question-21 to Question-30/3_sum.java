// My solution (brute force) take really long time (1149 ms)


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();

        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;  int k=nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]+nums[i]==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;  // by adding this it will reduce time to 668 ms 
                    k--;
                }

                else if(nums[j]+nums[k]+nums[i]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);

    }
}


// it will reduce to 50 ms

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();

        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;  int k=nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]+nums[i]==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]){   // it wil skip duplicate element
                        j++;
                    }
                    j++;
                    while(j<k && nums[k]==nums[k-1]){  // this is alse skip duplicate element
                        k--;
                    }
                    k--;
                }

                else if(nums[j]+nums[k]+nums[i]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);

    }
}
