package human;

public class Tester extends Human{
    private boolean isManual;

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    @Override
    public void printHumanInfo() {
        System.out.println("This is tester and he is " + (isManual ? "manual" : "automation") + "tester");
    }
}
