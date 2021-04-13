package Task2Switch;

import java.util.Scanner;

public class Task2Switch {

    private static final double P = 3.1415;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter type figure");
            String str = sc.nextLine();
            switch (str) {
                case "rectangle":
                    System.out.println("Enter a");
                    double a = sc.nextDouble();
                    System.out.println("Enter l");
                    double l = sc.nextDouble();
                    double s1 = a*l/2;
                    System.out.println("S="+s1);
                break;
                case "trapeze":
                    System.out.println("Enter b");
                    double b = sc.nextDouble();
                    System.out.println("Enter c");
                    double c = sc.nextDouble();
                    System.out.println("Enter h");
                    double h = sc.nextDouble();
                    double  s2 = (b+c)/2*h;
                    System.out.println("S="+s2);
                    break;
                case "polygon":
                    System.out.println("Enter r");
                    double r = sc.nextDouble();
                    double s3 = r*P/2;
                    System.out.println("S="+s3);
                break;
                case "circle":
                    System.out.println("Enter R");
                    double R = sc.nextDouble();
                    double s4 = R*R*P;
                    System.out.println("S="+s4);
                 break;
            }
        }
}
