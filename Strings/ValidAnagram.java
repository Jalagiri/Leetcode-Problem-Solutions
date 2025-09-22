// 242. Valid Anagram

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Input 1: s = "anagram", t = "nagaram"
// Output: true

// Input 2: s = "rat", t = "car"
// Output: false
import java.util.Arrays;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
         char[] c1=s.toCharArray();
         char[] c2=t.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
         return Arrays.equals(c1,c2);
        
        
    }
}

