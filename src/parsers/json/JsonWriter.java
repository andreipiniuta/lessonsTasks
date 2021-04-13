package parsers.json;

import parsers.data.Address;
import parsers.data.Client;
import org.json.JSONWriter;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {

    public static void main(String[] args) throws IOException {
//создаем объекты наших классов Address и client(на основе их будет записан xml), устанавливаем значения через setter,
// Address композиция для client
        Address address1 = new Address();
        address1.setCountry("Russia");
        address1.setStreet("Lermontova");
        address1.setHouseNo(48);

        Address address2 = new Address();
        address2.setCountry("Russia");
        address2.setStreet("Pushkina");
        address2.setHouseNo(12);
        address2.setRegistrationAddress(true);

        Address address3 = new Address();
        address3.setCountry("Russia");
        address3.setStreet("Bulgakova");
        address3.setHouseNo(48);

        Client client = new Client();
        client.setLanguage("ru");
        client.setProfession("Engineering");
        client.setFirstName("Ivan");
        client.setLastName("Ivanov");
        client.setPercent(12.25);
        client.setCashBack(1.5);
        client.setPinCode(1234);

        client.addAddress(address1);
        client.addAddress(address2);
        client.addAddress(address3);

        FileWriter writer = new FileWriter("D:/stormnet-tasks/clients-from-java-byJSON20190722.json");//создали поток вывода с путем куда пишем файл
        JSONWriter jsonWriter = new JSONWriter(writer);//создали объект jsonWriter типа JSONWriter, завурнув в него поток ввода
//jsonWriter умеет составлять json файл
        jsonWriter.array();//создали json-массив в json файл

        jsonWriter.object();//создали json-объект(client)(если объектов несколько создаем их в цикле for или foreach + создать этот объект и достать его из массива
        jsonWriter.key("language").value(client.getLanguage());//создаем пару ключ(имя ключа) и значение ключа(значение берём у объекта client с пом setter)
        jsonWriter.key("profession").value(client.getProfession());
        jsonWriter.key("first-name").value(client.getFirstName());
        jsonWriter.key("last-name").value(client.getLastName());
        jsonWriter.key("percent").value(client.getPercent());
        jsonWriter.key("cash-back").value(client.getCashBack());
        jsonWriter.key("pin-code").value(client.getPinCode());

        jsonWriter.key("address-list").array();//создаем пару, где значение ключа--массив
//если в массиве несколько объектов нужно в цикле for или foreach создать этот тип объекта и достать из массива
        for (Address address : client.getAddressList()) {//см с 49 строки
            jsonWriter.object();

            jsonWriter.key("country").value(address.getCountry());
            jsonWriter.key("isRegistrationAddress").value(address.isRegistrationAddress());
            jsonWriter.key("street").value(address.getStreet());
            jsonWriter.key("house-no").value(address.getHouseNo());

            jsonWriter.endObject();//показываем конец json-объекта(address) т.к заполнили все ключи у json-объекта, котор лежат в массиве(address-list),котор есть значение ключа
        }

        jsonWriter.endArray();//показываем конец json-массива(address-list), котор есть значение ключа
        jsonWriter.endObject();//показываем конец json-объекта(client)

        jsonWriter.endArray();//показываем конец json-массива json файлf

        writer.close();//закрыли поток вывода
    }
}
