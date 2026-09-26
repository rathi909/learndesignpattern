package creational1;

public class Main {

    public static void main(String[] args) {
        EnumSingleton.ENUM_SINGLETON.getName();

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        SyncrosizedSingelton syncrosizedSingelton = SyncrosizedSingelton.getInstance();
        System.out.println(syncrosizedSingelton);

       Student student = new Student.Builder("Sunny").age("28").build();


    }
}
