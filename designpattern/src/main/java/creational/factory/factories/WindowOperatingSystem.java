package creational.factory.factories;

public class WindowOperatingSystem extends  OperatingSystem{

    public WindowOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Change directory for Windows");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Remove directory for Windows");
    }
}
