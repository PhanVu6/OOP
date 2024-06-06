package observer.pseucode;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        events = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.name);
    }

    public void saveFile() {
        file.write();
        events.notify("save", file.name);
    }
}
