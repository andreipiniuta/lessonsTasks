package Task3A;

import javax.swing.*;
import java.util.Scanner;

public class Task3A {

    public static void main(String[] args) {
        int a;// объявил перемен но не задал её
        int rest; //  объявил перемен но не задал её
        String result = ""; // пустая строка
        String result16 = ""; // пустая строка
        Scanner sc = new Scanner(System.in);
        System.out.println("number system?");
        String systemSchisl=sc.nextLine();
        switch (systemSchisl) {
            case "binary":
                System.out.println("Enter a");
                a = sc.nextInt();
                while (a > 0) {
                    rest = a % 2;
                    result = rest + result;// запишет остатки в обратном порядке
                    a = a / 2;
                }
                System.out.println(result);
                break;
            case "octal":
                System.out.println("Enter a");
                a = sc.nextInt();
                while (a > 0) {
                    rest = a % 8;
                    a = a / 8;
                    result = rest + result;
                }
                System.out.println(result);
                break;
            case "hexadecimal":
                System.out.println("Enter a");
                a = sc.nextInt();
                while (a > 0) {
                    rest = a % 16;
                    if (rest>10) {
                        if (rest == 10) {
                            result16 = "A";
                        }
                        if (rest == 11) {
                            result16 = "B";
                        }
                        if (rest == 12) {
                            result16 = "C";
                        }
                        if (rest == 13) {
                            result16 = "D";
                        }
                        if (rest == 14) {
                            result16 = "E";
                        }
                        if (rest == 15) {
                            result16 = "F";
                        }
                        result = result16 + result;
                    } else {
                        result =rest + result;
                    }
                    a = a / 16;
                }
                System.out.println(result);
                break;
        }
    }
}
