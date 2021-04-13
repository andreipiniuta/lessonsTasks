package OOP.interface1;

public class Credit implements Informator, Saver { //класс Credit реализовывает методы интерфэйсов Informator, Saver

private double rate;

    public Credit(double rate) {
        this.rate = rate;
    }

    @Override//метод из интерфэйса Informator перекрыт
    public void aboutMe() {
        System.out.println("Credit name is" );//метод с реализацией(с телом метода)
    }


    @Override//метод из интерфэйса Saver перекрыт
    public void saveMe() {
        System.out.println("Interest rate is Saved to DataBase N4");//метод с реализацией(с телом метода)

    }
}
