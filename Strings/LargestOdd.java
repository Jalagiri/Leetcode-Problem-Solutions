// 1903. Largest Odd Number in String

// You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
// A substring is a contiguous sequence of characters within a string.

// Input 1: num = "52"
// Output: "5"
// Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

// Input 2: num = "4206"
// Output: ""
// Explanation: There are no odd numbers in "4206".

// Input 3: num = "35427"
// Output: "35427"
// Explanation: "35427" is already an odd number.


public class LargestOdd {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    
}
