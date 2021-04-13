package OOP.PolymorfizmReal;

public class Truck extends Atomobile {

    private String fuil;

    public Truck(int speed, String fuil) {
        super(speed);
        this.fuil = fuil;
    }

    @Override
    public void ToMove() {
        System.out.println("I can move with " +getSpeed() + " using " +fuil);
    }
}
