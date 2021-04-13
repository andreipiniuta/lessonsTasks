package OOP.constructorInitilization.constructor;

public class Person {
    private String name;
    private int age;
//    {
//     this.name = "petr";// блок инициализации классса нигде не используется
//        System.out.println("junior");
//    }

    // если не написать конструктор, то он тоже будет по умолчанию, но уже не явный
    public Person (){         // конструктор по умолчанию, о явный  (конструктор без параметров)
        this.name = "Unknown";
        this.age = 18;
    }


    public Person(String name) { //констр с 1 параметром
        this.name = name;
    }

    public Person(int age) { //констр с 1 параметром
        this.age = age;
    }


    public Person (String name, int age) {// конструктор с 2 параметрами
        this.name = name;
        this.age = age;
    }

    public void aboutMe() {
        System.out.println("I'm "+ name +  "I'm + " + age);
    }
}
