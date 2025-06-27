package creational.singleton;

public class LazySingelton {

    private static LazySingelton instance = null;


    private LazySingelton() {
    }

    public static LazySingelton getLazySingelton() {
        if (instance == null) {
            instance = new LazySingelton();
        }
        return instance;
    }


}
