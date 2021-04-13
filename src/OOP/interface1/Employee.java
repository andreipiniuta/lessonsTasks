package OOP.interface1;

public class Employee extends Person {

    public Employee(String firstName, int age) {
        super(firstName, age);
    }

    @Override
    public void aboutMe() {
        System.out.println("Employee :" + getFirstName() + " " + getAge());
    }
}


