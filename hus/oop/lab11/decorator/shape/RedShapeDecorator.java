package lab11.decorator.shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        super.shape.draw();
        setRedShapeDecorator();
    }

    public void setRedShapeDecorator() {
        System.out.println("Border Color: Red");
    }
}
