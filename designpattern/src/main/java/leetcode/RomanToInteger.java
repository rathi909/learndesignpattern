package leetcode;

import java.util.*;

public class RomanToInteger {

    public static int romanToInt(String s) {
        // Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currVal = romanMap.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (currVal < nextVal) {
                result -= currVal;
            } else {
                result += currVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println("Integer value: " + romanToInt(roman)); // Output: 1994
    }
}
