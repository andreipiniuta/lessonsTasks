package OOP.abstractClass;

public abstract class Person {// Класс Person абстрактный

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


    public abstract void aboutMe();//метод тоже абстрактный

}