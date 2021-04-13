package OOP.constructorInitilization.summater;

public class Main {
    public static void main(String[] args) {
        Summater s = new Summater();
        s.addValue(10);
        s.addValue(15);
        s.addValue(18);
        s.printSum();

        ChainSummater cs = new ChainSummater();
        cs.addValue(10).addValue(20).printSum().addValue(42).addValue(48).printSum();//cs.addValue(10) становиться объектом и мы можем у них опять вызывать метод

        StringBuilder builder= new StringBuilder();
        builder.append("Hello").append(15).append("yes");// метод который все переводит в строку и складывает строки
        StringBuffer buffer = new StringBuffer();
        buffer.append(18).append(87).append("No"); // метод который все переводит в строку и складывает строки
        System.out.println(builder);
        System.out.println(buffer);
    }

}
