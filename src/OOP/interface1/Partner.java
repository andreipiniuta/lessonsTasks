package OOP.interface1;

public class Partner extends Person {

    public Partner(String firstName, int age) {
        super(firstName, age);
    }

    @Override
    public void aboutMe() {
        System.out.println("Partner :" + getFirstName() + " " + getAge());
    }
}
