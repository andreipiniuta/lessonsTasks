package OOP.container.generic;

public class GenericContainer2<T,D> {// с двумя genericами
    private T value;
    private D info;

    public GenericContainer2(T value, D info) {
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
