package Task6A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//команда на ввод с клавы
        Employee [] array = new Employee [5];//создание массива на 5 ячеек
        String input ="";//перемен ввод
        int countEmployees = 0;//перемен кот считает сколько ввели людей
        String positionDirector = "director"; //переменная
        do {//бесконечный цикл
            System.out.println("Press 1 - Add Employee with name");
            System.out.println("Press 2 - Add Employee with name and surname");
            System.out.println("Press 3 - Print All");
            System.out.println("Press 4 - Print director");
            System.out.println("Press 5 - Print All except director");
            System.out.println("Press 6 - Print employee with lowest salary");
            System.out.println("Press 7 - Print employee with the highest salary");
            input = sc.nextLine(); //перемен input равно тому что ввели с клавы
            switch (input) {//switch на 7 вариантов в зависимости что ввел пользователь
                case "1":
                    if (countEmployees == 5) {//проверка не ввели ли больше 5 людей(не больше количества ячеек в нашем array)
                        System.out.println("Can't add more employees");
                    } else {
                        System.out.println("Enter first name");
                        String firstName = sc.nextLine();//перемен firstName равна тому что ввел с клавы
                        System.out.println("Enter position");
                        String position = sc.nextLine();//то же
                        System.out.println("Enter salary");
                        String s = sc.nextLine();// тоже
                        double salary = Double.parseDouble(s);//перевод в дробное число

                        if (position.equals("director")) {//проверка не ввели ли позицию директор дважды
                            boolean directorDuplicate = false;//спец перемен для сработки continue в цикле do-while  а не в for
                            for (int search = 0; search < countEmployees; search++) {
                                if (array[search].getPosition().equals("director")) {// если в какой-либо ячейки будет объект со position director , то
                                    System.out.println("director DUBLICATE, try again");
                                    directorDuplicate = true;//то меняем спец перемен для сработки continue
                                    break;//выходим из цикла
                                }
                            }
                            if (directorDuplicate == true) {//срабатывание continue
                                continue;// уходит на do-while, на ввод данных заново (сработает continue)
                            }
                        }
                        array[countEmployees] = new Employee(firstName, position);//заполняем ячейку не цифрами(строками), а объектами класса Employee
                        array[countEmployees].setSalary(salary);//устанавливаем зарплату объекту, который в ячейке
                        countEmployees++;//увеличиваем на 1 перемен кот считает сколько ввели людей, т.к состоялся ввод человека
                    }
                break;

                case "2"://то же , что вариант 1 + фамилия
                    if (countEmployees == 5) {
                        System.out.println("Can't add more employees");
                    } else {
                        System.out.println("Enter first name");
                        String firstName = sc.nextLine();
                        System.out.println("Enter last name");
                        String lastName = sc.nextLine();
                        System.out.println("Enter position");
                        String position = sc.nextLine();
                        System.out.println("Enter salary");
                        String s = sc.nextLine();
                        double salary = Double.parseDouble(s);
                        if (position.equals("director")) {
                            boolean directorDublicat = false;
                            for (int search = 0; search < countEmployees; search++) {
                                if (array[search].getPosition().equals("director")) {
                                    System.out.println("director DUBLICATE, try again");
                                    directorDublicat = true;
                                    break;
                                }
                            }
                            if (directorDublicat == true) {
                                continue;
                            }
                        }

                        array[countEmployees] = new Employee(firstName, lastName, position);
                        array[countEmployees].setSalary(salary);
                        countEmployees++;
                    }
                break;

                case "3"://распечатка всех сотрудников
                    for (int i = 0; i < countEmployees; i++) {
                        System.out.println(array[i].getEmployeeInfo());//у объекта в каждой ячейке вызываем метод о себе
                    }
                break;

                case "4"://распечатка директора
                    for (int i = 0; i < countEmployees; i++) {
                        if (positionDirector.equals(array[i].getPosition())) {
                            System.out.println(array[i].getEmployeeInfo());
                        }
                    }
                break;

                case "5"://распечатка всех кроме директора
                    for (int i = 0; i < countEmployees; i++) {
                        if (!positionDirector.equals(array[i].getPosition())) {
                            System.out.println(array[i].getEmployeeInfo());
                        }
                    }
                break;

                case "6"://печатаем чела с мин зп
                    double minSalary = array[0].getSalary();//перемен мин зп равна зп у объекта в ячейке №0
                    for (int i = 0; i < countEmployees; i++) {
                        if (minSalary > array[i].getSalary()) {//поиск мин зп
                            minSalary = array[i].getSalary();//перезапись мин зп
                        }
                    }
                    for (int i = 0; i < countEmployees; i++) {
                        if (minSalary == array[i].getSalary()) {//поиск объекта в ячейках у которого зп равна нашей найденной мин зп
                            System.out.println(array[i].getEmployeeInfo());//печать чела которого нашли(у него мин зп)
                        }
                    }
                break;

                case "7"://печатаем чела с макс зп(принцип тот же что в варианте №6)
                    double maxSalary = array[0].getSalary();
                    for (int i = 0; i < countEmployees; i++) {
                        if (maxSalary < array[i].getSalary()) {
                            maxSalary = array[i].getSalary();
                        }
                    }
                    for (int i = 0; i < countEmployees; i++) {
                        if (maxSalary == array[i].getSalary()) {
                            System.out.println(array[i].getEmployeeInfo());
                        }
                    }
                break;
            }
        }
        while (!input.equals("q")); //усл выхода из бесконечного цикла
    }
}
