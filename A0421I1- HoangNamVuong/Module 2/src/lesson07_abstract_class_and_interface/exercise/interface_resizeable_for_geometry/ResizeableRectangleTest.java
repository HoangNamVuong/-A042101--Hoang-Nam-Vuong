package lesson07_abstract_class_and_interface.exercise.interface_resizeable_for_geometry;

public class ResizeableRectangleTest {
    public static void main(String[] args) {
        ResizeableRectangle[] resizeableRectangle = new ResizeableRectangle[3];
        resizeableRectangle[0] = new ResizeableRectangle();
        resizeableRectangle[1] = new ResizeableRectangle(3.5,3.6);
        resizeableRectangle[2] = new ResizeableRectangle(3.5,3.6,"black",false);
        for (ResizeableRectangle resizeableRectangle1 : resizeableRectangle) {
            System.out.println(resizeableRectangle1);
        }

        resizeableRectangle[0].resize(Math.random() * 99 + 1);
        resizeableRectangle[1].resize(Math.random() * 99 + 1);
        resizeableRectangle[2].resize(Math.random() * 99 + 1);
        for (ResizeableRectangle resizeableRectangle1 : resizeableRectangle) {
            System.out.println(resizeableRectangle1);
        }
    }
}
