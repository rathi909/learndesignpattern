package FunctionalInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Coding {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        Set<Integer> unique = new HashSet<>();

        numbers.stream().filter(
                x -> !unique.add(x)
        ).collect(Collectors.toList()).forEach(System.out::println);

        //Frequency of each charater
        String input = "programming";

       Map<Character,Long> map = input.chars().mapToObj(c -> (char) c).collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting()) );

       System.out.println(map);


       //Find First Non repeating characer

        String str = "aabbcdde";

        System.out.println(str.chars().mapToObj(c-> (char) c).collect(Collectors.
                groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue()==1).
                findFirst().orElse(null));

        List<Integer> list =
                Arrays.asList(5,8,9,2,4,9,7);

        System.out.println(list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).
                findFirst().orElse(null));

    }
}
