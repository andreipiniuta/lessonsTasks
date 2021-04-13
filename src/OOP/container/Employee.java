package OOP.container;

public class Employee {
    private  String firstName;
    private int age;

    public Employee(String name, int age) {
        this.firstName = name;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void aboutMe() {
        System.out.println("Employee :" + getFirstName() + " " + getAge());
    }

    @Override
    public String toString() {
        return "My Employee "+ getFirstName() + " " + getAge();
    }
}