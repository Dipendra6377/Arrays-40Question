//brute force (12ms)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int x: map.keySet()){
            if(map.get(x)>nums.length/3){
                res.add(x);
            }
        }
        
        return res;
    }
}


//optimised approach (1ms)

import java.util.ArrayList;
import java.util.List;

public class Rotated_array {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,3};
        List<Integer> res=find(arr,arr.length);

        for (int x:res){
            System.out.print(x+" ");
        }

    }

    public static List<Integer> find(int[] nums,int n){

        int element1 =-1,element2=-1,count1=0,count2=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==element1)
                count1++;
            else if(nums[i]==element2)
                count2++;
            else if(count1==0){
                element1=nums[i];
                
                count1=1;
            }else if(count2==0){
                element2=nums[i];
                count2=1;
            }else{
                
                count1--;
                count2--;
            }
        }
        
        count1=0;count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==element1)
                count1++;
            else if(nums[i]==element2)
                count2++;
        }
        if(count1>(nums.length)/3)
            ans.add(element1);
        if(count2>(nums.length)/3)
            ans.add(element2);

        return ans;

    }
}
