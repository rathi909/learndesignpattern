package codingInterviews;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) throws IOException {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(x -> System.out.println(x));


        Collections.sort(names, Comparator.comparingInt(String::length));
        Collections.sort(names,(a,b) -> a.compareTo(b) );
        System.out.println(names);


        List<String> names1 = Arrays.asList("John", "Jane", "Tom", "Alice", "John");


        // Filter names starting with "J" and collect them into a new list
        List<String> names2 = names1.stream().filter(x-> x.startsWith("J")).collect(Collectors.toList());
        System.out.println(names2);

        names1.stream().map(String::toUpperCase).collect(Collectors.toList());

        File file = new File("C:\\Users\\sunrathi\\Documents\\SlinghshotMcr.txt");

        Scanner scanner = new Scanner(file);

       while (scanner.hasNext())
       {
           System.out.println(scanner.nextLine());
       }
       scanner.close();

       File file1 = new File("C:\\Users\\sunrathi\\Documents\\SlinghshotMcr.txt");

       Scanner scanner2  = new Scanner(file);
       while(scanner2.hasNext())
       {
           System.out.println(scanner2.nextLine());
       }
       scanner2.close();
        /*String content = Files.readString(
                Path.of("C:\\Users\\sunrathi\\Documents\\SlinghshotMcr.txt"));

        System.out.println(content);*/

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate the sum of all numbers
        int sum = numbers.stream().reduce(0,Integer::sum);

        System.out.println(sum);

        List<String> items =
                Arrays.asList("apple", "banana", "orange", "apple", "banana");

        Map<Object, Long> map1=
                items.stream().collect(Collectors.groupingBy(x -> x,Collectors.counting()));
        System.out.println(map1 + "Map collector");



      Map<Object, Long> map = items.stream().collect(
              Collectors.groupingBy(x -> x,Collectors.counting()));

      System.out.println(map);


      Optional<String> optional = Optional.of("Hello");

      optional.ifPresent(System.out::println);



    }

    public static Optional<String>  findUserById(int id) {
        return id == 1 ?
                Optional.of("User1") : Optional.empty();
    }
}
