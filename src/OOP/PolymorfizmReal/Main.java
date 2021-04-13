package OOP.PolymorfizmReal;

public class Main {
    public static void main(String[] args) {
        Atomobile v = new Atomobile(0);
        Atomobile v1 = new Car(15, "95");
        Atomobile v2 = new Truck(7,"diesel");
        Atomobile v3 = new Moto(25,"100");

        v.ToMove();
        v1.ToMove();
        v2.ToMove();
        v3.ToMove();
    }

}
