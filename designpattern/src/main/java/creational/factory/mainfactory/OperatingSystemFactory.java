package creational.factory.mainfactory;

import creational.factory.factories.LinuxOperatingSystem;
import creational.factory.factories.OperatingSystem;
import creational.factory.factories.WindowOperatingSystem;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){

    }

    private OperatingSystem getOperatingSyatemFactory(String verion, String architecture, String type){

        switch (type)
        {
            case "WINDOWS":
            return new WindowOperatingSystem(verion,architecture);
            case "LINUX":
                return new LinuxOperatingSystem(verion,architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }

    }
}
