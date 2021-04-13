package OOP.compozition;

public class Address {// композиция для Person и Office
    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public Address(String country, String city, String street, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public void printAddress(){// метод объекта address
        System.out.println("My address is " + country +" " + city + " " + street+ " " + houseNumber);
    }
}
