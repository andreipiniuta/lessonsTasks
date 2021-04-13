package collections.collectionGeneralCommads;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // создание List Строкового
        list.add("Andrew");// добавление значения строковых
        list.add("AA");
        list.add("EE");
        System.out.println(list);//печать листа

        List<Double> list2 = new ArrayList<>();//создание List дробного
        list2.add(12.74);// добавление значения строковых дробных
        list2.add(78.47);
        list2.add(76.78);
        System.out.println(list2);//печать листа

        List<String> list3 = new ArrayList<>();
        String str ="АААА";
        list3.add(str);//добавили в коллекцию строку
        System.out.println(list3);
        //list3.remove(str);//удаляем объект из коллекции при условии что он был
        System.out.println(list3);
        boolean a = list3.remove(str);//удаляем и проверяем удалили или нет. true значит удалил
        System.out.println(a);

        List<String> list4 = new ArrayList<>();
        list4.add("WW");
        list4.add("PPP");
        list4.add("ooi");
        System.out.println(list4);
        list4.clear();//удаление значений из листа  он просто пустой
        System.out.println(list4);

        List<String> list5 = new ArrayList<>();
        list5.add("WW");
        list5.add("PPP");
        list5.add("ooi");
        list5.contains("WW");//проверяет содержание WW если да то true
        System.out.println(list5.contains("WW")); //вывод true

        List<String> list6 = new ArrayList<>();
        list6.add("WW");
        list6.add("PPP");
        list6.add("ooi");
        list6.size();//показывает кол-во элементов коллекции
        System.out.println(list6.size());
        //list6.toArray();//перевод в массив
        String [] array =new String[3];//сщздал массив на 3 элемента
        array = list6.toArray(new String[0]);//записываем в массив  (с приведением типа String от 0 элемента)
        System.out.println(Arrays.toString(array));//вывод массива на печать не через цикл for
    }
}
