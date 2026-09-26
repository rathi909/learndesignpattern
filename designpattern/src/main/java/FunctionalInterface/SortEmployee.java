package FunctionalInterface;

import java.util.*;

class Employee1 {

    int id;
    String name;
    double salary;

    Employee1(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return name+" "+salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class SortEmployee {

    public static void main(String[] args) {

        List<Employee1> employees = Arrays.asList(
                new Employee1(1,"John",80000),
                new Employee1(2,"Alex",60000),
                new Employee1(3,"David",80000));

        employees.stream().sorted(Comparator.comparing(Employee1::getSalary).
                reversed().thenComparing(Comparator.comparing(Employee1::getName))).
                forEach(System.out::println);


        //8. Highest Paid Employee

        employees.stream().sorted(Comparator.comparing(Employee1::getSalary).
                reversed()).findFirst().orElse(null);

    }
}