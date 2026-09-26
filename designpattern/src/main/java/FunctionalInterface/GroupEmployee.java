package FunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;

class Employee2 {

    String name;
    String department;

    Employee2(String n, String d){
        name=n;
        department=d;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}

public class GroupEmployee{

    public static void main(String[] args){

        List<Employee2> list=Arrays.asList(
                new Employee2("John","IT"),
                new Employee2("Alex","IT"),
                new Employee2("Mary","HR"));


       Map<Object,List<Employee2>> map =list.stream().collect(Collectors.groupingBy(employee -> employee.
                department));

       System.out.println(map);


    }
}