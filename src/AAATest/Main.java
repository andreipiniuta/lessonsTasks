package AAATest;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test (15);
        Test t2 = new Test ("road");
        Integer i = (Integer) t1.getValue();
        String str = (String) t2.getValue();
        System.out.println(i);
        System.out.println(str);

        Generick <Integer> a = new Generick <>(25);
        Generick <String > b = new Generick <>("year");

        Integer i2 = a.getAge();
        String s = b.getAge();
        System.out.println(i2);
        System.out.println(s);

    }
}
