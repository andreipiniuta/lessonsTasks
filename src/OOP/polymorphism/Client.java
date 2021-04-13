package OOP.polymorphism;

public class Client extends Person {

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void aboutMe() {
        System.out.println("I'm client. My name is " + getFirstName() +" " + getLastName());
    }
}
