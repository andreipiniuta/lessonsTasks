package parsers.json;

import parsers.data.Address;
import parsers.data.Client;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonArrayReader {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("D:/stormnet-tasks/clientsForJSON.json");//создали текстовый поток ввода(передали путь к файлу)
        JSONTokener tokener = new JSONTokener(reader);//создали объект tokener типа JSONTokener
//tokener с пом метода nextValue() читает весь json-файл и отдает либо json-объект типа Object (если в файле 1 объект) либо json-array типа Object(если в файле несколько объектов), нодо смотреть сам json-файл
//т.к. nextValue() возвращает тип Object, полученный clientsArray приводим к типу JSONArray (к типу JSONObject если вернет объект)
        JSONArray clientsArray = (JSONArray) tokener.nextValue();//т.к у нас в файле несколько объетов получаем json-array-- clientsArray с приведением к типу JSONArray

        int arrayLength = clientsArray.length();//узнаем у него длину

        List<Client> allClients = new ArrayList<>();//создили пустой список куда будем складывать объекты

        for (int i = 0; i < arrayLength; i++) {// в цикле по очереди будем доставать объекты и наполнять их

            JSONObject clientObject = clientsArray.getJSONObject(i);// у полученного  clientsArray получаем i-ый json-объект clientObject типа JSONObject метод getJSONObject(i)
            String language = clientObject.getString("language");// у i-ого  json-объекта clientObject достаем первый ключ language и его значение, метод getString
            String profession = clientObject.getString("profession");//  метод getString если значение строка
            String firstName = clientObject.getString("first-name");
            String lastName = clientObject.getString("last-name");
            Double percent = clientObject.getDouble("percent");//метод getDouble если значение дробное число
            Double cashBack = clientObject.getDouble("cash-back");
            Integer pinCode = clientObject.getInt("pin-code");//метод getInt если значение целое число

            Client client = new Client();// создаем новый i-ый client
            client.setLanguage(language);//заполняем этот i-ый client значением ключей
            client.setProfession(profession);
            client.setFirstName(firstName);
            client.setLastName(lastName);
            client.setPercent(percent);
            client.setCashBack(cashBack);
            client.setPinCode(pinCode);

            if (clientObject.has("address-list")) {//проверели есть ли ключ "address-list"
                //т.к значение ключа address-list---массив
                JSONArray addressArray = clientObject.getJSONArray("address-list");//у i-ого  json-объекта clientObject достаем json-array addressArray
                int addressLength = clientsArray.length();

                for (int j = 0; j < addressLength; j++) {
                    JSONObject addressObject = addressArray.getJSONObject(j);//у полученного json-array addressArray достаем уже его json-объекты addressObject

                    String country = addressObject.getString("country");//у j-ого  json-объекта addressObject достаем первый ключ country и его значение
                    Boolean isRegistration = false;

                    if (addressObject.has("isRegistrationAddress")) {
                        isRegistration = addressObject.getBoolean("isRegistrationAddress");
                    }

                    String street = addressObject.getString("street");
                    Integer house = addressObject.getInt("house-no");

                    Address address = new Address();// создаем новый i-ый address
                    address.setCountry(country);//заполняем этот i-ый address значением ключей
                    address.setRegistrationAddress(isRegistration);
                    address.setStreet(street);
                    address.setHouseNo(house);

                    client.addAddress(address);//в client добавляем значение поля(которое уже заполнен композиция address)
                }
            } else {
                System.out.println("Client: " + client.getFirstName() + " IS BOMZ");
            }

            allClients.add(client);
        }

        for (Client c : allClients) {
            System.out.println(c);
        }
    }
}
