package human;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Developer("Ivan", true);
        //human.setProgramingLanguage("Java");

        Developer developer = (Developer) human;
        //developer.setProgramingLanguage("Java");

        human.printHumanInfo();

        //polimorfismExplain();

        polimorfismExplain2();

        final int a = 0;
        //a = 1;

        final Developer dev1 = new Developer("Lola", true);
        System.out.println(dev1);
        //dev1 = new Developer("Goga", true);
        //dev1.setProgramingLanguage("java");
        System.out.println(dev1);


        String a1 = "asd";
        String a2 = "asd";
        String res = a1.concat(a2);


    }

    public static void polimorfismExplain2() {
        BackendDeveloper backendDeveloper = new BackendDeveloper("Anton", false);
        Developer dev = backendDeveloper;
        Human human = backendDeveloper;
        Object o = backendDeveloper;

        System.out.println("backendDeveloper.toString() = " + backendDeveloper.toString());
        System.out.println("dev.toString() = " + dev.toString());
        System.out.println("human.toString() = " + human.toString());
        System.out.println("o.toString() = " + o.toString());

        Developer developer = new Developer("Joja", true);
        System.out.println("developer.toString() = " + developer.toString());
    }

    public static void polimorfismExplain() {

        Developer developer = new Developer("Ivan", true);
        BackendDeveloper backendDeveloper = new BackendDeveloper("Anton", false);

        Object objectDev = (Human) developer;
        Object objectBackDev = (Human) backendDeveloper;
        BackendDeveloper backendDeveloperFromObject = (BackendDeveloper) objectBackDev;

        Human humanDev = (Human) developer;
        Human humanBackDev = (Human) backendDeveloper;

        Developer devBackDev = (Developer) backendDeveloper;

        //BackendDeveloper error = (BackendDeveloper) developer;
    }
}
