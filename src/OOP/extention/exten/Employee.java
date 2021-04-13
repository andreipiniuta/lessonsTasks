package OOP.extention.exten;

public class Employee extends Person {//Employee наследуется от Person
    private double salary; //поле наследника

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void aboutMe(){
        System.out.println("Employee is " + getFirstName() + " " + getLastName() + " " + getMiddleName() + " " + salary);
    }
}
