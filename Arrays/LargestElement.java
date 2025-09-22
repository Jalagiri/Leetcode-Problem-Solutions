// Largest Element

// Given an array of integers nums, return the value of the largest element in the array

// Input 1: nums = [3, 3, 6, 1]
// Output: 6
// Explanation: The largest element in array is 6

// Input 2: nums = [3, 3, 0, 99, -40]
// Output: 99
// Explanation: The largest element in array is 99

class LargestElement {
    public int largestElement(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;

    }
    
}