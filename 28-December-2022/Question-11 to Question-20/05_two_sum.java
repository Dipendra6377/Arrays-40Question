//my sOLution

//O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
    
       for(int i=0;i<n;i++){
           if(map.containsKey(nums[i])){
               int left=map.get(nums[i]);
               return new int[]{left,i};
           }
           else{
               map.put(target-nums[i],i);
           }
       }
       return new int[2];
    }
}


//Alternate solution

//O(nlogn)
	    public int[] twoSum_n2(int[] nums, int target) {
	    	if(nums == null)
	    		return null;
	    	int[] nums2 = Arrays.copyOf(nums, nums.length);
	    	Arrays.sort(nums2);
	    	int a = 0, b = 0;
	    	int start = 0, end = nums2.length-1;
	    	//find two nums
	    	while(start<end){
	    		int sum = nums2[start] + nums2[end];
	    		if(sum < target)
	    			start++;
	    		else if(sum > target)
	    			end--;
	    		else{
	    			a = nums2[start]; b = nums2[end];
	    			break;
	    		}
	    	}
	    	//find the index of two numbers
	    	int[] res = new int[2];
	    	for(int i = 0; i < nums.length; i++){
	    		if(nums[i] == a){
	    			res[0] = i;
	    			break;
	    		}
	    	}
	    	if(a != b){
	    		for(int i = 0; i < nums.length; i++){
		    		if(nums[i] == b){
		    			res[1] = i;
		    			break;
		    		}
		    	}
	    	} else{
	    		for(int i = 0; i < nums.length; i++){
		    		if(nums[i] == b && i != res[0]){
		    			res[1] = i;
		    			break;
		    		}
		    	}
	    	}
	    	
	    	return res;
	    }
