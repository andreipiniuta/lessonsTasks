package OOP.PolymorfizmReal;

public class Atomobile {

    private int speed;

    public Atomobile(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void ToMove() {
        System.out.println("I can move");
    }
}
