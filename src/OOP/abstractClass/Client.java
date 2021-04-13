package OOP.abstractClass;

public class Client extends Person { //класс Client наследуется от Person

    public Client(String firstName, int age) { //конструктор
        super(firstName, age);//поля Persona поэтому super
    }

    @Override//перекрытие метода родителя Person
    public void aboutMe() {
        System.out.println("Client :" + getFirstName() + " " + getAge());//но в методе есть уже реализация
    }
}
