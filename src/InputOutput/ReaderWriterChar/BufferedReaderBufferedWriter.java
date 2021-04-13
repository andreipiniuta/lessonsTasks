package InputOutput.ReaderWriterChar;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderBufferedWriter {
    public static void main(String[] args) throws IOException {
       File sourceFile = new File("D:/stormnet-tasks/storage/ReadText.txt");//создаем объект типа File откуда читаем
        BufferedReader reader = new BufferedReader(new FileReader(sourceFile));//открываем поток ввода и  создаем объект потока ввода типа BufferedReader(он дикораторFileReaderа)

        while(true) {
            String line = reader.readLine();// в перемен line присваиваем те символы, что прочитали в строку у объекта reader
            if (line == null){// если у метод readLine() возвращает null, заканчиваем чтение
                break;
            }
            System.out.println(line);//вывод перемен line, там лежит то, что прочли в файле
        }
        reader.close();// закрываем поток


        File destFile = new File("D:/stormnet-tasks/storage/WriteText.txt");//создаем объект типа File куда пишем
        BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));//открываем поток ввода и  создаем объект потока вывода типа BufferedWriter(он дикораторFileWriterа)
        writer.write("Hello!!!!!");// у объекта вызываем метод записи строки в файл и передаем её в параметр
        writer.newLine();//перевод на следующую строку
        writer.write("New");// то же
        writer.close();// закрываем поток

//запись в файл, в котором уже есть данные
        //при создании объекта во второй параметр FileWriter передать true---- не будет удалять предидущие данные
        // в первом параметре либо перемен с путем либо сам путь
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("D:/stormnet-tasks/storage/ReadText.txt",true));//открываем поток ввода и  создаем объект типа BufferedWriter
        //при
        writer2.write("\nAdding new info without delete previous words in the file ReadText");
        writer2.close();// закрываем поток
    }
}
