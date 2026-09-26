package FunctionalInterface;

public class JavaThreads  extends Thread {

    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {

        JavaThreads javaThreads = new JavaThreads();
        javaThreads.run();
    }
}
