package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties props =new Properties();//создал пустой объект props типа Properties
        FileReader reader = new FileReader("D:/stormnet-tasks/storage/Global-formats-files-example/setting.properties");//создал объект потока ввода reader типа FileReader(поток ввода)
        props.load(reader);// заполнил наш объект props с пом метода load данными из файла(в параметр подал объект потока ввода текста--reaader)
        reader.close();//закрыли поток ввода
        System.out.println(props);// вывод нашего уже заполненного объекта props
        String prname = props.getProperty("program_name");// читаем данные из объекта props с пом метода getProperty(в парам подаю ключ "program_name")
        String jdk = props.getProperty("jdk_version");
        String db = props.getProperty("db_dir");
        System.out.println(prname);//вывод значений ключей объекта props
        System.out.println(jdk);
        System.out.println(db);
        props.setProperty("db_dir", "D:/stormnet-tasks/storage");//изменение значения ключа db_dir
        props.setProperty("MaxSize", "1024");// добавление нового имени свойств(ключа) и его значения
        FileWriter writer = new FileWriter("D:/stormnet-tasks/storage/Global-formats-files-example/settingUpdate.properties");//создал объект потока вывода writer типа FileWriter(поток вsвода)
        props.store(writer,"Update for testing system");//сохраняем данные объекта props в файл settingUpdate.properties
        writer.close();// закрыл поток вывода

    }
}
