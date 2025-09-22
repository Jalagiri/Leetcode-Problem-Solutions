// 189. Rotate Array

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

// Example 2:
// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]

class RightRotateArray {
    public void rotate(int[] nums, int k) {
        int[] temp=new int[k];
        int n=nums.length;
        k=k%n;
        int m=k;
        for(int i=n-1;i>=n-k;i--){
            temp[m-1]=nums[i];
            m--;
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        int j=0;
        for(int i=0;i<k;i++){
            nums[i]=temp[j];
            j++;

        }
     
    }
}