// Left Rotate Array by K Places

// Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.

// Input 1: nums = [1, 2, 3, 4, 5, 6], k = 2
// Output: nums = [3, 4, 5, 6, 1, 2]

// Input 2: nums = [3, 4, 1, 5, 3, -5], k = 8
// Output: nums = [1, 5, 3, -5, 3, 4]

class LeftRotateByDPlaces {
    public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[k];
        k=k%n;
        for(int i=0;i<k;i++){
            arr[i]=nums[i];
        }
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }
        int j=0;
        for(int i=n-k;i<n;i++){
            nums[i]=arr[j];
            j++;
        }
    }
}