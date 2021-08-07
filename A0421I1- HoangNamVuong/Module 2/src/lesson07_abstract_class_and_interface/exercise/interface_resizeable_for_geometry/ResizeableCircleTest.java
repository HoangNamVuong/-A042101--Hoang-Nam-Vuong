package lesson07_abstract_class_and_interface.exercise.interface_resizeable_for_geometry;

public class ResizeableCircleTest {
    public static void main(String[] args) {
        ResizeableCircle[] resizeableCircles = new ResizeableCircle[3];
        resizeableCircles[0] = new ResizeableCircle();
        resizeableCircles[1] = new ResizeableCircle(3.5);
        resizeableCircles[2] = new ResizeableCircle(4.5,"black",false);

        for (ResizeableCircle resizeableCircle : resizeableCircles) {
            System.out.println(resizeableCircle);
        }
        resizeableCircles[0].resize(Math.random() * 99 + 1);
        resizeableCircles[1].resize(Math.random() * 99 +1);
        resizeableCircles[2].resize(Math.random() * 99 +1);
        for (ResizeableCircle resizeableCircle : resizeableCircles) {
            System.out.println(resizeableCircle);
        }
    }
}
