package Task6C;

public class Employee {
    private String firstName;
    private String lastName;
    private Position position;
    private double salary;

    public Employee(String firstName, Position position) {
        this.firstName = firstName;
        this.position = position;
    }

    public Employee(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setPosition(Position position) {
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

    public Position getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeInfo() {
        return getFullName() +" " + position + " " + salary;
    }
}
