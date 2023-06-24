package square;

public class Rectangle extends Figure{
    private int firstSideSize;
    private int secondSideSize;

    @Override
    public double calculateSquare() {
        return firstSideSize * secondSideSize;
    }

    public Rectangle(int firstSideSize, int secondSideSize) {
        this.firstSideSize = firstSideSize;
        this.secondSideSize = secondSideSize;
    }

    public int getFirstSideSize() {
        return firstSideSize;
    }

    public void setFirstSideSize(int firstSideSize) {
        this.firstSideSize = firstSideSize;
    }

    public int getSecondSideSize() {
        return secondSideSize;
    }

    public void setSecondSideSize(int secondSideSize) {
        this.secondSideSize = secondSideSize;
    }
}
