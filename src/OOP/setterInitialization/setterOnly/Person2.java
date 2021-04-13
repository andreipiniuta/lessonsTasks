package OOP.setterInitialization.setterOnly;

import javax.sound.midi.Soundbank;

//обычно так делают с setterom
public class Person2 {
    private String lastName;
    private int salary;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void printConsole(){
        System.out.println(lastName + salary);
    }
}
