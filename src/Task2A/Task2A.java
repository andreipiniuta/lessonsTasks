package Task2A;

import java.util.Scanner;

public class Task2A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        if (a>b & a>c & b>c) {
            System.out.println(a);
            System.out.println(c);
            }
        if (a>b & a>c & c>b) {
            System.out.println(a);
            System.out.println(b);
        }
        if (c>b & c>a & b>a) {
            System.out.println(c);
            System.out.println(a);
        }
        if (c>b & c>a & a>b) {
            System.out.println(c);
            System.out.println(b);
        }
        if (b>a & b>c & c>a) {
            System.out.println(b);
            System.out.println(a);
        }
        if (b>a & b>c & a>c) {
            System.out.println(b);
            System.out.println(c);
        }
    }
}
