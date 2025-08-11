package leetcode;


import java.util.HashMap;
import java.util.Map;

class IntegerToRoman {



    public static void main(String[] args) {
        System.out.println("xxxx");


        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        String input = "LVIII";
        int result =0;
        for(Character c : input.toCharArray())
        {
            result = result + map.get(c.toString());
        }

        System.out.println(result);

    }
}
