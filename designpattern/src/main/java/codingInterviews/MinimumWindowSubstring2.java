package codingInterviews;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring2 {

    public static void main(String[] args) {
        MinimumWindowSubstring2 obj = new MinimumWindowSubstring2();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(obj.minWindow(s, t)); // Output: BANC
    }

    private String minWindow(String s, String t) {

        Map<Character ,Integer> targetMap = new HashMap<>();

        for(Character result: t.toCharArray())
        {
            targetMap.put(result,targetMap.getOrDefault(result,0)+1);
        }

        int[] ans ={-1,0,1};
        int left = 0,right =0;
        int formed=0;
        int required = targetMap.size();
        Map<Character ,Integer> windowMap = new HashMap<>();
        while(right<s.length())
        {
         Character c = s.charAt(right);
         windowMap.put(c, windowMap.getOrDefault(c,0)+1);

         if(targetMap.containsKey(c) && windowMap.get(c).intValue() ==
                 targetMap.get(c).intValue())
         {
             formed++;
         }

         while(left<=right && formed ==right)
         {
             Character lc = s.charAt(left);

             if(ans[0] ==-1 || right-left+1 < ans[0])
             {
                 ans[0] = right -left +1;
                 ans[1] = left;
                 ans[2] = right;
             }
             windowMap.put(lc, windowMap.get(lc)-1);
             if(targetMap.containsKey(lc) && windowMap.get(lc)< targetMap.get(lc))
             {
                 formed--;
             }
             left++;
         }
       right++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
