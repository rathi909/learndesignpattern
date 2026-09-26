package codingInterviews;

import java.util.*;

public class GroupAnagrams {



    public static void main(String[] args) {

        String[]  input ={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));


    }

    private static Collection<List<String>> groupAnagrams(String[] input) {
        Map<String,List<String>> map = new HashMap<>();

        for(String string:input)
        {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(map.containsKey(s))
            {
                map.get(s).add(string);
            }
            else{
                map.put(s,new ArrayList<>(Arrays.asList(string)));
            }

        }

        return map.values();


    }

}
