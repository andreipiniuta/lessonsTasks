package OOP.container;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Container c1, c2, c3, c4;//объявление переменных типа Container(внутри объекты типа Object)
        //инициализируем объекты все объекта тип Object, происходит up-casting т.к. объекты Container тип Object
        c1 = new Container("Yellow");
        c2 = new Container(127);
        c3 = new Container(new Date());
        Employee e = new Employee("Ivan", 18);
        c4 = new Container(e);

        //читаем данные с пом getter
        //т.к. объекты с именами с типа Object  и каким-то еще(с1 String), то нужно приведение типа при присваивании значения для объектов с именами d
        String d1 = (String) c1.getValue();// приведение типа к String down-casting
        Integer d2 = (Integer) c2.getValue();// приведение типа к Integer down-casting
        //Integer d3 = (Integer) c3.getValue();// приведение типа Integer  к типу Date(с2 типа Date) down-casting тут ClassCastException
        Date d3 = (Date) c3.getValue();// приведение типа к Date down-casting
        Employee d4 = (Employee) c4.getValue();// приведение типа к Employee down-casting
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
    }
}