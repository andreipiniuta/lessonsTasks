package OOP.constructorInitilization.delegat;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.aboutMe();

        Person p2 = new Person("Ivan");
        p2.aboutMe();

        Person p3 = new Person(33);
        p3.aboutMe();

        Person p4 = new Person("Tom", 22);
        p4.aboutMe();
    }
}
