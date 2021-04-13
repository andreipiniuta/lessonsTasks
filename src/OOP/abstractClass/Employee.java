package OOP.abstractClass;

public class Employee extends Person { //класс Client наследуется от Person

    public Employee(String firstName, int age) { //конструктор
        super(firstName, age); //поля Persona поэтому super
    }

    @Override//перекрытие метода родителя Person
    public void aboutMe() {
        System.out.println("Employee :" + getFirstName() + " " + getAge());//но в методе есть уже реализация
    }
}
