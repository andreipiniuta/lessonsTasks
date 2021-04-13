package InputStreamReaderOutputStreamWriter;

import org.json.JSONObject;
import org.json.JSONTokener;


import java.io.*;

//читаем текстовый файл (json) изнутри JVM(то, что лежить ниже папки src)
//читаем изнутри чтобы симитировать чтение байтов из сети
//на выходе getResourceAsStream дает поток ввода байтов изнутри JVM
public class InputStreamReaderOutputStreamWriter {
    public static void main(String[] args) throws IOException {
        Thread th = Thread.currentThread();//узнаем поток, который выполняется в данный момент
        ClassLoader cl = th.getContextClassLoader();//загрузка классов в JVM( в MetaSpace)
        InputStream resourceStream = cl.getResourceAsStream("zzzdataInsideJVM/clientForInputStreamReader.json");//создаем поток ввода изнутри JVM
        //на входе getResourceAsStream принимает строку---путь относительный начиная с папку src(src не включаем в путь)
        //на выходе getResourceAsStream дает поток ввода байтов изнутри JVM (можно читать байты изнутри JVM)
        InputStreamReader isr = new InputStreamReader(resourceStream);//чтобы получить символы создаем поток InputStreamReader,  т.к получаем байты(выходе getResourceAsStream дает поток ввода байтов, а нам нужны строки(json)
        BufferedReader reader = new BufferedReader(isr);//заварачиваем в наш поток ввода isr в BufferedInputStream, чтобы байты прочитать
        //reader либо читаем либо отправляем в tokener

        //Вариант 1
        //while(true){//(см тему про BufferedReader)
                //String line = reader.readLine();//метод BufferedReader readLine()
                //if(line == null){
                //    break;
                //}
            //System.out.println(line); //в переменной line храниться json в текстовом виде
        //}

        //Вариант 2
//составляем объект client на основании json-файла
        JSONTokener tokener = new JSONTokener(reader);// у текстового потока ввода получаем JSONTokener tokener
                                                    //для составления объекта client на основании json-файла
        JSONObject clientObject = (JSONObject) tokener.nextValue();
        String language = clientObject.getString("language");
        String profession = clientObject.getString("profession");
        String firstName = clientObject.getString("firstName");
        String lastName = clientObject.getString("lastName");
        Double percent = clientObject.getDouble("percent");
        Double cashBack = clientObject.getDouble("cashBack");
        Integer pinCode = clientObject.getInt("pinCode");

        ClientForISR client = new ClientForISR();
        client.setLanguage(language);
        client.setProfession(profession);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setPercent(percent);
        client.setCashBack(cashBack);
        client.setPinCode(pinCode);

        System.out.println(client);
    }
}
