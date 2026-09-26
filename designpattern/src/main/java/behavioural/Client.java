package behavioural;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        CustomPredicate customPredicate = (x) -> {
            return (x % 2 == 0 ? true : false);
        };
       customPredicate.isEvenNumber(10);

       List<Employee3> list = new ArrayList<>(100000);

      List<Integer> ids = list.stream().filter(x-> x.
              getName().startsWith("s")).map(Employee3::getId).
              collect(Collectors.toList());

        List<Integer> list1 = Arrays.asList(1,3,4);




    }
    }
