package lesson06_Inheritance.exercise.point_and_moveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveablePoint() {
    }

    MoveablePoint(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float x,float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] floats = new float[2];
        floats[0] = xSpeed;
        floats[1] = ySpeed;
        return floats;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+"),speed = ("+xSpeed+","+ySpeed+")";
    }

    public MoveablePoint move() {
        super.getXY(this.getX() + xSpeed, this.getY() + ySpeed);
        return this;
    }
}
