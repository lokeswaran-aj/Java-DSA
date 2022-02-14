// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n) k%=n;
        if(n==1||k==n||k==0) return;
        reverse(nums, 0,n-1);
        reverse(nums, 0,k-1);
        reverse(nums, k,n-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}

// O(N)
// O(1)
