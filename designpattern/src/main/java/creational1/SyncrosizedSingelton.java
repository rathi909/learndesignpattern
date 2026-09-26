package creational1;

public class SyncrosizedSingelton {

    private static SyncrosizedSingelton singleton;

    private SyncrosizedSingelton(){
    }

    public static SyncrosizedSingelton getInstance() {
        if (singleton == null) {
            synchronized (SyncrosizedSingelton.class) {
                if (singleton == null) {
                    singleton = new SyncrosizedSingelton();
                }
            }
        }
        return singleton;
    }
}
