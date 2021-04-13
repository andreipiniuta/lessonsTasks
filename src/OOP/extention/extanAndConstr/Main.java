package OOP.extention.extanAndConstr;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrew", "Piniuta", "Urevich", 1.2); // на 4 параметра
        client.aboutMe();// если есть разные конструкторы можно иницилизировать значениями не все 4 поля, а только сколько надо

        VipClient vip = new VipClient("Ivan", 1.8); // на 2 параметра
        vip.aboutMe();
    }
}
