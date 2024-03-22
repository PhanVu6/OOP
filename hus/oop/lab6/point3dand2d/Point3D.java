package hus.oop.lab6.point3dand2d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0] = super.getX();
        XYZ[1] = super.getY();
        XYZ[2] = z;
        return XYZ;
    }

    public void setXY(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%f,%f,%f)", super.getX(), super.getY(), z);
    }
}
