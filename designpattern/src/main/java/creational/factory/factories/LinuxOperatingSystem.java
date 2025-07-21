package creational.factory.factories;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Change directory for Linux");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Remove directory for Linux");
    }
}
