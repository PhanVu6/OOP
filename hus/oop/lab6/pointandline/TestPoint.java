package hus.oop.lab6.pointandline;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20); // Construct a Point
        System.out.println(p1);

        // Try setting p1 to (100, 10).
        p1.setXY(100, 10);
        System.out.println(p1);

        Point p2 = new Point(20, 50);
        System.out.println(p2);

        Line line = new Line(p1, p2);
        System.out.println(line);
        System.out.println("Begin: " + line.getBegin());
        System.out.println("End: " + line.getEnd());
        line.setBeginXY(5, 10);
        line.setEndXY(10, 20);
        System.out.println(line);
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("End X: " + line.getEndX());
        System.out.println();

        LineSub lineSub = new LineSub(p1, p2);
        System.out.println(lineSub);
        System.out.println("Begin: " + lineSub.getBegin());
        System.out.println("End: " + lineSub.getEnd());
        lineSub.setBeginXY(8, 15);
        lineSub.setEndXY(15, 29);
        System.out.println(lineSub);
        System.out.println("Begin X: " + lineSub.getBeginX());
        System.out.println("End X: " + lineSub.getEndX());
        System.out.println();

        // Sử dụng kế thừa sẽ tốt hơn
        // Ta có thể thấy: nếu sử dụng kế thừa thì ta có thể lược bớt việc viết lại code
        // và code có thể xem và kiểm tra dễ dàng hơn nên ta thấy kế thừa là tốt hơn
    }
}
