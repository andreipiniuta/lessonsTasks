package OOP.abstractClass;

public class GovPartner extends Partner {//класс наследуется от абстрактного класса партнера,


    public GovPartner(String firstName, int age) { //контруктор
        super(firstName, age); //поля родителя Person(у Partner нет полей)
    }

    @Override//перекрываем метод из Person
    public void aboutMe() {
        System.out.println("Это наглый государственный партнер" + getFirstName() + getAge());
    }

    @Override//перекрываем метод из Partner
    public void makeInvest() {
        System.out.println("Инвестируй в меня ничего не отдам");


    }


}
