package codingInterviews;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "dvdf";
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring(input));
    }

    private  int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
        {
            return 0;
        }
        if(s.length()==1)
        {
            return 1;
        }
        List<Character> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int maxnumLength =Integer.MIN_VALUE;
        String maxSubstring = null;
        for(Character ch:s.toCharArray())
        {

            if(list.contains(ch))
            {
                list = new ArrayList<>();
                list.add(ch);
                left=right;
            }
            else {
                list.add(ch);
                right++;
            }
            if(list.size()>maxnumLength)
            {
                maxnumLength = list.size();
                maxSubstring = list.toString();
            }

        }

        System.out.println(maxSubstring);
        return maxnumLength;
    }
}
