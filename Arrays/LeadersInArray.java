// Leaders in an Array

// Given an integer array nums, return a list of all the leaders in the array.
// A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

// Input 1: nums = [1, 2, 5, 3, 1, 2]
// Output: [5, 3, 2]
// Explanation:
// 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

// Input 2: nums = [-3, 4, 5, 1, -4, -5]
// Output: [5, 1, -4, -5]
// Explanation:
// -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]

import java.util.ArrayList;

public class LeadersInArray {
    public ArrayList<Integer> leaders(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n-1;i++) {
        	int max=nums[i];
        	for(int j=i+1;j<n;j++) {
        		if(nums[i]<nums[j]) {
        			max=nums[j];
        			break;
        		}
        		
        	}
        	if(max==nums[i]) {
        		list.add(max);
        	}
        }
        list.add(nums[n-1]);
        return list;
        
    }
    
}
