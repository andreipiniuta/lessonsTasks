package OOP.polymorphism;

public class Employee extends Person {

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public void aboutMe() {
        System.out.println("I'm employee. My name is " +getFirstName() +" "+ getLastName() );
    }
}
