package codingInterviews;

import java.util.concurrent.*;

public class FutureCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture.supplyAsync(() -> "Hello supplysync")
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println);

        CompletableFuture.supplyAsync(() -> "suny").thenApply(x->x.toUpperCase()).
                thenAccept(System.out::println);

        System.out.println(future.get());
        ExecutorService executor = Executors.newSingleThreadExecutor();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(()-> System.out.println("sssss"));
        executorService.submit(() -> "sssss");

        Future<String> future1 = executor.submit(() -> "Hello futur");

        String result = future1.get();
        System.out.println(result);

        CompletableFuture<Void> future12 =
                CompletableFuture.runAsync(() -> {
                    System.out.println("Running");
                });

        CompletableFuture<String> future3 =
                CompletableFuture.supplyAsync(() -> "Hello future3");

        CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        CompletableFuture<String> future6 =
                CompletableFuture.supplyAsync(() -> "java")
                        .thenApply(String::toUpperCase);

        CompletableFuture<CompletableFuture<String>> nested =
                CompletableFuture.supplyAsync(() -> "John")
                        .thenApply(name ->
                                CompletableFuture.supplyAsync(
                                        () -> "Hello " + name));

        CompletableFuture<String> future566 =
                CompletableFuture.supplyAsync(() -> "John")
                        .thenCompose(name ->
                                CompletableFuture.supplyAsync(
                                        () -> "Hello " + name));

        System.out.println(future566.get());

    }
}
