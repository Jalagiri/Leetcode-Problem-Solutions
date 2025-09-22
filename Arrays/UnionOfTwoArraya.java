// Union of two sorted arrays

// Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
// The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

// Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
// Output 1: [1, 2, 3, 4, 5, 7]
// Explanation:
// The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

// Input 2: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
// Output: [1, 3, 4, 5, 6, 7, 8, 9]
// Explanation:
// The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2

import java.util.ArrayList;
class UnionOfTwoArraya{
   public int[] unionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
            }
            else{
                if(list.isEmpty()|| list.get(list.size()-1)!=nums2[j]){
                    list.add(nums2[j]);
                }
                j++;
            }
        }
        while(i<n){
        	if(list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);
            }
            i++;
        }
        while(j<m){
        	if(list.isEmpty()|| list.get(list.size()-1)!=nums2[j]){
                list.add(nums2[j]);
            }
            j++;
        }
        int[] unionArray=new int[list.size()];
 
        for(int k=0;k<list.size();k++ ){
            unionArray[k]=list.get(k);

        }
        return unionArray;
    }
}