package Task6B;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input ="";
        Department department = new Department("Bank",5);//создал объект department
        do {//бесконечн цикл
            System.out.println("Press 1 - Add Employee with name");
            System.out.println("Press 2 - Add Employee with name and surname");
            System.out.println("Press 3 - Print All");
            System.out.println("Press 4 - Print director");
            System.out.println("Press 5 - Print All except director");
            System.out.println("Press 6 - Print employee with lowest salary");
            System.out.println("Press 7 - Print employee with the highest salary");
            input = sc.nextLine(); //перемен input равно тому что ввели с клавы
            switch (input) {
                case "1":
                    department.AddEmployeeWithoutLastName();//вместо действия метод из класса Department
                    break;
                case "2":
                    department.AddEmployee();// то же
                    break;
                case "3":
                    department.printAllEmployees();// то же
                    break;
                case "4":
                    department.printDirector();// то же
                    break;
                case "5":
                    department.printStaff();// то же
                    break;
                case "6":
                    department.printWithMinSalary();// то же
                    break;
                case "7":
                    department.printWithMaxSalary();// то же
                    break;
            }
        } while (!input.equals("q"));// выход из цикла
    }
}
