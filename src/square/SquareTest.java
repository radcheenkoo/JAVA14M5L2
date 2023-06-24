package square;

public class SquareTest {
    public static void main(String[] args) {
        Quad quad = new Quad(4);
        System.out.println("quad.calculateSquare() = " + quad.calculateSquare());

        Rectangle rectangle = new Rectangle(3, 7);
        System.out.println("rectangle.calculateSquare() = " + rectangle.calculateSquare());
    }
}
