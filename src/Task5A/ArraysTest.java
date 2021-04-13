package Task5A;

import java.util.Scanner;

import static Task5A.arrays.utils.ArrayUtils.*;
import static Task5A.arrays.utils.MatrixUtils.*;

public class ArraysTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        String s = sc.nextLine();
        int size = Integer.parseInt(s);
        int [] array = new int[size];
        int index = 0;
        while (index < array.length) {
            System.out.println("enter value");
            String str = sc.nextLine();
            int value = Integer.parseInt(str);
            array[index] = value;
            index++;
        }
        arrayMaxValue (array);
        arrayIndexWithMaxValue (array);
        arrayMinValue (array);
        arrayIndexWithMinValue (array);
        arraySum(array);
        arrayProduct(array);
        arraySumEven(array);
        arraySumOdd(array);
        arrayIndexCheckValueFromStart(array);
        arrayIndexCheckValueFromEnd(array);



        System.out.println("Enter N"); //вводим кол-во строк
        String st = sc.nextLine();
        int N = Integer.parseInt(st);
        System.out.println("Enter M");//вводим кол-во столбцов
        String str = sc.nextLine();
        int M = Integer.parseInt(str);
        int[][] arrayMatrix = new int[N][M];// создаем двухмерный массив
        for (int indexN = 0; indexN < N; indexN++) { // гоняем цикл по строке
            for (int indexM = 0; indexM < M; indexM++) { // внутри цикла строки гоняем цикл по столбцу
                System.out.println("enter value");
                String strn = sc.nextLine();
                int value = Integer.parseInt(strn);
                arrayMatrix[indexN][indexM] = value;// заполняем ячейки по порядку значениеми пока ходит цикл
            }
        }
        arrayMaxValueInN(N, M, arrayMatrix);
        arrayMaxValueInM(N, M, arrayMatrix);
        arraySumEachN (N, M, arrayMatrix);
        arrayProductEachM (N, M, arrayMatrix);
        arrayChangeNInsteadM (N, M, arrayMatrix);
        arrayValueOnlyEven (N, M, arrayMatrix);


    }
}
