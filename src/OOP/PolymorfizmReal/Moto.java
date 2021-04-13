package OOP.PolymorfizmReal;

public class Moto extends Atomobile {

    private String fuil;

    public Moto(int speed, String fuil) {
        super(speed);
        this.fuil = fuil;
    }

    @Override
    public void ToMove() {
        System.out.println("I can move with " +getSpeed() + " using " +fuil);
    }
}
