package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();//создание HashSet
        hs.add(1);
        hs.add(10000);
        hs.add(-20);
        hs.add(69);
        hs.add(187);
        hs.add(-188);
        hs.add(7);
        hs.add(-1000);
        hs.add(212121);
        System.out.println(hs);//выведет на основании математической  hash-функции
        HashSet<Integer> lhs = new LinkedHashSet<>();// создание LinkedHashSet
        lhs.add(1);
        lhs.add(10000);
        lhs.add(-20);
        lhs.add(69);
        lhs.add(187);
        lhs.add(-188);
        lhs.add(7);
        lhs.add(-1000);
        lhs.add(212121);
        System.out.println(lhs);// выведет элементы в порядк их ввода
        Set<Integer> ts = new TreeSet<>();//создание  TreeSet
        ts.add(1);
        ts.add(10000);
        ts.add(-20);
        ts.add(69);
        ts.add(187);
        ts.add(-188);
        ts.add(7);
        ts.add(-1000);
        ts.add(212121);
        System.out.println(ts);// выведет элементы в порядке возрастания
    }
}