// 28. Find the Index of the First Occurrence in a String

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Input 1: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Input 2: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

public class FirstOccurenceInString {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            int k=i+m;
            if(haystack.substring(i,k).equals(needle)){
                return i;
          
            }
            
        }
        return -1;
    }
}

