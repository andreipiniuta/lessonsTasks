package Task4C;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Task4C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N"); //вводим кол-во строк
        String st = sc.nextLine();
        int N = Integer.parseInt(st);
        System.out.println("Enter M");//вводим кол-во столбцов
        String str = sc.nextLine();
        int M = Integer.parseInt(str);
        int [] [] array = new int [N] [M];// создаем двухмерный массив
        for (int indexN = 0; indexN<N; indexN++ ){ // гоняем цикл по строке
            for (int indexM = 0; indexM<M; indexM++){ // внутри цикла строки гоняем цикл по столбцу
                System.out.println("enter value");
                String s = sc.nextLine();
                int value = Integer.parseInt(s);
                array [indexN] [indexM]  = value;// заполняем ячейки по порядку значениеми пока ходит цикл
            }
        }// ещем индекс строки и столбца где есть макс значение
        int maxN = 0;
        int maxM = 0;
        int max = array [0] [0]; // сздаем перемен max и присваиваем значение ей ячейки 0 0
        for (int i = 0; i<N; i++) { // гоняем цикл по строке
            for (int j = 0; j<M; j++) { // внутри цикла строки гоняем цикл по столбцу
                if (max < array[i] [j]) {// ищем макс значение
                    max = array[i] [j];// если значение большее, то записываем в перемен макс
                    maxN = i; // и перемен maxN присваиваем номер строики
                    maxM = j; // и перемен maxM присваиваем номер столбца
                }
            }
        }
        System.out.println(maxN);
        System.out.println(maxM);

//ищем сумму значений в строчках представляя в массиве и произведение значений в стобчах  представляя в массиве
        int [] arrayN = new int [N]; //создаем новый массив размером сколько строк в основном массиве
        for (int i = 0; i<N; i++) { // гоним по строкам
            int sumN = 0;
            for (int j = 0; j<M; j++) {// в каждой строке перебираем стобцы
                sumN = sumN + array[i] [j];// и складываем значения в столбцах
            }
            arrayN [i] = sumN; // присваиваем значение суммы значений в каждой строке в ячейку нового массива
        }
        for (int a:arrayN ) {
            System.out.println(a);//вывод одномерного массива на экран
        }

// то же но со столбцами
        int [] arrayM = new int [M];//создаем новый массив размером сколько столбцов в основном массиве
        for (int j = 0; j<M; j++) {// в цикле сначана гоним по столбцам
            int umM = 1;
            for (int i = 0; i<N; i++) {//в каждом столбе перебираем строки
                umM = umM * array[i] [j];//и перемножаим значения с строках
            }
            arrayM [j] = umM;
        }
        for (int b:arrayM ) {
            System.out.println(b);
        }
//меняем местами строки со столбцами
        int [] [] ARRAY = new int [M] [N];// создаем новый массив меняя местами кол-во стоки со кол-вом столбцов
        for (int i = 0; i<N; i++ ) {
            for (int j = 0; j < M; j++) {
                ARRAY[j][i] = array[i][j];//переписываем значения из старого массива в новый меняя местами строки со столбцами
            }
        }
        for (int p=0; p<M; p++){
            for (int q = 0; q<N; q++){
                System.out.print(ARRAY [p] [q] +"  ");//выводим поэлементно значения двумерного массива
            }
            System.out.println(); //после завершения  элементов строки печатаем с новой строчки
        }
        System.out.println();

        // выводим на экран только четные значения массива
        String [] [] ARRAY2 = new String [N] [M];// создаем новый String массив чтобы можно было помещать в ячейку ничего(пустую строку)
        for (int i = 0; i<N; i++ ) {
            for (int j = 0; j < M; j++) {
               if (array[i][j] % 2 ==0) {//если значение ячейки четное
                   ARRAY2 [i] [j] = array[i] [j] + " ";//то заносим значение в ячейку в новый массив меняя число на строку тк массив String
               }
            }
        }
        for (int p=0; p<N; p++){
            for (int q = 0; q<M; q++){
                System.out.print(ARRAY2 [p] [q] +"  ");//выводим поэлементно значения двумерного массива
            }
            System.out.println(); //после завершения  элементов строки печатаем с новой строчки
        }


    }
}
