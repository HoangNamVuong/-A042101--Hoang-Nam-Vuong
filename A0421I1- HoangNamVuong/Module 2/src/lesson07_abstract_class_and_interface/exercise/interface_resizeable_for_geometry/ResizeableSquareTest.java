package lesson07_abstract_class_and_interface.exercise.interface_resizeable_for_geometry;

public class ResizeableSquareTest {
    public static void main(String[] args) {
        ResizeableSquare[] resizeableSquares = new ResizeableSquare[3];
        resizeableSquares[0] = new ResizeableSquare();
        resizeableSquares[1] = new ResizeableSquare(3.5);
        resizeableSquares[2] = new ResizeableSquare(3.6,"black",false);
        for (ResizeableSquare resizeableSquare : resizeableSquares) {
            System.out.println(resizeableSquare);
        }

        resizeableSquares[0].resize(Math.random() * 99 + 1);
        resizeableSquares[1].resize(Math.random() * 99 + 1);
        resizeableSquares[2].resize(Math.random() * 99 + 1);
        for (ResizeableSquare resizeableSquare : resizeableSquares) {
            System.out.println(resizeableSquare);
        }
    }
}
