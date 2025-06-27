package creational.singleton;


//This Solves all the problem
public class SynchroziedSingelton {

    private static SynchroziedSingelton instance = null;

    private  SynchroziedSingelton(){

    }

    public static SynchroziedSingelton getInstance(){

        if(instance == null){
            synchronized (SynchroziedSingelton.class){
                if(instance == null){
                    instance = new SynchroziedSingelton();
                }
            }
        }
        return instance;
    }


}
