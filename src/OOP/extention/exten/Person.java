package OOP.extention.exten;

public class Person {
    private String firstName; //поля которыми могут пользоваться наследники
    private String lastName; //поля которыми могут пользоваться наследники
    private String middleName; //поля которыми могут пользоваться наследники

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

