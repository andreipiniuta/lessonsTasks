package InputOutput.InputStreamOutputStreamByte;

import java.io.*;

public class ByteByByte {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("D:/stormnet-tasks/storage/Java-logo.jpg"); //создаем объект типа File откуда читаем
        FileInputStream inpst = new FileInputStream(sourceFile);//открываем поток ввода inpst из файла sourceFile
        int sourceSize = (int) sourceFile.length();// узнаем размер нашего файла для массива(т.к. .length() выдает long, то приводим к int)
        byte [] sourceArray = new byte [sourceSize];//создаем массив размером равным размеру нашего файла

        int i = 0;
        for (;;){// бесконечн цикл
            int b = inpst.read(); //т.к метод возвращает int, то перем b должна быть типа INT, в b читаем 1 байт из потока inpst
            if ( b == -1){// если -1 то выход из цикла
                break;
            }
            sourceArray [i] = (byte) b;// в массив складываем наши прочитанные байты из файла, которые хранятся в b (b приводим к типу byte т.к. массив типа byte)
            i++;
        }
        inpst.close();//закрыли поток ввода inpst

        File destFile = new File("D:/stormnet-tasks/Java-logoCopy.jpg");//создаем объект типа File куда будем записывать
        FileOutputStream outpst = new FileOutputStream(destFile);//открыли поток вывода outpst в файл destFile
        for (int j = 0; j < sourceArray.length; j++){//гоним до размера массива
            byte b = sourceArray[j];//записываем в b значение каждой ячейки
             outpst.write(b);//записываем в поток вывода значение b
        }
        outpst.close();
    }
}
