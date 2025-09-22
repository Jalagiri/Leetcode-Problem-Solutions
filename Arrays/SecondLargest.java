// Second Largest Element

// Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

// Input 1: nums = [8, 8, 7, 6, 5]
// Output: 7
// Explanation:
// The largest value in nums is 8, the second largest is 7

// Input 2: nums = [10, 10, 10, 10, 10]
// Output: -1
// Explanation:
// The only value in nums is 10, so there is no second largest value, thus -1 is returned

class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int largest=nums[0];
        int secondLargest=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                secondLargest=largest;
            }
            else if(nums[i]>secondLargest && nums[i]!=largest){
                secondLargest=nums[i];
            }
        }
        return secondLargest;
    
    }
}