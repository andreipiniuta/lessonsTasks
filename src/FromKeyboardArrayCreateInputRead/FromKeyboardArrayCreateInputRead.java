package FromKeyboardArrayCreateInputRead;

import java.util.Arrays;
import java.util.Scanner;

public class FromKeyboardArrayCreateInputRead {
    // создание массива, заполнение с клавы его размера и ячеек, чтение массива
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // команда на ввод у премен sc
        System.out.println("enter number of digits"); //просим пользователя задать размер массива
        String s = sc.nextLine(); // //Сроковая переменная s равна перемен sc с методом чтения строки
        int size = Integer.parseInt(s); // целая перемен size равна значению перемен s  переведенной из строки в целое число
        if ((size == 0) || (size < 0)) {
            System.out.println("you can't enter 0 as a first digit or -digit");
        } else {
            int[] array = new int[size]; // создаем массив array с размером(длиной) size
            int index = 0; //index номер ячейки с нуля
            while (index < size) { //гоним цикл пока макс номер не дойдет до размера массива (длины массива)
                System.out.println("enter digit"); // просим задать значения ячеек
                String str = sc.nextLine(); //Сроковая переменная str равна перемен sc с методом чтения строки
                int value = Integer.parseInt(str); // целая перемен value равна значению перемен str  переведенной из строки в целое число
                array[index] = value; // заполняем ячейки значениями, введенные пользователем
                index++; // увеличиваем номер на единицу и начинаем цикл заново
            }
            for (int a : array) { //выводим на каждой итерации значение ячейки массива в перемен а
                System.out.print(a); // каждую итерацию (проход цикла)печатаем значения перемен а (значение ячеек массива)
            }
        }



        //распечатка массива без цикла
        //копирование массива
        String [] arr = new String[3];//создал массив arr
        arr[0] = "A";//заполнение значением
        arr[1] ="B";
        arr[2] ="C";
        System.out.println(Arrays.toString(arr));//вывод на консоль без цикла с помощью Arrays.toString(имя массива)

        String [] arr2 =new String[4];//создал новый массив arr2 на 4 ячейки
        System.arraycopy(arr, 0, arr2, 0,3);//корируем из arr с 0 элемента копируем в arr2 с нулевой ячеки  3 элемента
// параметры метода 1.из какого массива копируем 2.с какой ячейки копируем 3.в какой массив пишем 4.с какой ячейки пишем в новый 4.сколько ячеек записываем
        arr2 [3] = "D";//добавляем новый элемент в ячейку 3
        System.out.println(Arrays.toString(arr2)); //вывод на консоль без цикла с помощью Arrays.toString(имя массива)



    }
}
