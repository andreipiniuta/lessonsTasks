package Task6C;
import java.util.Scanner;

public class Department {
    private String departmentName;
    private int departmentSize;
    private Employee director; //поле  director типа Employee
    private Employee[] staff; // массив типа  Employee
    private int countEmployees = 1; //счётчик начинаем с 1 т.к. в нулевею ячейку записываю объект director
    private double budget = 0;

    public Department(String departmentName, int departmentSize) {
        this.departmentName = departmentName;
        this.departmentSize = departmentSize;
        this.staff = new Employee[departmentSize]; // в конструктор в поле staff создал массив с размером departmentSize (размер указан в объекта department в Main )
    }

    public void AddEmployeeWithoutLastName(){// метод добавки работников без фамилии
        Scanner sc = new Scanner(System.in);
        if (countEmployees == departmentSize) {// проверка максим. числа сотрудников(счётчик дошел до размера массива
            System.out.println("Can't add more employees");
        } else {
            System.out.println("Enter first name");
            String firstName = sc.nextLine();// чтение в перемен firstName данных с клавы
            // чтение с клавы position, которая уже не простая перемен, а имеет тип Position и будет в enum-e
            Position position = null;// создание перемен position типа Position и присвоение значение null
            while (position == null){//бесконечн цикл для возможности исправления неправильно введённого названия position
            System.out.println("Enter position: director or programmer or qa");
            String p = sc.nextLine();// чтение в перемен р данных с клавы
                if (p.equals("director") || p.equals("programmer") || p.equals("qa")){//проверка на правильность введенного значения и если правильно ввели
                    position = Position.valueOf(p);//то перемен position присваиваем значение (через метод присвоения у enum) перемеп р
                } else {//если не правильно ввели, position останется null и цикл пойдет заново
                    System.out.println("Incorrect input. Try Again.");
                }
            }// чтение с клавы salary
            Double salary = 0.0;// создание перемен salary и присвоение значения 0
            while(true) {//бесконечн цикл для возможности исправления неправильно введённого значения дробного числа(ввели буквы)
                System.out.println("Enter salary");
                String s = sc.nextLine();// чтение в перемен s данных с клавы
                try {
                    salary = Double.parseDouble(s);//в перемен salary присваиваем значение s, переведен в дробь
                    break;// выход из бесконечн цикла
                } catch (Exception e) {//ловит исключение и цикл заново
                    System.out.println("repeat");
                }
            }

            if (position.name().equals("director")) {//если вводят позицию директор,то
                if( staff[0] == null) {//провеверяем ячейка№0 пустая
                    Employee director = new Employee(firstName, position);//если пустая создоём объект director и инициализирую параметрами введен из клавы(firstName, position)
                    director.setSalary(salary);//установка зп через setter
                    staff[0] = director;//запись в ячейку № 0 объекта director
                }else {//если ячейка № 0 не пустая то печать сообщения о повторе
                    System.out.println("director Dublicat. Try again");
                }
            } else {//если вводят позицию НЕ директор,то
                staff[countEmployees] = new Employee(firstName, position);//в ячейку начиная с №1 создаем объект массива и инициализирую параметрами введен из клавы(firstName, position)
                staff[countEmployees].setSalary(salary);//установка зп через setter
                countEmployees++;// увеличиваем счётчик на 1
            }
        }
    }
    public void AddEmployee() {// то же что в первом методе, но + 1 параметр фамилия
        Scanner sc = new Scanner(System.in);
        if (countEmployees == departmentSize) {
            System.out.println("Can't add more employees");
        } else {
            System.out.println("Enter first name");
            String firstName = sc.nextLine();
            System.out.println("Enter last name");
            String lastName = sc.nextLine();
            Position position = null;
            while (position == null){
                System.out.println("Enter position: director or programmer or qa");
                String p = sc.nextLine();
                if (p.equals("director") || p.equals("programmer") || p.equals("qa")) {
                    position = Position.valueOf(p);
                }else {
                    System.out.println("Incorrect input. Try Again.");
                }
            }
            double salary = 0.0;
            while(true) {
                System.out.println("Enter salary");
                String s = sc.nextLine();
                try {
                    salary = Double.parseDouble(s);
                    break;
                } catch (Exception e) {
                    System.out.println("repeat");
                }
            }

            if (position.name().equals("director")) {
                if (staff[0] == null) {
                    Employee director = new Employee(firstName, lastName, position);
                    director.setSalary(salary);
                    staff[0] = director;
                } else {
                    System.out.println("director Dublicat. Try again");
                }
            } else {
                staff[countEmployees] = new Employee(firstName, lastName, position);
                staff[countEmployees].setSalary(salary);
                countEmployees++;
            }
        }
    }


    public void printAllEmployees() {//вывод всех
        for (int i = 0; i < countEmployees; i++){
            System.out.println(staff[i].getEmployeeInfo());//в каждой ячейке хранится объект у него вызываем метод getEmployeeInfo()
        }
    }

    public void printDirector(){//печать объекта из ячейки №0(директора)
        System.out.println(staff [0].getEmployeeInfo());//в каждой ячейке хранится объект у него вызываем метод getEmployeeInfo()
    }
    public void printStaff(){// печает всех кроме директора т.е начинаем не с нулевой , а с первой(в нулевой хранится директор)
        for (int i = 1; i < countEmployees; i++){
            System.out.println(staff[i].getEmployeeInfo());
        }
    }

    public void printWithMinSalary(){//печатаем чела с мин зп
        double minSalary = staff[0].getSalary();//перемен мин зп равна зп у объекта в ячейке №0
        for (int i = 0; i < countEmployees; i++) {
            if (minSalary > staff[i].getSalary()) {//поиск мин зп
                minSalary = staff[i].getSalary();//перезапись мин зп
            }
        }
        for (int i = 0; i < countEmployees; i++) {
            if (minSalary == staff[i].getSalary()) {//поиск объекта в ячейках у которого зп равна нашей найденной мин зп
                System.out.println(staff[i].getEmployeeInfo());//печать чела которого нашли(у него мин зп)
            }
        }
    }
    public void printWithMaxSalary(){//печатаем чела с макс зп(принцип тот же что в варианте №6)
        double maxSalary = staff[0].getSalary();
        for (int i = 0; i < countEmployees; i++) {
            if (maxSalary < staff[i].getSalary()) {
                maxSalary = staff[i].getSalary();
            }
        }
        for (int i = 0; i < countEmployees; i++) {
            if (maxSalary == staff[i].getSalary()) {
                System.out.println(staff[i].getEmployeeInfo());
            }
        }
    }

    public void NumberOfMounth(){//метод расчета на сколькл сватит бюджета
        Scanner str = new Scanner(System.in);
        while(true){//бесконечн цикл для возможности исправления неправильно введённого значения дробного числа(ввели буквы)
            System.out.println("Enter budget");
            String b = str.nextLine();// чтение в перемен b данных с клавы
            try {
                budget = Double.parseDouble(b);//в перемен budget присваиваем значение b, переведен в дробь
                break;//выход из бесконечн цикла
            }
            catch (Exception e){
                System.out.println("repeat");
            }
        }
        double allTotalSalary = 0;
        for (int i = 0; i < countEmployees; i++) {
            allTotalSalary = allTotalSalary + staff[i].getPosition().calculateTotalSalary(staff[i]);//расчет общей зп всех сотрудников с бонусами
        }
        System.out.println("Number of mounth is " + budget / allTotalSalary);
    }
}
