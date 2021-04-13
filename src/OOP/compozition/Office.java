package OOP.compozition;

public class Office {

    private Address address;

    public Office(Address address) {// поле является объектом класса Address c типом Address
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void printOffice(){
        System.out.println("I'm office");
        address.printAddress();// вызываем метод объекта address


    }
}
