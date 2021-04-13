package InputOutput.PrintSteamOutputToFile.outputInManyFiles;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MultipleOut out = new MultipleOut();//создаем объект out с типом MultipleOut
        out.addNewOut("D:/stormnet-tasks/storage/data.txt");//у объекта вызвали метод для файла
        out.printToAllOuts("Hello");//у объекта вызвали метод для печати всего в консоль
        out.addNewOut("D:/stormnet-tasks/storage/info.txt");//у объекта вызвали метод для второго файла
        Person p = new Person();
        p.aboutMe(out);//вызов метода у Person
        Client c = new Client();
        c.aboutMe(out);//вызов метода у Client

    }
}
