package FromKeyboardSquareArrayCreateInputPrint;

import java.util.Scanner;

public class SquareARRAYCreateAndPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        String st = sc.nextLine();
        int N = Integer.parseInt(st);// задаем кол-во строк
        System.out.println("Enter M");
        String str = sc.nextLine();
        int M = Integer.parseInt(str);// задаем кол-во столбцов
        int [] [] array = new int [N] [M]; // создаем двухмерный массив
        for (int indexN = 0; indexN<N; indexN++ ){// заполняем через 2 цикла
            for (int indexM = 0; indexM<M; indexM++){
                System.out.println("enter value");
                String s = sc.nextLine();
                int value = Integer.parseInt(s);
                array [indexN] [indexM]  = value;// заполнение ячеек значениями
            }
        }
        for (int i=0; i<N; i++){
            for (int j = 0; j<M; j++){
                System.out.print(array[i] [j] +"  ");//выводим поэлементно
            }
            System.out.println(); //после завершения  элементов строки печатаем с новой строчки
        }

    }
}

