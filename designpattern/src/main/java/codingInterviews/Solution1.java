package codingInterviews;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longest =0;

        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
        {
            if(set.contains(c))
            {
            longest = set.size();
            set.clear();

            }
            else{
                set.add(c);
            }
    
        }
        return longest;
        
    }
}