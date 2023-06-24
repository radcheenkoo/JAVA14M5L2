package human;

public final class BackendDeveloper extends Developer{
    public BackendDeveloper(String name, boolean isStudent) {
        super(name, isStudent);
    }

    @Override
    public void printHumanInfo() {
        System.out.println("This is backend developer and he develop using " + getProgramingLanguage());
    }

    @Override
    public void getData(String arg1, String arg2) {
        System.out.println("AAAA");
    }

    @Override
    public String toString() {
        return "BackendDeveloper{}";
    }
}
