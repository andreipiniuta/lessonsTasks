package Task4D;

import java.util.Random;

public class Task4D {
    public static void main(String[] args) {
        Random ram = new Random();
        String[][] array = new String[12][12]; //создал двухмерный массив на 2 большеБ чем требуемый 10*10
        for(int s = 0; s < 12; s++) {//заполнение крайних строчек и столбцов нулем
            array [s] [0] = "0";
            array [s] [11] = "0";
            array [0] [s] = "0";
            array [11] [s] = "0";
        }
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                array[i][j] = "_"; //заполниние внутрянки нижним подчеркиванием
            }
        }
        int[] shipType = new int[]{4,3,3,2,2,2,1,1,1,1};//создал простой массив с длинами кораблей от большего к меньшей

        for (int sizeShip : shipType) {//гоним простой массив с длинами кораблей;  каждый цикл берется своя длина коробля
            boolean set = false;
            while (!set) { //спец цикл для возможности повторно бросать рандом если предыдущий рандом нам не подходит(для continue)
                int a = ram.nextInt(12);//работа рандома для координаты по строке
                int b = ram.nextInt(12);//работа рандома для координаты по столбцу
                if (array[a][b].equals("0")) {// если попал в ноль то переброс (без строчки 24 терялся бы корабль)
                    continue;
                }
                int right = 0;//переменные для проверки свободных ячеек
                int left = 0;
                int down = 0;
                int up = 0;
                for (int j = 0; j < sizeShip; j++) {//цикл для проверки свободных ячеек
                    if (array[a][b + j].equals("_")) {// свободно вправо
                        right++;
                    } else {
                        break;
                    }
                }
                for (int j = 0; j < sizeShip; j++) {//цикл для проверки свободных ячеек
                    if (array[a][b - j].equals("_")) { //свободно влево
                        left++;
                    } else {
                        break;
                    }
                }
                for (int j = 0; j < sizeShip; j++) {//цикл для проверки свободных ячеек
                    if (array[a + j][b].equals("_")) {//свободно вниз
                        down++;
                    } else {
                        break;
                    }
                }
                for (int j = 0; j < sizeShip; j++) {//цикл для проверки свободных ячеек
                    if (array[a - j][b].equals("_")) { // свободно вверх
                        up++;
                    } else {
                        break;
                    }
                }
                if ((right != sizeShip) && (left != sizeShip) && (down != sizeShip) && (up != sizeShip)) {
                    continue;//если ни в одну сторону нет свободного места перебрасываем рандом
                }
                for (int i = 0; i < sizeShip; i++) {//цикл для заполнения клеток
                    if (right == sizeShip) {// вправо
                        array[a][b + i] = "x";
                        array[a + 1][b + i] = "0";
                        array[a - 1][b + i] = "0";
                        array[a + 1][b + i + 1] = "0";
                        array[a - 1][b + i + 1] = "0";
                        array[a][b + i + 1] = "0";
                        array[a][b - 1] = "0";
                        array[a - 1][b - 1] = "0";
                        array[a + 1][b - 1] = "0";

                    } else if ((right != sizeShip) && (left == sizeShip)) {//влево
                        array[a][b - i] = "x";
                        array[a + 1][b - i] = "0";
                        array[a - 1][b - i] = "0";
                        array[a + 1][b - i - 1] = "0";
                        array[a - 1][b - i - 1] = "0";
                        array[a][b - i - 1] = "0";
                        array[a][b + 1] = "0";
                        array[a + 1][b + 1] = "0";
                        array[a - 1][b + 1] = "0";
                    } else if ((right != sizeShip) && (left != sizeShip) && (down == sizeShip)) {//вниз
                        array[a + i][b] = "x";
                        array[a + i][b + 1] = "0";
                        array[a + i][b - 1] = "0";
                        array[a + i + 1][b + 1] = "0";
                        array[a + i + 1][b - 1] = "0";
                        array[a + i + 1][b] = "0";
                        array[a - 1][b] = "0";
                        array[a - 1][b - 1] = "0";
                        array[a - 1][b + 1] = "0";
                    } else {//вверх
                        array[a - i][b] = "x";
                        array[a - i][b + 1] = "0";
                        array[a - i][b - 1] = "0";
                        array[a - i - 1][b + 1] = "0";
                        array[a - i - 1][b - 1] = "0";
                        array[a - i - 1][b] = "0";
                        array[a + 1][b] = "0";
                        array[a + 1][b - 1] = "0";
                        array[a + 1][b + 1] = "0";
                    }
                }
                set = true; // если прога дошла до сюда (то не было continue т.е. начальная координата подошла и место для коробля было) выходим из while
            }

        }
        for (int p = 1; p < 11; p++) {
            for (int q = 1; q < 11; q++) {
                System.out.print(array[p][q] + "  ");//выводим поэлементно на экран
            }
            System.out.println(); //после завершения  элементов строки печатаем с новой строчки
        }
    }
}