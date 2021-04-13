package OOP.PolymorfizmReal;

public class Car extends Atomobile {

   private String fuil;

    public Car(int speed, String fuil) {
        super(speed);
        this.fuil = fuil;
    }

    @Override
    public void ToMove() {
        System.out.println("I can move with " +getSpeed() + " using " +fuil);
    }
}
