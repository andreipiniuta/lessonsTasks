package Enam;

import Task6C.Position;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Position position1 = Position.director;//объявление объекта(перемен) и инициализация его значением director
        Position position2 = Position.programmer;// то же
        //второй способ объявление объекта(перемен) и инициализация его значением
        String name = "qa"; //перемен равна "qa"
        Position position3 = Position.valueOf(name);//присваиваем enam-ской перемен position3 значение "qa"

        //основные методы
        System.out.println(Arrays.toString(Position.values()));//вывод всех элементов Enam-a через Arrays.toString (массив не через цикл)
        System.out.println(position1.name());// выводит имя присвоенное перемен(объкту) position2
        System.out.println(position3.toString());// преобразует имя присвоенное перемен(объкту) position3 в строку
        System.out.println(position1.ordinal());//выводит номер ячейки(индекс), где хранится значение, присвоенное перемен(объекту) position1
        System.out.println(position1.getClass());// узнает полное название Еnama
        System.out.println(position3.compareTo(position1));// выдает разницу(число) между номерами ячеек, где лежат значения объектов position3 и position1
        System.out.println(position2.compareTo(position1));// то же
    }
}
