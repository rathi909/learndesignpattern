package threads;

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Running");
    }
}
public class client {

        public static void main(String[] args) {
            Thread thread = new Thread(new RunnableThread());

        }
    }
}