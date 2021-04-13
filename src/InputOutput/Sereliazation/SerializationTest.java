package InputOutput.Sereliazation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest {
//ПЕРЕД ЗАПУСКОМ УДАЛИТЬ ФАЙЛ "D:/stormnet-tasks/storage/Global-formats-files-example/clients.bytes"
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client1 = new Client("Ivan", "Ivanov", 12.5, 5478); //создал объект
        Client client2 = new Client("Tom", "Smith", 2.5, 9634);//создал объект
        //Serialization из объектов Client делаем массив байтов с сохранением в файл
        FileOutputStream writer = new FileOutputStream("D:/stormnet-tasks/storage/Global-formats-files-example/clients.bytes",true);//создал объект  потока вывода writer с путём и true для возможности дозаписи
        BufferedOutputStream outbuffer = new BufferedOutputStream(writer);// запоковали его в BufferedOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(outbuffer);// создал объект потока вывода oos для сохранения объектов Client в массив байтов c записью в файл (в параметр передаем объект потока вывода)
        oos.writeObject(client1);//записывает в файл объект client1 в виде массив байтов
        oos.writeObject(client2);//записывает в файл объект client2 в виде массив байтов
        oos.close();//закрываем поток вывода

    //Deserialization из массив байтов прочатанные  из файла делаем  объекты Client
        FileInputStream reader = new FileInputStream("D:/stormnet-tasks/storage/Global-formats-files-example/clients.bytes");//создал объект  потока ввода reader с путём
        BufferedInputStream inbuffer = new BufferedInputStream(reader); // запоковали его в BufferedInputStream
        ObjectInputStream ois = new ObjectInputStream(inbuffer);// создал объект потока ввода ois для чтения массив байтов из файла и перевод его в объекты типа Client (в параметр передаем объект потока ввода)
        List<Client> allClients = new ArrayList<>();// создал ArrayList

        for (;;){// бесконечн for
            Object object = null;
            try{
                object = ois.readObject();//в перем типа Object(т.к. не знаем какой тип) читаем объекты, при окончании файла вернёт null
            }catch (EOFException e ){
                break;
            }
            if (object == null){
                break;
            }
            Client client = (Client) object;// в объект client типа Сlient присваиваем то что прочитали с приведением типа Сlient
            allClients.add(client);//наши подученные объекты складываем в ArrayList allClients
        }
        for (Client c:allClients) {// вывод объектов из ArrayList allClients через foreach
            System.out.println(c);
        }
    }
}
