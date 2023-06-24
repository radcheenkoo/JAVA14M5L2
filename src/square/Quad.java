package square;

public class Quad extends Figure{
    private int sideSize;

    public Quad(int sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calculateSquare() {
        return sideSize * sideSize;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }
}
