package InputOutput.PrintSteamOutputToFile.outputIn1File;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream --- поток вывода
        PrintStream fileout = new PrintStream("D:/stormnet-tasks/storage/data.txt");//создание объекта fileout типа PrintStream с путем для вывода(в скобках)
        //Меняем вывод в консоль(стоит по умолчанию) на вывод в файл
        System.setOut(fileout);//у объекта System вызываем метод setOut, в параметр указываем объект типа PrintStream (fileout, где задан путь для вывода)----- выводим инфу в заданный файл
        System.out.println("Hello World!!! new check");//вывод из Main
        Person p = new Person();
        p.aboutMe();//вывод из Person
        Client c = new Client();
        c.aboutMe();//вывод из Client
    }
}
