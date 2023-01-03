//int[] arr={1000000000,1000000000,1000000000,1000000000};
       // int target=-294967296;

//if we take sum of all element as int as the sum is greater than int max so it total sum will be -294967296 and it will show wrong output so convert it into long;


// run time (76ms)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        long tar = (long)target;
        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        
        

        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int k=j+1;  int l=n-1;

                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];  //(long)(nums[i]+nums[j]+nums[k]+nums[l]) this will be also treated as int as there will be no bracket wrap around sum 
                    

                    
                    if(sum==tar){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k+1]){
                            k++;
                        }
                        k++;
                        while(k<l && nums[k]==nums[k-1]){
                            l--;
                        }
                        l--;
                    }

                    else if (sum>tar){
                        l--;

                    }
                    else {
                        k++;
                    }
                }
            }
        }

        return new ArrayList<>(set);

    }
}



// to decrease run time to 8ms;



class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        long tar = (long)target;
        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        
        

        for(int i=0;i<n-3;i++){
          
            if (i > 0 && nums[i] == nums[i - 1]) continue;  //skip same element
            if((long) nums[i] + (long) nums[i+1] + (long) nums[i+2] + (long) nums[i+3] > (long) target) break;
            if((long) nums[i] + (long) nums[n-3] + (long) nums[n-2] + (long) nums[n-1] < (long) target) continue;  // this code skip if the sum of all element greater than target

            int remain=target-nums[i];

            for(int j=i+1;j<n-2;j++){
              
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if((long) nums[j] + (long) nums[j+1] + (long) nums[j+2] > (long) remain) break;
                if((long) nums[j] + (long) nums[n-2] + (long) nums[n-1] < (long) remain) continue;
              
              
                int k=j+1;  int l=n-1;

                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    

                    
                    if(sum==tar){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k+1]){
                            k++;
                        }
                        k++;
                        while(k<l && nums[k]==nums[k-1]){
                            l--;
                        }
                        l--;
                    }

                    else if (sum>tar){
                        l--;

                    }
                    else {
                        k++;
                    }
                }
            }
        }

        return new ArrayList<>(set);

    }
}
