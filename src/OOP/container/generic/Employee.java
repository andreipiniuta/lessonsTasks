package OOP.container.generic;

public class Employee extends Person {

    public Employee(String firstName, int age) {
        super(firstName, age);
    }

    public void aboutMe() {
        System.out.println("Employee :" + getFirstName() + " " + getAge());
    }

    @Override
    public String toString() {
        return "My Employee "+ getFirstName() + " " + getAge();
    }
}

