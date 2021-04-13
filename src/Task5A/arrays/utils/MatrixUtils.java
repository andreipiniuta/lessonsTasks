package Task5A.arrays.utils;

public class MatrixUtils {

    public static void arrayMaxValueInN (int N, int M, int [] [] arrayMatrix) {
        int maxN = 0;
        int max = arrayMatrix[0][0]; // сздаем перемен max и присваиваем значение ей ячейки 0 0
        for (int i = 0; i < N; i++) { // гоняем цикл по строке
            for (int j = 0; j < M; j++) { // внутри цикла строки гоняем цикл по столбцу
                if (max < arrayMatrix[i][j]) {// ищем макс значение
                    max = arrayMatrix[i][j];// если значение большее, то записываем в перемен макс
                    maxN = i; // и перемен maxN присваиваем номер строики
                }
            }
        }
        System.out.println(maxN);
    }

    public static void arrayMaxValueInM (int N, int M, int [] [] arrayMatrix) {
        int maxM = 0;
        int max = arrayMatrix[0][0]; // сздаем перемен max и присваиваем значение ей ячейки 0 0
        for (int i = 0; i < N; i++) { // гоняем цикл по строке
            for (int j = 0; j < M; j++) { // внутри цикла строки гоняем цикл по столбцу
                if (max < arrayMatrix[i][j]) {// ищем макс значение
                    max = arrayMatrix[i][j];// если значение большее, то записываем в перемен макс
                    maxM = j; // и перемен maxM присваиваем номер столбца
                }
            }
        }
        System.out.println(maxM);
    }
    public static void arraySumEachN (int N, int M, int [] [] arrayMatrix) {
        int[] arrayN = new int[N];
        for (int i = 0; i < N; i++) { // гоним по строкам
            int sumN = 0;
            for (int j = 0; j < M; j++) {// в каждой строке перебираем стобцы
                sumN = sumN + arrayMatrix[i][j];// и складываем значения в столбцах
            }
            arrayN[i] = sumN; // присваиваем значение суммы значений в каждой строке в ячейку нового массива
        }
        for (int a : arrayN) {
            System.out.println(a);
        }
    }

    public static void arrayProductEachM (int N, int M, int [] [] arrayMatrix) {
        int[] arrayM = new int[M]; //создаем новый массив размером сколько столбцов в основном массиве
        for (int j = 0; j < M; j++) { // в цикле сначана гоним по столбцам
            int productM = 0;
            for (int i = 0; i < N; i++) { //в каждом столбе перебираем строки
                productM = productM * arrayMatrix[i][j];//и перемножаим значения с строках
            }
            arrayM[j] = productM;
        }
        for (int b:arrayM ) {
            System.out.println(b);
        }
    }
    public static void arrayChangeNInsteadM (int N, int M, int [] [] arrayMatrix) {
        int [] [] arrayMatrixChange = new int [M] [N];// создаем новый массив меняя местами кол-во стоки со кол-вом столбцов
        for (int i = 0; i<N; i++ ) {
            for (int j = 0; j < M; j++) {
                arrayMatrixChange[j][i] = arrayMatrix[i][j];//переписываем значения из старого массива в новый меняя местами строки со столбцами
            }
        }
        for (int p=0; p<M; p++){
            for (int q = 0; q<N; q++){
                System.out.print(arrayMatrixChange [p] [q] +"  ");//выводим поэлементно значения двумерного массива
            }
            System.out.println(); //после завершения  элементов строки печатаем с новой строчки
        }
        System.out.println();
    }
    public static void arrayValueOnlyEven (int N, int M, int [] [] arrayMatrix) {
        String [] [] arrayOnlyEven = new String [N] [M];// создаем новый String массив чтобы можно было помещать в ячейку ничего(пустую строку)
        for (int i = 0; i<N; i++ ) {
            for (int j = 0; j < M; j++) {
                if (arrayMatrix[i][j] % 2 ==0) {//если значение ячейки четное
                    arrayOnlyEven [i] [j] = arrayMatrix[i] [j] + " ";//то заносим значение в ячейку в новый массив меняя чило на строку тк массив String
                }
            }
        }
        for (int p=0; p<N; p++){
            for (int q = 0; q<M; q++){
                System.out.print(arrayOnlyEven [p] [q] +"  ");//выводим поэлементно значения двумерного массива
            }
            System.out.println(); //после завершения  элементов строки печатаем с новой строчки
        }
    }
}
