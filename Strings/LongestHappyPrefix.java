// 1392. Longest Happy Prefix

// A string is called a happy prefix if is a non-empty prefix which is also a suffix (excluding itself).
// Given a string s, return the longest happy prefix of s. Return an empty string "" if no such prefix exists.

// Input 1: s = "level"
// Output: "l"
// Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".

// Input 2: s = "ababab"
// Output: "abab"
// Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.

class LongestHappyPrefix {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; 
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int longest = lps[n - 1]; 
        return s.substring(0, longest);
    }
}
