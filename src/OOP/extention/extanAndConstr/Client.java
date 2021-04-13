package OOP.extention.extanAndConstr;

public class Client extends Person { //Client наследник от Person

    private double creditPercent; // поле наследника

    public Client(String firstName, String lastName, String middleName, double creditPercent) {//конструктор наследника с 4 параметрами
        super(firstName, lastName, middleName);//с 3 параметрами родителя
        this.creditPercent = creditPercent;// один свой параметр
    }

    public Client(String lastName, String middleName, double creditPercent) { //конструктор наследника с 3 параметрами
        super(lastName, middleName); //с 2 параметрами родителя
        this.creditPercent = creditPercent; // один свой параметр
    }

    public Client(String firstName, double creditPercent) { //конструктор наследника с 2 параметрами
        super(firstName); //с 1 параметром родителя
        this.creditPercent = creditPercent; // один свой параметр
    }

    public double getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(double creditPercent) {
        this.creditPercent = creditPercent;
    }

    public void aboutMe() {
        System.out.println("Client is " +  getFirstName() + " " +  getLastName() + " " +  getMiddleName() + " " +creditPercent );
    }
}
