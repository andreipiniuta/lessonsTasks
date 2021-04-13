package Exeption;

import java.util.Scanner;
//Единственный случай когда нужно делать секцию try catch у RuntimeException---(NumberFormatException e) -- ввод данных неправильного формата
public class ExceptionTest {
    public static void main(String[] args) {
        double input = 1;
        while (input != 0.00) {
                System.out.println("Enter double");
            try {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                input = Double.parseDouble(s);//тут может появится ошибка, если появится, выполнение не пойдет ниже, уйдет в блок catch
                System.out.println(input);
                if (input == 0.00){
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter valid double");
                continue;
            }
        }
    }
}
