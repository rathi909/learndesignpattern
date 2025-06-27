package creational.singleton;

// Eager Intilization solves the problem of multi thread environment but it generates
// other problem like it creates new object of Eager Intilization even it is not required.
public class EagerIntilization {
    private static  EagerIntilization eagerIntilization = new EagerIntilization();

    private EagerIntilization(){

    }

    public static EagerIntilization getEagerIntilization(){
        return eagerIntilization;
    }
}
