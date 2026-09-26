package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {

        String roman= "MCMXCIV";
       System.out.println(romanToInt(roman));
    }

    private static  Integer romanToInt(String roman) {
        Map<Character, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char[] characters = roman.toCharArray();
        Integer result =0;
        for (int i = 0; i < characters.length; i++) {

            if (i < characters.length - 1 && romanMap.get(characters[i]) < romanMap.get(characters[i + 1])) {
                Integer integer = romanMap.get(characters[i+1]) - romanMap.get(characters[i]);
                result = result + integer;
                i=i+1;
            } else {
                result = result + romanMap.get(characters[i]);
            }
        }
        return result;
    }
    }