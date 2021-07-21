package lesson04_class_and_object_in_java.exercise.fan;

public class Fan {
    Fan() {
    }

    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public static int getSlow() {
        return SLOW;
    }

    public static int getFast() {
        return FAST;
    }

    public static int getMedium() {
        return MEDIUM;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setON(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (on) {
            return "Fan is on " + " Speed: " + speed + " Color: " + color + " Radius: " + radius;
        } else {
            return "Fan is off " + " Color: " + color + " Radius: " + radius;
        }
    }
}
