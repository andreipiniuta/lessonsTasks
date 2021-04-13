package collections.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTest {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(11);
        s.add(25);
        s.add(-200);
        Iterator<Integer> i = s.iterator();// создание iterator ---- в перемен i типа Integer(т.к. s тоже Integer) записали iterator коллекции s


        while (i.hasNext()) {//пока есть свободная ячейка
            System.out.println(i.next());//вывод на экран элемента этой ячейки
        }
        for (Integer obj : s) {// через foreach : идем по коллекции s записывая значения в перемен obj
            System.out.println(obj);//вывод на экран значения переменной obj
        }
    }
}
