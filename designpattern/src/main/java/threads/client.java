package threads;

import java.util.concurrent.*;

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Running");
    }
}
public class client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread = new Thread(new RunnableThread());
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("x");

        });
        thread1.start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = () -> {
            return 1000;
        };
        Runnable ru = () ->{System.out.println("Do something");};

        executor.execute(ru);

        Future<Integer>  future =  executor.submit(callable);

        System.out.println(future.get());

        System.out.println(callable);
    }
}