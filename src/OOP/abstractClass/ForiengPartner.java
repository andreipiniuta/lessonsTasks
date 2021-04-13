package OOP.abstractClass;

import org.w3c.dom.ls.LSOutput;

public class ForiengPartner extends Partner {//класс наследуется от абстрактного класса партнера,

    public ForiengPartner(String firstName, int age) { //контруктор
        super(firstName, age); //поля родителя Person(у Partner нет полей)
    }

    @Override//перекрываем метод из Partner
    public void aboutMe() {
        System.out.println("Пкорный частник" + getFirstName() + getAge());

    }

    @Override//перекрываем метод из Person
    public void makeInvest() {
        System.out.println("Все верну в двойном размере");
    }


}
