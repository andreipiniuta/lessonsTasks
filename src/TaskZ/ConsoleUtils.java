package TaskZ;

import java.util.Scanner;

public class ConsoleUtils {
    public static double readDouble(String message){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            String a = sc.nextLine();
            try {
                double value = Double.parseDouble(a);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Enter double only");
            }
        }
    }
}
