package InputOutput;

import java.io.File;
import java.io.IOException;

public class ClassFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/stormnet-tasks/storage/data.txt");//в перем f класса File присваиваем рельно существ. файл data.txt с указанием пути к нему
        String str = "D:/stormnet-tasks/storage/no-file.txt";
        File f2 = new File(str); // в перем f класса File присваиваем не существ. файл no-file.txt. второй способ указания пути к файлу через перемен

        //МЕТОДЫ
        System.out.println(f.exists());//существует или нет, true если существ
        f2.createNewFile();//создание файла
        System.out.println(f2.exists());//существует или нет true если существ
        f2.delete();// удаление файла
        System.out.println(f2.exists());//существует или нет true если существ
        System.out.println(f.length());//выдает размер файла в long!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!long
        System.out.println(f.isDirectory());// ты папка? true если это папка
        System.out.println(f.isFile());// ты файл?  true если это файл
        System.out.println(f.getName());// вернет имя файла
        System.out.println(f.getAbsolutePath());// выдает путь к файлу
        System.out.println(f.getCanonicalPath());//выдает путь к файлу как видит операй система
        System.out.println(f.canRead());// можно ли читать
        System.out.println(f.canExecute());//можно выполнить
        System.out.println(f.getParent());//вернет родительскую папку
        System.out.println(f.listFiles());// вернет list файлов которые лежат в папке



    }
}
