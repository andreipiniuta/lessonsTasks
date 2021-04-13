package OOP.abstractClass;

public class Main {
    public static void main(String[] args) {
        //метод aboutMe() ---это абстрактный метод Persona, реализация в наследниках(Partner, Client, Employee)
        //метод makeInvest() ---это абстрактный метод Partnera, реализация в наследниках (Client, Employee)


        //Person p = new Person("Ivan", 15);//нельзя создать объект абстрактного класса
    Person p1 = new Client("Andrew",18);//создание объекта Client с родительским типом Person
    Person p2 = new Employee("Victor", 25);//создание объекта Employee с родительским типом Person
    p1.aboutMe();//вызвали метод родителя Person, переопределённый в метод Clientа (down-casting)
    p2.aboutMe();//вызвали метод родителя Person, переопределённый в метод Employeeра (down-casting)
    Person p3 = new GovPartner("Irina",29); //создание объекта GovPartner с родительским типом Person
    Partner p4 = new ForiengPartner("Sean", 49); //создание объекта ForiengPartner с родительским типом Partner
    p3.aboutMe();//вызываем метод родителя Person, переопределённый в метод в GovPartner (down-casting)
        //p3.makeInvest//не работает т.к. тип Person  не видит методы Partner(down-casting)
    ((Partner)p3).makeInvest();//без приведения типа p3 не увидит метод makeInvest(), но так обычно не делают
    p4.aboutMe(); // вызываем метод родителя Person переопределённый в метод в ForiengPartner (down-casting)
    p4.makeInvest(); // вызываем метод родителя Partner переопределённый в метод в ForiengPartner (down-casting)
    //тут работает т.к. тип Partner видит метод makeInvest() потому что это его метод

    }
}
