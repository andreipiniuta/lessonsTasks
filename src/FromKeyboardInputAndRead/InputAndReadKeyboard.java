package FromKeyboardInputAndRead;

import java.util.Scanner;

public class InputAndReadKeyboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);////Scanner это класс, sc это перемен класса Scanner,  =new Scanner  это создание ЭТОЙ ПЕРЕМЕННОЙ, с командой ввод с клавы(System.in)
        System.out.println("Enter a");
        String s = sc.nextLine(); //Сроковая переменная s равна перемен sc с методом чтения строки
        int a =Integer.parseInt(s); // целая перемен а равна значению перемен s  переведенной из строки в целое число
        a=a+5;
        System.out.println(a);
    }
}
// так сделано чтобы все на вводе с клавы было строковым, а если надо, то значение строки можно переделать в число