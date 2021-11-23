package lesson06_Inheritance.exercise.point2D_and_point3D;

public class Point3D extends Point2D{
    private float z = 0.0f;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] floats = new  float[3];
        floats[0] = getX();
        floats[1] = getY();
        floats[2] = z;
        return floats;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+z+")";
    }
}
