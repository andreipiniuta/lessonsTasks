package OOP.container.generic;

public class GenericContainer3<T extends Person,D extends Person> {//ограничение genericов
    private T value;
    private D info;

    public GenericContainer3(T value, D info) {
        this.value = value;
        this.info = info;
    }

    public T getValue() {
        return value;
    }

    public D getInfo() {
        return info;
    }
}
