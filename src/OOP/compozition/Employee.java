package OOP.compozition;

public class Employee extends Person {

    public Employee(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    public void aboutMe() {
        System.out.println("I'm employee. My name is " + getFirstName() +" " + getLastName());
        getAddress().printAddress();// вызываем объект address и вызываем у него его метод
    }
}
