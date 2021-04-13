package OOP.abstractClass;

public abstract class Partner extends Person {//абстрактный класс наследуется о  персона
// сделал класс abstract поэтому не перекрывал тут методы родителя( класс Person)
    public Partner(String firstName, int age) {
        super(firstName, age);
    }

    public abstract void makeInvest();//собственный метод класса Partner тоже абстрактный
}

