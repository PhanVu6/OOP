package observer.pseucode;

public class File {
    public String name;

    public File() {
        this.name = "default";
    }

    public File(String name) {
        this.name = name;
    }

    public void write() {
        System.out.println("write file");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void write(String mess) {
        System.out.println("write " + mess);
    }
}
