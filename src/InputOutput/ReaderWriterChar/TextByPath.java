package InputOutput.ReaderWriterChar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextByPath {
    public static void main(String[] args) throws IOException {
        //АЛГОРИТМ БЫСТРОГО ЧТЕНИЯ СИМВОЛОВ (ТЕКСТА) ИЗ ФАЙЛА И БЫСТРОЙ ЗАПИСИ БАЙТОВ В ФАЙЛ
        //Paths- класс с одним методом get, нужен для создания объектов типа Path, в этом объекте хранятся пути  к файлу
        Path sourse = Paths.get("D:/stormnet-tasks/storage/ReadText.txt");//создаем перемен source типа Path куда через Paths.get присваиваем путь к файлу который читаем
        List<String> list = Files.readAllLines(sourse);// читаев в list текст из нашего файла с пом. Files.readAllLines(путь указан перемен sourcePath типа Path)

        Path dest = Paths.get("D:/stormnet-tasks/storage/WriteText.txt");//создаем перемен dest типа Path куда через Paths.get присваиваем путь к файлу в который пишем
        Files.write(dest, list);////записываем текст из list с пом. метода Files.write
        //параметры метода 1.КУДА ПИСАТЬ--- путь указан в перемен dest типа Path, 2.ЧТО ПИСАТЬ---текст из нашего list
        //Files.copy(source,dest);// метод копирования ТЕКСТА(откуда перемен source типа Path, куда перемен dest типа Path)
    }
}
