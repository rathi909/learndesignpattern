package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Greeting geGreeting = () -> System.out.println("function");

        geGreeting.sayGrreting();

        Summer summer = (a,b) ->
        {return a+b;};
       System.out.println(summer.sum(5,6));

        Predicate<Integer> predicate = (a)-> {return a % 2 == 0;
        };

       System.out.println(predicate.test(4));


        Consumer  consumer = (a) -> System.out.println(a);

        consumer.accept(1);

        Supplier s = () -> "123";
        System.out.println(s.get());

        Function<String,Integer> function = str -> str.length() ;
        function.apply("sunny");

        Welcome welcome = () -> System.out.println("Print");

        welcome.welcome();

        Difference difference = (a,b) -> {return a-b;};
        System.out.println(difference.diff(10,5));

        Predicate<Integer> predicate1 = (a) -> {return  a%2 == 0;};

        System.out.println(predicate1.test(4));
        Consumer<Integer> a = (a1)-> System.out.println(a1);

        a.accept(6);

        Supplier<Integer> supplier = () -> 123;

        supplier.get();

    }


}
