// 451. Sort Characters By Frequency

// Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
// Return the sorted string. If there are multiple answers, return any of them.

// Input 1: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

// Input 2: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.

// Input 3: s = "Aabb"
// Output: "bbAa"
// Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class SortCharcters {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character>[] list=new List[s.length()+1];
        for(char c:hm.keySet()){
            int count=hm.get(c);
            if(list[count]==null){
                list[count]=new ArrayList<>();
            }
            list[count].add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=list.length-1;i>=0;i--){
            if(list[i]!=null){
                for (char c : list[i]) {       
                    for (int j = 0; j < i; j++) {  
                        sb.append(c);
                    }
                }

            }
        }
      
       return sb.toString();
    }
}
    

