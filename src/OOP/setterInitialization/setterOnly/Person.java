package OOP.setterInitialization.setterOnly;

public class Person {
    private String name; //поля
    private int age; //поля

// используем методы для установки значений поле т.к. поля private чтобы из вне нельзя их изменить

    public void setName(String n){ //метод установки имени, запрос идёт из Main через n

        name = n; // поле name = параметру (n) из Main
    }

    public void setAge(int a) { //метод установки возраста, запрос идёт из Main через a
        age = a;// поле age = параметру (a) из Main
    }
    public void aboutMe () { // просто метод класса
        System.out.println("I'm " + name + "I'm" + age);
    }

}
