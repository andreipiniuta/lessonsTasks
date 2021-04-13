package collections.collectionGeneralCommads;

import java.util.*;
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();//создали Set строкового но у него не может быть повторов
        String s = "First object";
        set.add(s);//добавление значения
        set.add(s);
        System.out.println(set);//печатает только один объект т.к второй это повторка
        boolean b = set.remove(s);//если удалил то true
        System.out.println(set);//выводит set с уже удаленным значением
        System.out.println(b);//выводит результат true

        set.add("15");
        set.add("18");
        set.add("21");
        System.out.println(set);
        set.clear();// чистим Set
        System.out.println(set);

        set.add("15");
        set.add("18");
        set.add("21");
        System.out.println(set);
        System.out.println(set.contains("18"));//содержит ли set значение 18, вернёт true если содержит

        Set<String> set2 = new HashSet<>();
        set2.add("WWW");
        set2.add("FF");
        set2.add("DD");
        System.out.println(set2.size());//вывод размера  Set

        Set<String> set3 = new HashSet<>();// создал Set
        set3.add("WWW");// добавил элемент
        set3.add("FF");// добавил элемент
        set3.add("DD");// добавил элемент
        //set3.toArray();
        String [] array = new String[3];//создал массив
        array = set3.toArray(new String[0]);//записываем в массив  (с приведением типа String от 0 элемента)
        System.out.println(Arrays.toString(set.toArray()));//вывод массива на печать не через цикл for
    }
}
