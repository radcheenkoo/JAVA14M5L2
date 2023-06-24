package square;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return 2 * Math.PI * radius;
    }
}
