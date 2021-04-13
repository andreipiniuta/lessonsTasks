package parsers.xml.sax;

import parsers.data.Address;
import parsers.data.Client;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;
//парсер будет читать построчно, поэтому нужен
//спец класс который будет отлавливать и обрабатывать события(Tagи)
// вызываем 5 методов перекрытием startDocument endDocument startElement endElement characters
public class ClientSaxHandler extends DefaultHandler {//обязательно наследуем DefaultHandler
//поля нужны чтобы связать данные Тэга(значения полей), полученные методом characters, с java объектами(clients) и названием полей наших объектов из xml файла
    //также поля нужны чтобы наши объекты были видны вне методов startElement endElement characters

    private List<Client> allClients; //объявлям список, куда складываем наши java объекты(clients)

    private Client currentClient;//текущий объект client , в котор пакуются его данные(language...pinCode), который после заполнение всеми значениями полей кладется в список allClients

    private Address currentAddress;//текущий объект Address , в котор пакуются его(Address) данные(street и house-no), который после заполнение всеми значениями полей кладется в текущий объект client

    private String pcDataTag = "";// спец перемен куда будет заносится значение только что прочитанного тэга, в котором хранятся конкретные(language...pinCode, street и house-no) значения объектов

    public List<Client> getAllClients() {//делаем getter для списка allClients(там лежат прочитанные объекты client)
        return allClients;//что ими можно было пользоваться в Main
    }

    @Override
    public void startDocument() throws SAXException {// метод для начала файла
        System.out.println("Parsing started!");
    }

    @Override
    public void endDocument() throws SAXException {// метод для конца файла
        System.out.println("Parsing finished!");
    }

    @Override//метод для начала каждого Тэга
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //в параметр передаем имя Тэга, котор начался(String qName)
        if ("clients-db".equals(qName)) {//если имя Тэга, котор пришло равно корневому имени Тэг (т.е.начался Тэг clients-db)--т.е. начался xml файл
            allClients = new ArrayList<>();// создаём new ArrayList, чтобы туда класть наши объекты(clients)
            return;
        }

        if ("client".equals(qName)) {//если имя Тэга, котор пришло равно имени Тэг client (т.е.начался Тэг client)--т.е. начался новый объект client
            currentClient = new Client();// создаем новый пустой текущий объект(client)

//далее заполняем текущий клиент его внутренними значениями, которые хранятся в других тэгах и атрибутах(напр. language profession first-name last-name percent cash-back и т.д.
            String languageAttr = attributes.getValue("language");//в перемен получаем значение атрибута language
            String professionAttr = attributes.getValue("profession");//в перемен получаем значение атрибута language

            currentClient.setLanguage(languageAttr);//наполнение текущего объекта currentClient значением атрибутов
            currentClient.setProfession(professionAttr);//наполнение текущего объекта currentClient значением атрибутов
            return;
        }

        if ("first-name".equals(qName) ||//если придет тэг first-name или т.д. или pin-code
            "last-name".equals(qName) ||
            "percent".equals(qName) ||
            "cash-back".equals(qName) ||
            "pin-code".equals(qName)) {
            pcDataTag = qName;//в pcDataTag(спец перемен) добавляем имя тэга, котор пришло
            return;
        }
//с элементами у списка адрес по аналогии как с элементами client
        if ("address".equals(qName)) {//если имя Тэга, котор пришло равно имени Тэг address (т.е.начался Тэг address)--т.е. начался элемент из списка address
            currentAddress = new Address();// создаем новый пустой текущий объект(address)

            String countryAttr = attributes.getValue("country");//в перемен получаем значение атрибута country
            currentAddress.setCountry(countryAttr);//наполнение текущий объекта currentAddress значением атрибутов

            String registerAttrStr = attributes.getValue("isRegistrationAddress");//в перемен получаем значение атрибута isRegistrationAddress
            boolean registerAttr = Boolean.valueOf(registerAttrStr);//узнаем значение у isRegistrationAddress

            currentAddress.setRegistrationAddress(registerAttr);//наполнение текущий объекта currentAddress значением атрибута
            return;
        }

