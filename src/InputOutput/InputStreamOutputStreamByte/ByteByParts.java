package InputOutput.InputStreamOutputStreamByte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteByParts {//чтение кусками
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("D:/stormnet-tasks/storage/Java-logo.jpg"); //создаем объект типа File откуда читаем
        FileInputStream inpst = new FileInputStream(sourceFile);//открываем поток ввода inpst из файла sourceFile
        int sourceSize = (int) sourceFile.length();// узнаем размер нашего файла для массива(т.к. .length() выдает long, то приводим к int)
        byte [] sourceArray = new byte [sourceSize];//создаем массив размером равным размеру нашего файла  (93513ячеек)
        byte [] buffer = new byte [20000];//создание промежуточного массива для чтения на 20000 ячеек в него будем читать кусками
        int totalRead = 0;//перемен сколько всего прочитали ячеек нужна для указания при копировании массивов с какой ячейки пишем в большой массив sourceArray
        for(;;){//в realRead присваиваем байты прочитанные куском по 20000шт
            int realRead = inpst.read(buffer, 0, 20000); //параметры read №3 (массив куда читаем кусок, с какой ячейки записываем в промежут массив, сколько байтов надо прочитать)
            if (realRead == -1){
                break;
            }
            System.arraycopy(buffer,0,sourceArray, totalRead, realRead); //метод копирования массивов
//параметры метода 1.из какого массива копируем 2.с какой ячейки копируем 3.в какой массив пишем 4.с какой ячейки пишем в новый 4.сколько ячеек записываем
            totalRead = totalRead + realRead;
        }
        inpst.close();// закрыли поток ввода

        File destFile = new File("D:/stormnet-tasks/Java-logoCopy.jpg");//создаем объект типа File куда будем записывать
        FileOutputStream outpst = new FileOutputStream(destFile);//открыли поток вывода outpst в файл destFile
        outpst.write(sourceArray);//записываем в поток вывода значение из массива
        outpst.close();//закрыли поток вывода
    }
}

