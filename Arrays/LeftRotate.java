// Left Rotate Array by One

// Given an integer array nums, rotate the array to the left by one.

// Input 1: nums = [1, 2, 3, 4, 5]
// Output: [2, 3, 4, 5, 1]
// Explanation:
// Initially, nums = [1, 2, 3, 4, 5]
// Rotating once to left -> nums = [2, 3, 4, 5, 1]

// Input 2: nums = [-1, 0, 3, 6]
// Output: [0, 3, 6, -1]
// Explanation:
// Initially, nums = [-1, 0, 3, 6]
// Rotating once to left -> nums = [0, 3, 6, -1]

class LeftRotate {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
    
}   