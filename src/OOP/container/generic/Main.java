package OOP.container.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //объявление переменных, указываем тип, который вкладываем
        GenericContainer<String> gc1;
        GenericContainer<Integer> gc2;
        GenericContainer<Date> gc3;
        GenericContainer<Employee> gc4;
        //инициализируем объекты
        gc1 = new GenericContainer<String>("Hello");
        gc2 = new GenericContainer<Integer>(2589);
        gc3 = new GenericContainer<Date>(new Date());
        Employee e = new Employee("Ivan", 18);
        gc4 = new GenericContainer<>(e);

        //или так объявление и инициализация  в одной строке
        // GenericContainer<String> gc1 = new GenericContainer<>("Hello");// в вторых <> ничего не указываем с Java 6

        //читаем данные с пом getter, приведение типов уже не нужно, тут уже не будет ClassCastException
        String dc1 = gc1.getValue();
        Integer dc2 = gc2.getValue();
        Date dc3 = gc3.getValue();
        Employee dc4 = gc4.getValue();
        System.out.println(dc1 + " " + dc2 + " " + dc3 + " " + dc4);



        // //generic c 2 полями
        //объявление и инициализация
        GenericContainer2 <String, Integer> a1 = new GenericContainer2<>("Hello", 48);
        GenericContainer2 <String, Date> a2 = new GenericContainer2<>("WOW", new Date());
        GenericContainer2 <Double, Integer> a3 = new GenericContainer2<>(15.75, 48);
        GenericContainer2 <Integer, Date> a4 = new GenericContainer2<>(1589, new Date());

        //читаем данные с пом getter,
        String b1 = a1.getValue();
        Integer b2 = a1.getInfo();
        String b3 = a2.getValue();
        Date b4 = a2.getInfo();
        Double b5 = a3.getValue();
        Integer b6 = a3.getInfo();
        Integer b7 = a4.getValue();
        Date b8 = a4.getInfo();
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6 + " " + b7 + " " + b8);


//GenericContainer2<GenericContainer2<String, Integer>, GenericContainer2 <Date,Integer>> Magic = new GenericContainer2<>(new GenericContainer2<>("Yellow",15), new GenericContainer2<>(new Date(),789));


        //List<?> l = new ArrayList<>(); //лист непонятно каких объектов
        List<Integer> l = new ArrayList<>();
        l.add(15);
        l.add(78);
        l.add(76);
        System.out.println(getListCount(l));
        System.out.println(l.contains(15));


        //ограниечение дженерика
        GenericContainer3 <Client, Employee> ce1; //типом данных может быть только типы из класса Person, например его дочерние классы Clien Employee как тип данных
        Client c15 = new Client("Lima", 54);
        Employee e12 = new Employee("John",43);
        ce1= new GenericContainer3<>(c15,e12);
        Employee generic3 = ce1.getInfo();
        Client generic4 = ce1.getValue();
        System.out.println(generic3 +"and"+ generic4);

        //toString
        int i = 18;//
        Date d = new Date();
        String s = "Hello";
        Client c = new Client("Ivan", 18);
        System.out.println(i + " " + d + " " +s +" " +c);







    }
    public static int getListCount(List<?>l){
        return l.size();
    }

}
