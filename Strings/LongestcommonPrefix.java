// 14. Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Input 1: strs = ["flower","flow","flight"]
// Output: "fl"

// Input 2: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.


import java.util.Arrays;
public class LongestcommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                i++;
            }
            else break;
            
        }
        return i>0 ? str1.substring(0,i):"";
    }
}
    

