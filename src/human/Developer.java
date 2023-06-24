package human;

import java.util.Objects;

public class Developer extends Human{
    final private String programingLanguage;

    public Developer(String name, boolean isStudent) {
        this(name, isStudent, "Undefined");
    }

    public Developer(String name, boolean isStudent, String programingLanguage) {
        super(name, isStudent);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public void printHumanInfo() {
        System.out.println("This is developer and he develop using " + programingLanguage);
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programingLanguage='" + programingLanguage + '\'' +
                '}' + super.toString();
    }

    //dev.equals(secondDev);
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return programingLanguage.equals(developer.programingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programingLanguage);
    }
}
