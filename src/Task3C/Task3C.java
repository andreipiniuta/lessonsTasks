package Task3C;

import java.util.Scanner;

public class Task3C {
// движение объекта по полю 10х10
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = "";
       int x = 0; //движение по лево-право
       int y = 0;// движение вверх-вниз
       do {input = sc.nextLine();// вводятся только a,s,d,w,A,S,D,W, для выхода q и Q
           if (!((input.equals("a")) || (input.equals("A")) || (input.equals("w")) || (input.equals("W")) || (input.equals("s")) ||
                   (input.equals("S")) || (input.equals("d")) || (input.equals("D")) || (input.equals("q")) ||(input.equals("Q")))){
               // так как сравнение у String (== и !=) не работает, то используем перемен.equals для равно (==) и !(перемен.equals) не равно(!=)
           System.out.println("Incorrect move!");
           }else {
               switch (input) {//всего 4 варианта: а влево, w вверх s вниз d вправо
                   case "a":
                       if (x <= 0) {// выход за границу поля 10х10 влево
                       System.out.println("Crossing Border!!!");
                       continue;
                   }
                   x = x - 1; //увеличиваем клетку на -1 т.е переместилось влево
                   break;

                   case "A":
                       if (x <= 0) {
                           System.out.println("Crossing Border!!!");
                           continue;
                       }
                       x = x - 1;
                       break;

                   case "w":
                       if (y <= 0) {// выход за границу поля 10х10 вверх
                       System.out.println("Crossing Border!!!");
                       continue;
                   }
                   y = y - 1;//увеличиваем клетку на -1 т.е переместилось вверх
                   break;

                   case "W":
                       if (y <= 0) {
                           System.out.println("Crossing Border!!!");
                           continue;
                       }
                       y = y - 1;
                       break;

                   case "s":
                       if (y >= 10) {// выход за границу поля 10х10 вниз
                       System.out.println("Crossing Border!!!");
                       continue;
                   }
                   y = y + 1; //увеличиваем клетку на +1 т.е переместилось вниз
                   break;
                   case "S":
                       if (y >= 10) {
                           System.out.println("Crossing Border!!!");
                           continue;
                       }
                       y = y + 1;
                       break;

                   case "d":
                       if (x >= 10) {// выход за границу поля 10х10 вправо
                       System.out.println("Crossing Border!!!");
                       continue;
                   }
                   x = x + 1; //увеличиваем клетку на +1 т.е переместилось вправо
                   break;

                   case "D":
                       if (x >= 10) {
                           System.out.println("Crossing Border!!!");
                           continue;
                       }
                       x = x + 1;
                       break;
               }
               System.out.println(x); //вывод координаты по влево-вправо
               System.out.println(y); //вывод координаты по вниз-вверх
           }
       }
       while (!((input.equals("q")) || (input.equals("Q")))); // как только пользователь ввел q или Q прерываем цикл и прога завершается Т.Е ВВОД не равен a,s,d,w и A,S,D,W
    }
}
