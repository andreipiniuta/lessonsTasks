package Task3BandBableSort;

import java.util.Scanner;

public class Task3B {
// создание массива, заполнение с клавы, чтение смотри в другой папке
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of digits");
        String s = sc.nextLine();
        int size = Integer.parseInt(s);
        if ((size > 10) || (size <= 0)) {
            System.out.println("you can't enter number of digits such as 0; -digit or more that 10 ");
        } else {
            int[] array = new int[size];
            int index = 0;
            while (index < size) {
                System.out.println("enter digit");
                String str = sc.nextLine();
                if (str.equals("q") && (index > 1)) { // после ввода 2х цифр буквой q выход из программы
                    break;
                }
                int value = Integer.parseInt(str);
                if ((value > 9) || (value < 0)) {  // не дает ввести отрицательн и больше 9
                    System.out.println("You can input only digits from 0 to 9");
                    continue;
                }
                if (index > 0) { //  // не дает ввести повторяющие число
                    boolean exit = false;//спец перемен для сработки continue в цикле while,  а не в for
                    for (int indexSearch = 0; indexSearch < index; indexSearch++) {
                        if (array[indexSearch] == value) {// если в какой-либо ячейки будет уже значение такое же как вводят(дубликат) , то
                            System.out.println("Dublipat input for");
                            exit = true;//то меняем спец перемен для сработки continue
                            break;// выходим из for
                        }
                    }
                    if (exit == true){ //условие срабатывания continue
                        continue;// уходит на while, на ввод данных заново (сработает continue)
                    }
                }
                array[index] = value;
                index++;
                //пузырьковая сортировка
            } //дальше создаем минимальную цифру из чисел массива; пузырьковая сортировка
            for (int j = array.length-1; j > 0; j--) { //  гоним от мах номера ячейки до 0
                for (int i = 0; i < j; i++) { //гоним от 0 до мах номера ячейки, с каждым циклом уменьшаем до какого номера гоним
                    if (array[i] > array[i+1]) { //сравниваем значение нулевого номер и следующим, если больше, то значения в ячейках меняем местами
                        int a = array[i]; // меняем местами с пом перемен а
                        array[i]=array[i+1]; // меняем местами с пом перемен а
                        array[i+1]=a; // меняем местами с пом перемен а
                    }
                }
            }
            for (int c : array) { //выводим массив в перемен с
                if (array[array.length - 1] % 2 == 0) { // если четное то печатаем т.е. мах значение ячейки делится на 2 без остатка
                    System.out.print(c);
                } else {
                    System.out.print("No such number ");
                    break;
                }
            }
        }
    }
}
