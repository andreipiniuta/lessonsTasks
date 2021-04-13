package DataFromJVM;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
//читаем байтовый файл (картинка) изнутри JVM(то, что лежить ниже папки src)
public class DataFromJVM {
    public static void main(String[] args) throws IOException {
        Thread th = Thread.currentThread();//узнаем поток, который выполняется в данный момент
        ClassLoader cl = th.getContextClassLoader();//загрузка классов в JVM( в MetaSpace)
        InputStream resourceStream = cl.getResourceAsStream("zzzdataInsideJVM/Java-logoCopy.jpg");//создаем потов ввода байтов изнутри JVM
        //на входе getResourceAsStream принимает строку---путь относительный начиная с папку src(src не включаем в путь)
        //на выходе getResourceAsStream дает поток ввода байтов изнутри JVM (можно читать байты изнутри JVM)
        BufferedInputStream is = new BufferedInputStream(resourceStream);//заварачиваем в наш поток ввода в BufferedInputStream, чтобы читать байты
        byte [] b = new byte [1024];// создали массив для байтов, которые прочитаем
        is.read(b);//читаем байты
        System.out.println(Arrays.toString(b));
    }

}
