package OOP.interface1;

public abstract class Person implements Informator {//класс Person реализовывает методы интерфэйса Informator
//класс Person абстрактный поэтому его методы не override методы интерфэйса Informator
    private String firstName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

}
