package OOP.container;

public class Container {//базовый класс создается когда мы не знаем каким типом данных будем объекты будущие
    private Object value;//тип данных Object

    public Container(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}