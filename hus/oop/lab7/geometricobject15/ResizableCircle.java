package hus.oop.lab7.geometricobject15;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }

}
