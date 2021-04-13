package DAO;

//Класс Singletone по созданию ID-шников
public class IDGenerator {
    private Integer nextID =0;// поле ID начиная с нуля

    private static IDGenerator idGenerator = new IDGenerator();//создали объект Singleton-а.  ПУНКТ 1 Singleton-а

    public static IDGenerator getIdGenerator() { // getter  ПУНКТ 2 Singleton-а
        return idGenerator;
    }

    private IDGenerator() {// ПРИВАТНЫЙ КОНСТРУКТОР  ПУНКТ 3 Singleton-а
    }

    public Integer nextID() { //метод для установки ID-шников
        nextID++;
        return nextID;
    }

}
