package OOP.compozition;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("USA","Atlanta", "Main", 15);
        Address a2 = new Address("USA", "LA", "Saratoga", 22);
        Address a3 =new Address("Belarus","Minsk", "Fogota", 487);
        Client client = new Client("Tom", "Smith",a1);// в параметр добавляем объект a1 из другого класса(из класса Address)
        Employee employee = new Employee("Ivan", "Petrov", a2); // в параметр добавляем объект a2 из другого класса(из класса Address)
        Office office = new Office(a3);// в параметр добавляем объект a3 из другого класса(из класса Address)
        client.aboutMe();
        employee.aboutMe();
        office.printOffice();
    }
}
