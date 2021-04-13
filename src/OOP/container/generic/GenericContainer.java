package OOP.container.generic;


public class GenericContainer <T> {//без указания конкретного типа (T это generic)
    private T value;

    public GenericContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


}
