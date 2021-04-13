package OOP.interface1;

public class Client extends Person {

    public Client(String firstName, int age) {
        super(firstName, age);
    }

    @Override
    public void aboutMe() {
        System.out.println("Client :" + getFirstName() + " " + getAge());
    }

}
