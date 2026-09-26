package programmingJava8AndAbove;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class JavaGroupBy {
    public static void main(String[] args) {
        List<Person1> persons = List.of(
                new Person1(1, "Alex", 100d, new Department(1, "HR")),
                new Person1(2, "Brian", 200d, new Department(1, "HR")),
                new Person1(3, "Charles", 900d, new Department(2, "Finance")),
                new Person1(4, "David", 200d, new Department(2, "Finance")),
                new Person1(5, "Edward", 200d, new Department(2, "Finance")),
                new Person1(6, "Frank", 800d, new Department(3, "ADMIN")),
                new Person1(7, "George", 900d, new Department(3, "ADMIN")));

        System.out.println(persons.stream().collect(Collectors.groupingBy(Person1::getDepartment,
                Collectors.mapping(Person1::getId,Collectors.toList()))));

        Map<Department,List<Person1>> map= persons.stream().
             collect(groupingBy(Person1::getDepartment));

     System.out.println(map);




     //we wish to collect only the person ids in all departments
        Map<Department,List<Integer>> list =   persons.stream().
                collect(groupingBy(Person1::getDepartment,
                        Collectors.mapping(Person1::getId,Collectors.toList())));

        System.out.println(list);

        Map<Department, Long> map1 = persons.stream().collect
                (groupingBy(Person1::getDepartment,
                counting()));

        System.out.println(map1);

        Map<Double, Long> map5 = persons.stream()
                .collect(groupingBy(Person1::getSalary, counting()));

        System.out.println(map5);

    }
}
