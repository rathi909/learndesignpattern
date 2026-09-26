package FunctionalInterface;

@FunctionalInterface
public interface Greeting {

    void sayGrreting();

    default void display(){
        System.out.println("Display greeting");
    }
}
