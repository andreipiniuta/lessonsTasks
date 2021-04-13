package OOP.extention.extanAndConstr;

public class VipClient extends Client { //VIPClient наследник от Client

    // у VipClient нет своих полей
    public VipClient(String firstName, String lastName, String middleName, double creditPercent) {
        super(firstName, lastName, middleName, creditPercent);//конструктор (на 4 параметра) только с super т.к у class VipClient нет своих полей
    }

    public VipClient(String lastName, String middleName, double creditPercent) { //конструктор (на 3 параметра) только с super т.к у class VipClient нет своих полей
        super(lastName, middleName, creditPercent);
    }

    public VipClient(String firstName, double creditPercent) { //конструктор (на 2 параметра) только с super т.к у class VipClient нет своих полей
        super(firstName, creditPercent);
    }
}

