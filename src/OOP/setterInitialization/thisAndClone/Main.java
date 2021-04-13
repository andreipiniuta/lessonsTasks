package OOP.setterInitialization.thisAndClone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person(); //создали объект p
        p.setName("Bob");//заполнили объект p
        p.setAge(18);//заполнили объект p
        p.aboutMe();//вызвали объект p
//возвращение самого себя   this
        Person copy = p.returnME();//возвращение самого себя
        copy.setName("Tom");//заполнили поля для copy
        copy.setAge(22);//заполнили поля для copy
        p.aboutMe(); // Bob 18 не выведет тк объект p отдался copy  и выведет его значения те Tom 22

//клонирование
        Person newP = new Person();//создал новый объект
        newP.setName("LEE");
        newP.setAge(78);
        Person cloneP = newP.cloneME();//клонировал объект
        newP.aboutMe();//вызвал новый
        cloneP.aboutMe();//вызвал клонированный
        cloneP.setAge(40);// заполнил клон новым данными
        cloneP.setName("zer");// заполнил клон новым данными
        newP.aboutMe();//вызвал новый
        cloneP.aboutMe();//вызвал клонированный



    }
}
