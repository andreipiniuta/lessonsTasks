package Task4B;

import java.util.Scanner;

public class Task4B {
    // создание массива, заполнение с клавы, чтение смотри в другой папке
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        String s = sc.nextLine();
        int N = Integer.parseInt(s);
        int[] array = new int[N];
        int index = 0;
        while (index < N) {
            System.out.println("enter value");
            String str = sc.nextLine();
            int value = Integer.parseInt(str);
            array[index] = value;
            index++;
        }
        int maxN = 0;
        int max = array[0];
        int min = array[0];
        int minN = 0;
        for (int i = 0; i < N; i++) {
            if (max < array[i]) {
                max = array[i]; // находим максимальное значение в массиве
                maxN = i; // номер ячейки где лежит макс значение
            }
            if (min > array[i]) {
                min = array[i]; // находим мин значение в массиве
                minN = i; // номер ячейки где лежит мин значение
            }
        }
        System.out.println(max);
        System.out.println(maxN);
        System.out.println(min);
        System.out.println(minN);
        int sum = 0;
        int umnozz = 1;
        int sumEven = 0; // сумма четных
        int sumOdd = 0; // сумма нечетныx
        for (int cellvalue : array) {
            sum = sum + cellvalue;
            umnozz = umnozz * cellvalue;
            if (cellvalue % 2 == 0) {
                sumEven = sumEven + cellvalue;
            }
            if (cellvalue % 2 != 0) {
                sumOdd = sumOdd + cellvalue;
            }
        }
        System.out.println(sum);
        System.out.println(umnozz);
        System.out.println(sumEven);
        System.out.println(sumOdd);
        // нахождение мин номера ячейки где лежит повторяющее значение, введенное с клавы
        System.out.println("Check number of value you'd entered");// просим ввести цифру для проверки портор значения среди чисел в массиве
        String str = sc.nextLine();
        int checkValue = Integer.parseInt(str);
        int indexOf = -1;
        for (int i = 0; i < N; i++) {// идем от нулевой ячейки до макс номера ячейки
            if (checkValue == array[i]) { //ищет повтор значение
                indexOf = i; // как только нашел записываем номер ячейки в перемен indexOf
                break; //и сразу вырубаем цикл так уже нашли наименьший номер ячейки, где лежит повтор
            }
        }
        if (indexOf < 0) { //это в случаи, что повторки нет вообще, indexOf не записался и равен значению по умолчанию (-1)
            System.out.println("-1");
        } else {
            System.out.println(indexOf);
        }
        //нахождение макс номера ячейки где лежит повторяющее значение, введенное с клавы
        System.out.println("Check the last number of value you'd entered");
        String st = sc.nextLine();
        int lastCheckValue = Integer.parseInt(st);
        int lastIndexOf = -1;
        for (int j = array.length - 1; j >= 0; j--) {// тоже самое, только идем от макс номера ячейки до нулевой
            if (lastCheckValue == array[j]) {
                lastIndexOf = j;
                break;
            }
        }
        if (lastIndexOf < 0) {
            System.out.println("-1");
        } else {
            System.out.println(lastIndexOf);
        }
    }
}

