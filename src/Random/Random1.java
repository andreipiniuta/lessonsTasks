package Random;
import java.util.Random;

public class Random1 {

    public static void main (String[] args) {
        Random ram = new Random(); //Random это класс, ram это перемен класса Random,  =new Random  это создание ЭТОЙ ПЕРЕМЕННОЙ, которая может генерировать случ числа
        int v1 = ram.nextInt (10);//целой перемен v1 присваиваем значение перемен ram  c методом чтения целых чисел и создания случ 10 чисел (от 0 до 9)
        System.out.println(v1);
        int v2 = ram.nextInt (100); // ......и создания случ 100 чисел (от 0 до 99)
        System.out.println(v2);
        int v6 = ram.nextInt (1000);
        System.out.println(v6);
    }
}
