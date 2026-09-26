package threadconcepts;

public class PrintEvenOddViaThread1 {

    static int num = 0;

    public static void main(String[] args) {
        PrintEvenOddViaThread1 printEvenOddViaThread1 = new PrintEvenOddViaThread1();
        Thread t1 = new Thread(()->{
            try {
                printEvenOddViaThread1.printEvenThreads();
            }
            catch (InterruptedException ex){

            }
        });

        Thread t2 = new Thread(()->{
                try {
                    printEvenOddViaThread1.printOddThreads();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });
        t1.start();
        t2.start();


    }

    public synchronized  void printEvenThreads() throws InterruptedException{

        while(num<10)
        {
        while(num%2!=0)
        {
            wait();
        }
        System.out.println(num);
        num++;
        notify();
        }
    }

    public synchronized void  printOddThreads() throws InterruptedException {

        while(num<10)
        {
            while(num%2==0)
            {
                wait();
            }
            System.out.println(num);
            num++;
            notify();
        }

    }



}
