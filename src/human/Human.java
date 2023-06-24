package human;

public abstract class Human {
    public Human(Human h) {
        this.isStudent = h.isStudent;
        this.name = h.name;
        this.sName = h.sName;
        this.lName = h.lName;
    }

    public Human() {
        this.isStudent = true;
        this.name = "noname";
        this.sName = "";
        this.lName = "";
    }

    public Human(String name, String sName) {
        this.name = name;
        this.sName = sName;
        this.isStudent = true;
        this.lName = "";
    }

    public Human(String name, boolean isStudent) {
        this.name = name;
        this.isStudent = isStudent;
        this.sName = "";
        this.lName = "";
    }


    public static final int amountOfChromosome = 46;

    private final String name;
    private final String sName;
    private final String lName;
    private final boolean isStudent;

    public String getName() {
        return this.name;
    }

    public String getsName() {
        return this.sName;
    }

    public String getlName() {
        return this.lName;
    }

    public boolean isStudent() {
        return this.isStudent;
    }

    public void getData(String arg1, String arg2) {
    }

    public void getData(String arg2, String arg1, String arg3) {
    }

    public int getData(String arg2, int arg1) {
        return 0;
    }

    public abstract void printHumanInfo();

    public static void printAmountOfChromosome() {
        System.out.println(amountOfChromosome);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                ", lName='" + lName + '\'' +
                ", isStudent=" + isStudent +
                '}';
    }
}
