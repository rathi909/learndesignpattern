package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class IntegerRoman1 {


    public static void main(String[] args) {

        System.out.println(intToRoman(3749));

    }
    public static  String intToRoman(int num) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        List<Integer> list = map.keySet().stream().toList();
        int largestNum =0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int value :list) {
        while(num>= value) {
            num = num - value;
            stringBuilder.append(map.get(value));
                }
            }
       return  stringBuilder.toString();
        
    }
}