package threadconcepts;

public class PrintEvenOddViaThread {

    static int max = 10;
    static int num = 1;

    public static void main(String[] args) {

        PrintEvenOddViaThread printEvenOddViaThread = new PrintEvenOddViaThread();
        Thread t1 = new Thread(() -> {
            try {
                printEvenOddViaThread.printEvenNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                printEvenOddViaThread.printOddNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();
        t1.start();

    }

    public  synchronized void printEvenNumber() throws InterruptedException {
        while (num < max ) {
            while(num%2 != 0)
            {
                wait();
            }
            System.out.println("Even" + "" + num);
            num++;
            notify();
        }
    }

    public  synchronized void printOddNumber() throws InterruptedException {
        while (num < max ) {
            while(num%2==0)
            {
                wait();
            }
            System.out.println("odd" + "" + num);
            num++;
            notify();
        }
    }
}