package TaskZ;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class CclientApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Start work with ABZ \n Enter ABZ Name");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Abz abz1 = new Abz(s);
        System.out.println("Enter command");
        System.out.println("1 - Update recipe");
        System.out.println("2 - Accept Material Delivery");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        switch (string){
            case "1":

            case "2":
                abz1.addMaterial();
                break;
        }
    }
}
