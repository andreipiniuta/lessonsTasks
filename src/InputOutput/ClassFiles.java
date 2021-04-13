package InputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassFiles {//утилитный класс с статическими методами, у класса нет объекта, методы просто выполняют работу как класс Math
    public static void main(String[] args) throws IOException {
//перед запуском удалить созданную ранее папку "D:/stormnet-tasks/storage/forCopy"
        Path path = Paths.get("D:/stormnet-tasks/storage/Java-logo.jpg");
        System.out.println(Files.exists(path)); //существует ли файл
        Files.createDirectory(Paths.get("D:/stormnet-tasks/storage/forCopy"));// создает папку
        Files.createFile(Paths.get("D:/stormnet-tasks/storage/forCopy/Java-logo.jpg"));//создает файл
        Files.delete(Paths.get("D:/stormnet-tasks/storage/forCopy/Java-logo.jpg"));//удаляет файл
        System.out.println(Files.exists(Paths.get("D:/stormnet-tasks/storage/forCopy/Java-logoCopy.jpg")));//существует ли файл
//методы работы с данными файла (readAllLines, write, copy --- в ByteByPath и readAllLines, write в TextByPath)
    }

}
