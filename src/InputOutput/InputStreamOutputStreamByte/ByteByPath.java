package InputOutput.InputStreamOutputStreamByte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteByPath {
    public static void main(String[] args) throws IOException {
        //АЛГОРИТМ БЫСТРОГО ЧТЕНИЯ БАЙТОВ ИЗ ФАЙЛА И БЫСТРОЙ ЗАПИСИ БАЙТОВ В ФАЙЛ
        String sourceFile = "D:/stormnet-tasks/storage/Java-logo.jpg"; //создаем String перемн куда присваиваем путь к файлу который читаем
        String destFile = "D:/stormnet-tasks/Java-logoCopy.jpg";//создаем String перемн куда присваиваем путь к файлу куда записываем

        //Paths- класс с одним методом get, нужен для создания объектов типа Path, в этом объекте хранятся пути  к файлу

        Path sourcePath = Paths.get(sourceFile);//создаем перемен sourcePath типа Path куда присваиваем путь к файлу который читаем
        Path destPath = Paths.get(destFile);//создаем перемен destPath типа Path куда присваиваем путь к файлу куда записываем

        byte [] allBytes = Files.readAllBytes(sourcePath);//в массив читаем байты с пом. метода readAllBytes, путь указан перемен sourcePath типа Path

        Files.write(destPath, allBytes);//записываем байты с пом. метода write,
        //параметры метода 1.КУДА ПИСАТЬ--- путь указан в перемен destPath типа Path, 2.ЧТО ПИСАТЬ---байты из нашего массива allBytes

        //Files.copy(sourcePath,destPath);// метод копирования байтов(откуда перемен sourcePath типа Path, куда перемен destPath типа Path)


    }
}
