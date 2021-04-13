package OOP.interface1;

public class Office implements Informator,Saver {//класс Office реализовывает методы интерфэйсов Informator, Saver

private String address;

    public Office(String address) {
        this.address = address;
    }

    @Override//метод из интерфэйса Informator перекрыт
    public void aboutMe() {
        System.out.println("Office Address is" );//метод с реализацией(с телом метода)
    }

    @Override//метод из интерфэйса Saver перекрыт
    public void saveMe() {
        System.out.println("Office Address is Saved to DataBase N1");//метод с реализацией(с телом метода)
    }

}

