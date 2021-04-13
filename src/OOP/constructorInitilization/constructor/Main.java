package OOP.constructorInitilization.constructor;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();// через явный контруктор по умолчанию
        p1.aboutMe();

         Person  p2 = new Person("Bob", 8); // через контруктор с параметрами
         p2.aboutMe();

        Person  p3 = new Person("Bob"); // через контруктор с параметрами
        p3.aboutMe();

        Person  p4 = new Person(8); // через контруктор с параметрами
        p4.aboutMe();
    }
}