        if ("street".equals(qName) || "house-no".equals(qName)) {//если придет тэг street или т.д. или house-no
            pcDataTag = qName;//в pcDataTag(спец перемен) добавляем имя тэга, котор пришло
            return;
        }
    }

    @Override//метод для окончания каждого Тэга
    public void endElement(String uri, String localName, String qName) throws SAXException { //в параметр передаем имя Тэга, котор закончился(String qName)
        if ("client".equals(qName)) {//если отработал endElement на названии client(парсер прошел весь тэг Client), то текущий клиент currentClient наполнился и его можно добавить в список
            allClients.add(currentClient);//добавляем в список allClients уже наполненный данными текущий клиент (currentClient)
            return;
        }
// обнуление значения спец перемен тэг(напр. language profession first-name last-name percent cash-back ит.д.), где хранятся значения закончился
        if ("first-name".equals(qName) ||//если отработал endElement и придет тэг first-name или т.д. или pin-code
            "last-name".equals(qName) ||//(парсер прошел весь тэг first-name или т.д. или pin-code)
            "percent".equals(qName) ||
            "cash-back".equals(qName) ||
            "pin-code".equals(qName)) {

            pcDataTag = null; //обнуляем значение спец перемен
            return;
        }
// заполнение текущего клиента значением из адреса
        if ("address".equals(qName)) {//если отработал endElement и придет тэг address(парсер прошел весь тэг address), то текущий объект currentAddress наполнился и его можно добавить текущий объект currentClient
            currentClient.addAddress(currentAddress);//наполняем текущего объекта currentClient значением текущего объекта address
            return;
        }
 //обнуление значения спец перемен тэг street или house-no
        if ("street".equals(qName) || "house-no".equals(qName)) {//если отработал endElement и придет тэг street или house-no
            pcDataTag = null;//обнуляем значение спец перемен
            return;
        }
    }

    @Override//вызывается всегда, когда парсер находит не начало или окончание файла(Тэг clients-db) или начало или окончани объекта(Тэг client),
    //или начало или окончани поля(Тэг language profession first-name last-name percent cash-back ит.д.),
    //а  находит именно данные Тэга(значения полей)
    public void characters(char[] ch, int start, int length) throws SAXException {
        //в парам 1.массив ch всего xml  по симвально, 2.номер ячейке где начинается нужный элемент и 3.длину(кол-во ячеек) элемента
        String data = new String(ch, start, length);//создаем конструктор строки, который строит строку из массива ch, номер ячейке начала и длины
        //получили строку в которой будет значение поля(тэга)
        data = data.trim();// созд новую строку data, у котор методом trim удаляем все пробельные символы, которые остались в старой строке

        if ("first-name".equals(pcDataTag)) {//если к нам пришли данные, когда перемен pcDataTag равна first-name
            currentClient.setFirstName(data);//в текущем объекте currentClient устанавливаем значение имени клиента (setFirstName), которое хранится в слепленной раннее строки из символов (data)
        }

        if ("last-name".equals(pcDataTag)) {  //если к нам пришли данные, когда перемен pcDataTag равна last-name
            currentClient.setLastName(data);//в текущем объекте currentClient устанавливаем значение фамилии клиента (setLastName), которое хранится в слепленной раннее строки из символов (data)
            return;
        }

        if ("percent".equals(pcDataTag)) {//если к нам пришли данные, когда перемен pcDataTag равна percent
            double percent = Double.parseDouble(data);//переделываем строку у дробное число т.к. double percent
            currentClient.setPercent(percent);//в текущем объекте currentClient устанавливаем значение процента клиента (setpercent), которое хранится в дробном числе, передел из слепленной раннее строки из символов (data)
            return;
        }

        if ("cash-back".equals(pcDataTag)) {//то же
            double cashBack = Double.parseDouble(data);//то же
            currentClient.setCashBack(cashBack);//то же
            return;
        }

        if ("pin-code".equals(pcDataTag)) {//то же
            int pinCode = Integer.parseInt(data);//то же
            currentClient.setPinCode(pinCode);//то же
            return;
        }

        if ("street".equals(pcDataTag)) {//если к нам пришли данные, когда перемен pcDataTag равна street
            currentAddress.setStreet(data);//в текущем объекте currentAddress устанавливаем значение улицы у адреса (setStreet), которое хранится в слепленной раннее строки из символов (data)
            return;
        }

        if ("house-no".equals(pcDataTag)) {//если к нам пришли данные, когда перемен pcDataTag равна house-no
            int houseNo = Integer.parseInt(data);//переделываем строку у дробное число т.к. int houseNo
            currentAddress.setHouseNo(houseNo);//в текущем объекте currentAddress устанавливаем значение номера дома у адреса(sethouseNo), которое хранится в дробном числе, передел из слепленной раннее строки из символов (data)

            return;
        }
    }
}
