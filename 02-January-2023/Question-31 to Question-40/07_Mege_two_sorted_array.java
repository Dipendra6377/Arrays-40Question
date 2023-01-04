class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n-1,a=m-1,b=n-1;b>=0;i--){
            if(a>=0 && nums1[a]>nums2[b]){
                nums1[i]=nums1[a--];
            }
            else
                nums1[i]=nums2[b--];
        }
    }
}


//   https://leetcode.com/problems/merge-sorted-array/solutions/2120234/visual-explanation-o-1-space-java/
