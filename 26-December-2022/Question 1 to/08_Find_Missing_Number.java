// My solution(not so better)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]==1){
            return 0;
        }

        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]-1){
                return i+1;
            }
        }
        return n;
    }
}

//Alternate solution(better)(CYCLE SORT)
class Solution {
    public int missingNumber(int[] nums) {
        cyclesort(nums);
        return findElt(nums);        
    }
    public int findElt(int arr[]){

        int i =0;

        while(i < arr.length){
            if(i == arr[i]) i++;
            else return i;
        }
        return i;
    }
    public void cyclesort(int [] arr){
        int i = 0;

        while(i < arr.length){
            int corect = arr[i];
            if(corect < arr.length && arr[i] != arr[corect]){
                int temp = arr[i];
                arr[i] = arr[corect];
                arr[corect] = temp ;
            } 
            else i++;
        }
    }
}

//Alternate(Best) (Using sum and subtract array sum)
class Solution {
    public int missingNumber(int[] nums) {
        double hypothetical = nums.length * (nums.length + 1) / 2;
        int actual = 0;

        for(int x: nums) {
            actual += x;
        }

        return (int)(hypothetical) - actual;
    }
}

