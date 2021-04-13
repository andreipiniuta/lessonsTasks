package collections.compare;

import java.util.Comparator;

public class ClientComparator implements Comparator<ClientComparator> {
    private String name;
    private int age;

    public ClientComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client name is " + name + " her age is " + age;
    }


    @Override  //переопределяем метод compare
    public int compare(ClientComparator c1, ClientComparator c2) {//сравниваем объекты с1 и с2
                return c1.getName().compareTo(c2.getName());//имя у с1 сравниваем с именем у с2 т.е. сортируем объекты по возрастанию имён
    }
}