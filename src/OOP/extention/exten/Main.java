package OOP.extention.exten;

import OOP.extention.exten.Client;
import OOP.extention.exten.Employee;

public  class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setFirstName("Andrew");
        client.setLastName("Piniuta");
        client.setMiddleName("Urevich");
        client.setCreditPercent(1.2);
        client.aboutMe();


        Employee e = new Employee();
        e.setFirstName("Ivan");
        e.setLastName("Petrov");
        e.setMiddleName("Victorovich");
        e.setSalary(1500);
        e.aboutMe();
    }
}
