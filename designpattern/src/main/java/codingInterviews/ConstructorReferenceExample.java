package codingInterviews;

import java.util.function.Supplier;

class Person {
    private String name;

    public Person() {
        this.name = "Default Name";
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        System.out.println(person);
    }
}
