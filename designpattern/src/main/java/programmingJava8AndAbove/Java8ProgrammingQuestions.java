package programmingJava8AndAbove;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ProgrammingQuestions {


    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(10,15,8,49,25,98,32);

       List<Integer> oddList = lists.stream().filter(x-> x%2!=0).collect(Collectors.toList());
       System.out.println(oddList);

        List oddInteger = lists.stream().filter(x-> x%5==0).collect(Collectors.toList());
        System.out.println(oddInteger);



        List<Integer> listeven = lists.stream().filter(x-> (x%2==0)).collect(Collectors.toList());

        System.out.println(listeven);

        int[] arr = {10,15,8,49,25,98,32};

        Map<Object, List<Integer>> map12 = Arrays.stream(arr).boxed().collect(Collectors.
                groupingBy( x -> x%2==0));
        System.out.println(map12);


        /*Map<Boolean,List<Integer>> map = Arrays.stream(arr).
                boxed().collect(Collectors.
                partitioningBy(x-> (x%2==0)));
        System.out.println(map);
        System.out.println(map.get(true));*/

///////////strt wit one
        System.out.println("one ones");

        lists.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList()).
                forEach(System.out::println);

        /*lists.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList()).
                forEach(System.out::println);*/


        //////find first
        System.out.println("FIRST");
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);

        myList.stream().forEach(System.out::println);

        System.out.println("Max");

        System.out.println(myList.stream().max(Integer::compareTo).get().intValue());
        String string =  myList.stream().max(Integer::compareTo).get().toString();
        System.out.println(string);
        String s = "Devanand";
        Map<String,Long> map1= Arrays.stream(s.split("")).
                map(String::toLowerCase).collect(Collectors.
                groupingBy(x-> x, LinkedHashMap::new,Collectors.counting()));

        System.out.println(map1);

   Map map34 = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.
                        groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));

        System.out.println(map34);

        


        List<Person> people = Arrays.asList(
                new Person("Alice", "London"),
                new Person("Bob", "Paris"),
                new Person("Charlie", "London"),
                new Person("David", "Paris"),
                new Person("Eve", "Berlin")
        );

        ///4️⃣ Group by city AND sort people by name
        people.stream().collect(
                Collectors.groupingBy(Person::getCity,
                        LinkedHashMap::new,Collectors.
                                collectingAndThen(Collectors.toList(),list ->{
                                    list.sort(Comparator.comparing(Person::getName));
                                return list;
                                })));

        Map<String, List<Person>> result1 = new LinkedHashMap<>();
        people.stream().collect(Collectors.groupingBy(Person::getCity)).forEach
                ((city,list)-> {
            list.sort(Comparator.comparing(Person::getName));
            result1.put(city, list);
        });



        Map<String,List<Person>>  listMap = people.stream().collect(Collectors.
                groupingBy(x-> x.getCity()));


        people.stream().collect(Collectors.groupingBy(Person::getCity,
                LinkedHashMap::new,Collectors.collectingAndThen(
                        Collectors.toList(),list ->{
                    list.sort(Comparator.comparing(Person::getName));
                return list;
                })));

        System.out.println(listMap);

        ///4️⃣ Group by city AND sort people by name
        Map<String, List<Person>> result = new LinkedHashMap<>();

        people.stream().collect(Collectors.groupingBy(Person::getCity)).
                forEach((city,list) -> {
                            list.sort(Comparator.comparing(Person::getName));
                            result.put(city, list);
                        });

                    ///4️⃣ Group by city AND sort people by name
        Map<String, List<Person>> groupedAndSorted =

        people.stream().collect(Collectors.groupingBy(Person::getCity,
                LinkedHashMap::new,
                Collectors.collectingAndThen(Collectors.toList(),list-> {
                            list.sort(Comparator.comparing(Person::getName));
                            return list;
                        }
                )));

        System.out.println(groupedAndSorted);


        //List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        //java
        //Copy codezz

        List<Integer> nums111 = List.of(1, 2, 3, 4, 5, 6);

        nums111.stream().collect(Collectors.groupingBy(
                n -> n%2 ==0 ? "Even" : "ODD",LinkedHashMap::new,
                Collectors.summingInt(Integer::intValue)
        )).entrySet().stream().forEach(System.out::println);


        int[] par = { 99, 55, 203, 99, 4, 91 };
        Arrays.sort(par);
        // Sorted the Array using parallelSort()

        Arrays.stream(par).forEach(n -> System.out.print(n + " "));

//        List<Integer> list = List.of(1,2,3,4,5);
//        int sum = 0;
//
//        list.parallelStream().forEach(n -> sum += n); // ❌


        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(i -> i*i*i).filter(i -> i>50).forEach(
                System.out::println);

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
        concatStream.forEach(System.out::println);

        int[] nums = {1,2,3,1};

        List<Integer> intnum = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(intnum);

        if(intnum.size() == set.size())
        {
            System.out.println("no uplicate");
        }
        else{
            System.out.println(" duplicate");

        }

        Set<Integer> set1 = new HashSet<>();


        System.out.println( intnum.stream().anyMatch(x -> !set1.add(x)));

        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList1.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);



        List<String> list3 = Arrays.asList("explained", "through", "programs");

        list3.stream().map(String::toUpperCase).collect(Collectors.toList()).
                forEach(System.out::println);


        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11L));
        noteLst.add(new Notes(2, "note2", 22L));
        noteLst.add(new Notes(3, "note3", 33L));
        noteLst.add(new Notes(4, "note4", 44L));
        noteLst.add(new Notes(5, "note5", 55L));

        noteLst.add(new Notes(6, "note4", 66L));

        noteLst.stream().sorted(Comparator.comparingLong(Notes::getTagId).
                reversed()).collect(Collectors.toMap(Notes::getTagName,
                Notes::getTagId,(oldValue, newValue)-> newValue,LinkedHashMap::new));


        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

        namesCount.entrySet().stream().filter(x-> x.getValue()==2).
                forEach(System.out::println);


        List<Integer> myList11 = Arrays.asList(10,15,8,49,25,98,98,32,15);


        Integer max = myList11.stream().max(Integer::compare).get();

        System.out.println(max);

        Integer max1 = myList11.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max1);

        //JAVA FIND CONSECUTIVE DUPLICATE IN STRING USING JAVA 8

        //JAVA find occurenece in string who value is 1

        String myString = "sunny";
        Map<Character, Long> map3=  myString.chars().mapToObj(c->
                (char)c).collect(Collectors.
                 groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map3);

        map3.values().stream().filter(x -> x>1).forEach(
                System.out::println
        );

        Map<Character,Long> map4 = myString.
                chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                ));

        System.out.println(map4);
        map4.values().stream().filter(x-> x>2).
                forEach(System.out::println);



    }
}
