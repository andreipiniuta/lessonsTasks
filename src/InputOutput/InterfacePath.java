package InputOutput;

import java.nio.file.Path;
import java.nio.file.Paths;

public class InterfacePath {// содержит методы для работы с путем к файлу
    public static void main(String[] args) {
        String sourceFile = "D:/stormnet-tasks/storage/Java-logo.jpg";//создаем String перемн куда присваиваем путь к файлу который читаем
        //Paths- класс с одним методом get, нужен для создания объектов типа Path, в этом объекте хранятся пути  к файлу
        Path sourcePath = Paths.get(sourceFile);//создаем перемен sourcePath типа Path куда присваиваем путь к файлу который читаем
        System.out.println(sourcePath.getFileName());//выводит имя файла
        System.out.println(sourcePath.getParent());//выводит рoд папку
        System.out.println(sourcePath.getRoot());//выводит корневую папку
        System.out.println(sourcePath.isAbsolute());//возвр. true, если путь абсолютный
        System.out.println(sourcePath.normalize());//удаляет из пути ненужные элементы
        System.out.println(sourcePath.getFileSystem());
    }
}
