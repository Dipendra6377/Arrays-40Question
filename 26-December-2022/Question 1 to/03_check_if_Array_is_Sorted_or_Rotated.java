//Best solution

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

//Altenate solution

class Solution {
	public boolean check(int[] a) {
		 int c=0;
		 if(a[0]<a[a.length-1])c++;
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1])c++;

		}


		return c<=1;
	}

}
