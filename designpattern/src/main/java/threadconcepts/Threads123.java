package threadconcepts;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Threads123 {

        public synchronized void withdraw() {
            updateBalance();
        }

        public synchronized void updateBalance() {
            // update logic
            System.out.println("sunny");
        }

    public static void main(String[] args) {
        Threads123 account = new Threads123();
        account.withdraw();

        ReentrantLock lock = new ReentrantLock();

        lock.lock();   // hold count = 1

        lock.lock();   // same thread again
// hold count = 2

        try {
            // work
        } finally {
            lock.unlock();  // hold count = 1
           
        }

       /* Executor executor = new ThreadPoolExecutor(
                2,4,
                new ArrayBlockingQueue<>(100),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        executor.execute(()-> System.out.println(""));

        ExecutorService executorService = Executors.newSingleThreadExecutor(2);
        executorService.submit()*/

    }
}
