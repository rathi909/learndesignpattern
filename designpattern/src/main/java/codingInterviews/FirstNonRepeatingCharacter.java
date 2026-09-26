package codingInterviews;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "swiss";

     /*   Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,       // maintain order
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);*/

        Character result = str.chars().mapToObj(c ->
                (char)c).collect(Collectors.
                groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(x-> x.getValue()==1).
                map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(result);
    }
}