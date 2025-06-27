package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainSingleton {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingelton lazySingelton = LazySingelton.getLazySingelton();
        System.out.println(lazySingelton.hashCode());
        LazySingelton lazySingelton1 = LazySingelton.getLazySingelton();
        System.out.println(lazySingelton1.hashCode());


        EagerIntilization eagerIntilization = EagerIntilization.getEagerIntilization();
        System.out.println(eagerIntilization.hashCode());
        EagerIntilization eagerIntilization1 = EagerIntilization.getEagerIntilization();
        System.out.println(eagerIntilization1.hashCode());


        SynchroziedSingelton synchroziedSingelton = SynchroziedSingelton.getInstance();
        System.out.println(synchroziedSingelton.hashCode());
        SynchroziedSingelton synchroziedSingelton1 = SynchroziedSingelton.getInstance();
        System.out.println(synchroziedSingelton1.hashCode());


        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton serializableSingleton11 = (SerializableSingleton ) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("before deserlia "+     serializableSingleton.hashCode());
        System.out.println("after serlizatiion " + serializableSingleton11.hashCode());

        MainSingleton.exampleReflection();
    }


    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingelton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        LazySingelton lazySingleton = (LazySingelton) constructor.newInstance();
        LazySingelton singelton = LazySingelton.getLazySingelton();
        System.out.println(lazySingleton.hashCode());
        System.out.println(singelton.hashCode());

        EnumSingleton.INSTANCE.doSomething();
    }
}
