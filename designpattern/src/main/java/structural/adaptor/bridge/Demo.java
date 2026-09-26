package structural.adaptor.bridge;

public class Demo {
    public static void main(String[] args) {
        Remote remote = new BasicRemote(new SonyTV());
        remote.operte();


        /*

        Why is this called a "Bridge"?
The Remote doesn't know whether it's controlling a Samsung or Sony TV. It only knows about the TV interface:

           Abstraction
             Remote
                |
                | has-a
                ▼
             TV Interface
             /          \
            /            \
     SamsungTV       SonyTV
         */
    }
}
