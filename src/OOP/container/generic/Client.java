package OOP.container.generic;


public class Client extends Person {

    public Client(String firstName, int age) {
        super(firstName, age);
    }

    public void aboutMe() {
        System.out.println("Client :" + getFirstName() + " " + getAge());
    }

    @Override
    public String toString() {
        return "My Client " +getFirstName() +" " + getAge();
    }
}
