package OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Client c = new Client("Tom","Daht");// для up -casting
//        c.getFirstName();//up-casting  //объект с типа Client вызывает методы Person
//        c.getLastName();//up-casting   //объект с типа Client вызывает методы Person

//        Person p = new Client("Andrew", "Piniuta");// для down-casting
//        ((Client) p).aboutMe();//приведение типа (Client) down-casting  объект р типа Person вызывает методы Client
//        e.aboutMe();

//полиморфизм
        Person p = new Person("Name", "Surname");
        p.aboutMe();
        Person c = new Client("Tom","Daht");
        c.aboutMe();   //по родительской ссылке вызываем метод наследника (условие: название методов в родителе и наследкике одикаковаем)  можно пользоватся overriding
        Person e = new Employee("Andrew", "Piniuta");
        Client c2 = new Client("kjhk","bjgj");
        e.aboutMe();  //по родительской ссылке вызываем метод наследника

        System.out.println(p instanceof Person);//даёт True т.к. p является типом Person
        System.out.println(c instanceof Person);//даёт True т.к. c является типом Person (родитель)
        System.out.println(e instanceof Person);//даёт True т.к. e является типом Person  (родитель)
        System.out.println(e instanceof Client);//дает false т.к. е не являестя типом Client(будет Class Cat Exeption)
        System.out.println(c2 instanceof Person);//даёт True т.к. c2 является типом Client


        System.out.println(p.getClass());//даёт Person т.к. p является типом Person
        System.out.println(c.getClass());//даёт Client т.к. c является типом Person
        System.out.println(e.getClass());//даёт Employee т.к. e является типом Person
        System.out.println(c2.getClass()==Client.class);//даёт True т.к. c2 является типом Client

    }
}
