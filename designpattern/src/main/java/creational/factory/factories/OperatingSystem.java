package creational.factory.factories;

public abstract class OperatingSystem {

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    private String version;

    private String architecture;


    public abstract  void changeDir(String dir);

    public abstract  void removeDir(String dir);


}
