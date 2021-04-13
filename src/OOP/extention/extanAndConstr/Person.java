package OOP.extention.extanAndConstr;

public class Person {//родительский класс
    private String firstName; //поля родителя
    private String lastName; //поля родителя
    private String middleName; //поля родителя

    public Person(String firstName, String lastName, String middleName) { //конструктор со всеми параметрами
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(String lastName, String middleName) { //конструктор со 2 параметрами
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(String firstName) { //конструктор со 1 параметром
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}

