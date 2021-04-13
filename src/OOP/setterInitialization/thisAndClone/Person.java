package OOP.setterInitialization.thisAndClone;

public class Person implements Cloneable {
    private String name;
    private int age;

    public void setName(String name){//одинаковое имя параметра с именем поля
        this.name = name;// тогда используем this
    }
    public void setAge(int a){
        age = a;
    }
    public void aboutMe(){
        System.out.println(" I'm  " + name + " I'm " + age);
    }

    public Person returnME(){//возвращение самого себя
        return this;
    }
    public Person cloneME() throws CloneNotSupportedException {  //клонирование объекта
      Person newP = new Person();
        newP.setName(name);
        newP.setAge(age);
        return newP;
        ///return (Person) this.clone(); // спец метод по клонированию
    }


}
