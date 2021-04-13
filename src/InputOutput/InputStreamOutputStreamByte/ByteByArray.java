package InputOutput.InputStreamOutputStreamByte;

import java.io.*;

public class ByteByArray {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("D:/stormnet-tasks/storage/Java-logo.jpg"); //создаем объект типа File откуда читаем
        FileInputStream inpst = new FileInputStream(sourceFile);//открываем поток ввода inpst из файла sourceFile
        int sourceSize = (int) sourceFile.length();// узнаем размер нашего файла для массива(т.к. .length() выдает long, то приводим к int)
        byte [] sourceArray = new byte [sourceSize];//создаем массив размером равным размеру нашего файла
        inpst.read(sourceArray);// перемен b присваиваем массив куда прочитали наши байта из файла
        inpst.close();// закрыли поток ввода

        File destFile = new File("D:/stormnet-tasks/Java-logoCopy.jpg");//создаем объект типа File куда будем записывать
        FileOutputStream outpst = new FileOutputStream(destFile);//открыли поток вывода outpst в файл destFile
        outpst.write(sourceArray);//записываем в поток вывода значение из массива
        outpst.close();//закрыли поток вывода
    }
}
