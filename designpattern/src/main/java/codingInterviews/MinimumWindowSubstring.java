package codingInterviews;

import java.util.*;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map for characters in t
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size(); // unique chars needed
        int formed = 0; // how many chars currently satisfy required frequency

        Map<Character, Integer> windowMap = new HashMap<>();

        int left = 0, right = 0;
        int[] ans = {-1, 0, 0}; // length, left, right

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (targetMap.containsKey(c) &&
                windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update answer
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                // Remove from window
                windowMap.put(c, windowMap.get(c) - 1);
                if (targetMap.containsKey(c) &&
                    windowMap.get(c).intValue() < targetMap.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(obj.minWindow(s, t)); // Output: BANC
    }
}