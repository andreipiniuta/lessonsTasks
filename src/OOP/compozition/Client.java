package OOP.compozition;

public class Client extends Person {

    public Client(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    public void aboutMe() {
        System.out.println("I'm client. My name is " + getFirstName()+ " " +  getLastName());
        getAddress().printAddress();// вызываем объект address и вызываем у него его метод
    }
}
