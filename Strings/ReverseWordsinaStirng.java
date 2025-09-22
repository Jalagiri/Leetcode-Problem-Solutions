// 151. Reverse Words in a String

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// Input 1: s = "the sky is blue"
// Output: "blue is sky the"

// Input 2: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

// Input 3: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ReverseWordsinaStirng {
   
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        List<String> res=Arrays.asList(str);
        Collections.reverse(res);
        return String.join(" ",res);
    }
}


    

