package OOP.setterInitialization.setterOnly;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();//создание объекта
        Person p2 = new Person();//создание объекта

        p1.setName("Tom"); // у объекта p1 вызываем метод установки имени с уже указанным параметром (именем)
        p1.setAge(18); // и т.д.
        p1.aboutMe();
        p2.setName("Ira");
        p2.setAge(29);
        p2.aboutMe();

        Person2 person2 = new Person2();
        person2.setLastName("oi");
        person2.setSalary(15);
        person2.printConsole();
    }
}
