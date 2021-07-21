package lesson04_class_and_object_in_java.exercise.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setON(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("Yellow");
        fan1.setRadius(10);

        fan2.setON(false);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);

        System.out.println("Fan 1:" + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
