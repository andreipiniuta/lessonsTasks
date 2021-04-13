package collections.compare;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonComparable p1 = new PersonComparable("Sidor",74);//создал объект р типа PersonComparable
        PersonComparable p2 = new PersonComparable("Petr",35);//создал объект р типа PersonComparable
        PersonComparable p3 = new PersonComparable("Bob",188);//создал объект р типа PersonComparable
        PersonComparable p4 = new PersonComparable("Ivan",5);
        PersonComparable p5 = new PersonComparable("Bob", 187);
        Set<PersonComparable> ts= new TreeSet<>();//создал TreeSet
        ts.add(p1);//добавил элемент, который является объектом р типа PersonComparable
        ts.add(p2);//добавил элемент, который является объектом р типа PersonComparable
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        System.out.println(ts);//вывод на печать с той сортировкой, которую указали  в методе compareTo


        ClientComparator c1 = new ClientComparator("Irina", 38);//создал объект c типа ClientComparator
        ClientComparator c2 = new ClientComparator("Anna",28);
        ClientComparator c3 = new ClientComparator("Bob",35);
        List<ClientComparator> l= new ArrayList<>();//создал List т.к у Set  не работв=ает сортировка
        l.add(c1);//добавление объектов в List
        l.add(c2);
        l.add(c3);
        Collections.sort(l, new ClientComparator("",0));// у Collections вызываем метод sort и указываем параметры: коллекция l и comparator
        System.out.println(l);//вывод на печать с той сортировкой, которую указали  в методе compare
    }
}
