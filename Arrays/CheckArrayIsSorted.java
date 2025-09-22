// Check if the Array is Sorted II

// Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

// Input 1: nums = [1, 2, 3, 4, 5]
// Output : true
// Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.

// Input 2: nums = [1, 2, 1, 4, 5]
// Output : false
// Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.

class CheckArrayIsSorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        boolean result=true;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                result=false;
                break;
            }

        }
        return result;
    }
}