package collections.collectionGeneralCommads;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q =new ArrayDeque<String>();//создали Queue строковый
        String as = "World";
        q.add(as);// добавление элемента
        q.add("smile");// добавление элемента
        System.out.println(q);//вывод на печать
        boolean c = q.remove(as);//если удалил то true
        System.out.println(q);//выводит queue с уже удаленным значением
        System.out.println(c);//выводит результат true

        q.add("Stop");
        q.add("post");
        System.out.println(q);
        q.clear();// чистим Queue
        System.out.println(q);//вывод пустого Queue

        q.add("otto");
        q.add("number34");
        System.out.println(q);
        System.out.println(q.contains("otto"));//содержит ли queue значение "otto", вернёт true если содержит
        System.out.println(q.size());//вывод размера queue
        String [] array = new String[2];//создал массив
        array = q.toArray(new String[0]);//записываем в массив  (с приведением типа String от 0 элемента)
        System.out.println(Arrays.toString(q.toArray()));//вывод массива на печать не через цикл for

    }
}
