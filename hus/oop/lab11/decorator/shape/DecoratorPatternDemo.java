package lab11.decorator.shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        System.out.println("Draw:");
        circle.draw();
        rectangle.draw();

        System.out.println("\nDraw and Color:");
        System.out.println("+)Rectangle:");
        ShapeDecorator shapeDecorator2 = new RedShapeDecorator(rectangle);
        // shapeDecorator2.shape = rectangle;
        shapeDecorator2.draw();
        System.out.println("+)Circle:");
        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        // shapeDecorator.shape = circle;
        shapeDecorator.draw();
    }
}
