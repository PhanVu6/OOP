package hus.oop.lab6.point3dand2d;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(1.2f, 3.4f);
        System.out.println(point2d);
        System.out.println("Get x: " + point2d.getX());
        System.out.println("Get y: " + point2d.getY());
        point2d.setXY(10, 2);
        System.out.println("Get x and y");
        System.out.println(point2d.getXY()[0]);
        System.out.println(point2d.getXY()[1]);

        System.out.println();

        Point3D point3d = new Point3D(1.2f, 3.4f, 3.5f);
        System.out.println(point3d);
        System.out.println("Get x: " + point3d.getX());
        System.out.println("Get y: " + point3d.getY());
        System.out.println("Get z: " + point3d.getZ());

        System.out.println("Get x, y and z");
        point3d.setXY(10, 2, 5);
        System.out.println(point3d.getXYZ()[0]);
        System.out.println(point3d.getXYZ()[1]);
        System.out.println(point3d.getXYZ()[2]);
    }
}
