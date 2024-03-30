package hus.oop.lab7.geometricobject15;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizeCircle = new ResizableCircle(3.0);
        System.out.println(resizeCircle);
        resizeCircle.resize(15);
        System.out.println(resizeCircle);

    }
}
