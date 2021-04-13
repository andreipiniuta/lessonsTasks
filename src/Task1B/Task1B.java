package Task1B;

import java.util.Scanner;

public class Task1B {

    private static final int MINUTERS_IN_HOUR = 60;

    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Scanner это класс, sc это перемен класса Scanner,  =new Scanner  это создание ЭТОЙ ПЕРЕМЕННОЙ, с командой ввод с клавы(System.in)
        System.out.println("Enter courseName");
        String courseName = sc.nextLine();
        System.out.println("Enter courseCost");
        double courseCost = sc.nextDouble(); //переменная courseCost типа double равна переменной sc(класса Scanner) с методом  nextDouble (СТИТЫВАЕТ ТИП double С КЛАВЫ)
        System.out.println("Enter lessonCount");
        double lessonCount = sc.nextDouble();// ТО ЖЕ С ДРУГОЙ ПЕРЕМЕННОЙ
        System.out.println("hoursInLesson");
        double hoursInLesson = sc.nextDouble(); // ТО ЖЕ С ДРУГОЙ ПЕРЕМЕННОЙ
        double lessonCost=courseCost / lessonCount; // расчет
        double hourCost=lessonCost / hoursInLesson; //расчет
        double minuteCost=hourCost / MINUTERS_IN_HOUR; //расчет
        double secondCost=minuteCost / SECONDS_IN_MINUTE; //расчет
        System.out.println("lesson=" + lessonCost +"bin");
        System.out.println("hour=" + hourCost +"bin");
        System.out.println("minute=" + minuteCost +"bin");
        System.out.println("second=" + secondCost +"bin");
    }
}
