package lesson06_Inheritance.exercise.point_and_moveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point() {
    }

    Point(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(float v, float v1) {
        float[] floats = new float[2];
        floats[0] = x;
        floats[1] = y;
        return floats;
    }

    public String toString() {
        return "("+x+","+y+")";
    }
}
