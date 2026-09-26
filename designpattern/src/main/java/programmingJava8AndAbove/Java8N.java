package programmingJava8AndAbove;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

public class Java8N {
    public static void main(String[] args) {
        System.out.println("FIRST");
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream().forEach(System.out::println);
        System.out.println("-------------------");

        myList.parallelStream().forEach(System.out::println);

        String s= "JavA 17";

        if(s instanceof  String )
        {

        }
        Thread.startVirtualThread(()-> {System.out.println("Virtual Thread");});

        try(var executor = Executors.newVirtualThreadPerTaskExecutor()){
            for(int i=0;i<10;i++)
            {
                int taskId =i;
                executor.submit(()->{
                    System.out.println(""+ taskId + Thread.currentThread());
                });
            }
        }

    }
}
