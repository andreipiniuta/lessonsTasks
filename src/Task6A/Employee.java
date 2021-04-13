package Task6A;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private double salary;

    public Employee(String firstName, String position) {
        this.firstName = firstName;
        this.position = position;
    }

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName(){
        if (lastName == null) {
            return firstName;
        }else {
            return firstName + " " + lastName;
        }
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeInfo() {
        return getFullName() +" " + position + " " + salary;
    }
}
