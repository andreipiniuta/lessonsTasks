package Task5A.arrays.utils;

import java.util.Scanner;

public class ArrayUtils {
    public static void arrayMaxValue (int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void arrayIndexWithMaxValue (int [] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
    public static void arrayMinValue (int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
    public static void arrayIndexWithMinValue (int [] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }
    public static void arraySum (int [] array) {
        int sum = 0;
        for (int cellvalue : array) {
            sum = sum + cellvalue;
        }
        System.out.println(sum);
    }
    public static void arrayProduct (int [] array) {
        int product = 1;
        for (int cellvalue : array) {
            product = product * cellvalue;
        }
        System.out.println(product);
    }
    public static void arraySumEven (int [] array) {
        int sumEven = 0;
        for (int cellvalue : array) {
            if (cellvalue % 2 == 0) {
                sumEven = sumEven + cellvalue;
            }
        }
        System.out.println(sumEven);
    }
    public static void arraySumOdd (int [] array) {
        int sumOdd = 0;
        for (int cellvalue : array) {
            if (cellvalue % 2 != 0) {
                sumOdd = sumOdd + cellvalue;
            }
        }
        System.out.println(sumOdd);
    }
    public static void arrayIndexCheckValueFromStart (int [] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check number of value you'd entered");
        String str = sc.nextLine();
        int checkValue = Integer.parseInt(str);
        int indexOf = -1;
        for (int i = 0; i < array.length; i++) {
            if (checkValue == array[i]) {
                indexOf = i;
                break;
            }
        }
        System.out.println(indexOf);
    }
    public static void arrayIndexCheckValueFromEnd (int [] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check number of value you'd entered");
        String st = sc.nextLine();
        int checkValue = Integer.parseInt(st);
        int lastIndexOf = -1;
        for (int j = array.length - 1; j >= 0; j--) {
            if (checkValue == array[j]) {
                lastIndexOf = j;
                break;
            }
        }
        System.out.println(lastIndexOf);
    }
}

