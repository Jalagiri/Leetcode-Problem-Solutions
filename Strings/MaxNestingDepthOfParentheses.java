// 1614. Maximum Nesting Depth of the Parentheses

// Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

// Input 1: s = "(1+(2*3)+((8)/4))+1"
// Output: 3
// Explanation:
// Digit 8 is inside of 3 nested parentheses in the string.

// Input 2: s = "(1)+((2))+(((3)))"
// Output: 3
// Explanation:
// Digit 3 is inside of 3 nested parentheses in the string.

// Input 3: s = "()(())((()()))"
// Output: 3

public class MaxNestingDepthOfParentheses {
    public int maxDepth(String s) {
        int depth=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                depth++;
            max=Math.max(depth,max);
            }
            else if(c==')'){
                depth--;
            }

        }
        return max;
    }
}

