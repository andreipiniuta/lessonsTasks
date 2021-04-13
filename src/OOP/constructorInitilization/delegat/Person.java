package OOP.constructorInitilization.delegat;

public class Person {

        private String name;
        private int age;

        public Person (){  //делегат
            this("Unknown", 18);   // делегирование конструктора те вызываем конструктор с 2 параметрами
        }
        public Person (String name) { //делегат
            this (name, 18);    // делегирование конструктора те вызываем конструктор с 2 параметрами
        }
        public Person(int age) { //делегат
            this ("Unknown", age);  // делегирование конструктора те вызываем конструктор с 2 параметрами
        }

        public Person(String name, int age) {//конструктор с 2 параметрами
            this.name = name;
            this.age = age;
        }
        public void aboutMe() {
            System.out.println("I'm "+ name +  "I'm + " + age);
        }
}
