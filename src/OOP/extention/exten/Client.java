package OOP.extention.exten;

public class Client extends Person { //Client наследуется от Person
    private double creditPercent; //поле наследника

    public double getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(double creditPercent) {
        this.creditPercent = creditPercent;
    }

//    public String getFirstName() { //метод наследника с таким же названием как и у родителя, ТАК НЕ ДЕЛАТЬ, ДЕЛАЕМ РАЗНЫЕ ИМЕНА МЕТОДОВ В РОДИТЕЛЕ И НАСЛЕДНИКЕ
//        return null;
//    }

//    public void aboutMe() { // вызов метода родителя getFirstName() через super ТАК НЕ ДЕЛАТЬ, ДЕЛАЕМ РАЗНЫЕ ИМЕНА МЕТОДОВ В РОДИТЕЛЕ И НАСЛЕДНИКЕ
//        System.out.println("Client is " +  super.getFirstName() + " " +  getLastName() + " " +  getMiddleName() + " " +creditPercent );
//    }

    public void aboutMe() {// если включить  метод наследника getFirstName() с таким же названием как и у родителя (стр14-16), то вместо "Andrew" выведет null т.к. здесь getFirstName() без super
        System.out.println("Client is " + getFirstName() + " " // для использования полей родителя (Person) используем не имя поля а getter
                +  getLastName() + " " +  getMiddleName() + " " +creditPercent ); //для использования полей наследника (своих же полей) используем как обычно имя поля
    }
}
