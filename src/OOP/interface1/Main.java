package OOP.interface1;

import kotlin.ParameterName;

public class Main {
    public static void main(String[] args) {
        Person part = new Partner("Tina", 45);
        Person e = new Employee("Bob", 28);
        Person cl = new Client("Georg", 36);
        Credit cr = new Credit(12.55);
        Office of = new Office("Saratoga 15");
        part.aboutMe();
        e.aboutMe();
        cl.aboutMe();
        cr.aboutMe();
        cr.saveMe();
        cr.printMyInfo();
        of.aboutMe();
        of.printMyInfo();
    }
}
