package Task3A;

import java.util.Scanner;

public class Task3AVariantNew {

    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        int b = a;
        int c = a;
        while (a > 0) {
            int rest = a % 2;
            a = a / 2;
            result = rest + result;// запишет остатки в обратном порядке
        }
        System.out.println(result);
        result = "";
        while (b > 0) {
            int rest = b % 8;
            b = b / 8;
            result = rest + result;
        }
        System.out.println(result);
        result = "";
        String restLetter = "";
        while (c > 0) {
            int rest = c % 16;
            switch (rest) {
                case 10:
                    restLetter = "A";
                    break;
                case 11:
                    restLetter = "B";
                    break;
                case 12:
                    restLetter = "C";
                    break;
                case 13:
                    restLetter = "D";
                    break;
                case 14:
                    restLetter = "E";
                    break;
                case 15:
                    restLetter = "F";
                    break;
                default:
                    restLetter = rest + ""; // перевод числовой перемен rest в строку
                    break;
            }
            result = restLetter + result;
            c = c / 16;
        }
        System.out.println(result);
    }
}
