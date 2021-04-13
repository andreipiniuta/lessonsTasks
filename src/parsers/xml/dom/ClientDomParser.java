package parsers.xml.dom;

import parsers.data.Address;
import parsers.data.Client;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Node--любой уч-к xml: ТЭГ, атрибут, значение
//Element--уч-ки xml, которые представляют собой ТОЛЬКО ТЭГ
//NodeList--список всех NOD-ов, в которых есть то имя Тэга, которое передали методу(getElementsByTagName) в качестве параметра (),
//в него можно сложить Тэг-объекты или Тэг-поля
//getElementsByTagName-- метод, который возвращает список типа NodeList
public class ClientDomParser {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();//создаем объект фабрики dbFactory с пом. DocumentBuilderFactory.newInstance()
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();//создаем объект dBuilder(будет читать xml) с пом. созданной ранее фабрики dbFactory.newDocumentBuilder()
        Document doc = dBuilder.parse("D:/stormnet-tasks/clientsForSAXandDOM.xml");//отдаем команду парсить объекту dBuilder(в параметр путь к файлу xml)
        //метод parse возвращает объект doc типа Documentclients
//после парсинга в объекте doc будет лежать свёрнутый прочитанный файл xml----это дерево из Nod-ов(Node--любой элемент xml: ТЭГ, атрибут, значения)

        List<Client> allClients = new ArrayList<>();//сздаем список объектов(клиентов), куда будем складывать наших заполненных клиентов)

//Element--уч-ки xml, которые представляют собой только ТЭГ
        Element rootTag = doc.getDocumentElement();//в объект rootTag типа  Element  методом getDocumentElement() получаем корневой Тэг файла XML
//в объекте rootTag хранится корневой ТЭГ
        NodeList allClientNodes = rootTag.getElementsByTagName("client");//у объекта rootTag вызываем getElementsByTagName--вернет список всех Node-ов
        //в которых есть то имя Тэга, которое передали методу в качестве параметра ("client"),
        //в список складываем Тэг-объекты, т.к передали имя объекта "client"
        int clientTagCount = allClientNodes.getLength();//у списка allClientNodes узнаем количество элементов в листе (кол-во Тэг-объектов)

        for (int i = 0; i < clientTagCount; i++) {// цикл от нуля до кол-ва элементов в списке Тэг-объектов (кол-во сидит в clientTagCount)
            Client client = new Client();// при каждом проходе создаём нового клиента, его мы будет наполнять данными

            Node clientNode = allClientNodes.item(i);//из списка Тэго-объектов с именем "client" достаем (item) Тэг-объект по номеру ячейке(i) и кладём его в clientNode
            Element clientTag = (Element) clientNode;//т.к. достали именнно Тэг-объект с именем "client", то clientNode типа Node приводим к clientTag типа Element(уч-ки xml, которые представляют собой только ТЭГ)

//            Node firstChild = clientTag.getFirstChild();
//            Node lastChild = clientTag.getLastChild();
//            Node parentNode = clientTag.getParentNode();
//            Node nextSibling = clientTag.getNextSibling();
//            Node previousSibling = clientTag.getPreviousSibling();

            String langAttr = clientTag.getAttribute("language");//у i-ого clientTag (Тэг-объекта) получаем значение Attribute language
            String professionAttr = clientTag.getAttribute("profession");//у i-ого clientTag (Тэг-объекта) получаем значение Attribute profession

            client.setLanguage(langAttr);//записали нашему клиенту значение атрибута language
            client.setProfession(professionAttr);//записали нашему клиенту значение атрибута profession

            //у i-ого clientTag (Тэг-объекта) вызываем getElementsByTagName---вернет список всех Node-ов в которых есть то имя Тэга, которое передали методу в качестве параметра ("first-name")
            ////в список складываем Тэг-поля, т.к передали имя поля "first-name"
            //но т.к. достали именнно Тэг с именем "first-name" и он один, то сразу приводим к (Element) и просим достать элемент из нулевой ячейке т.к. он один в списке
            Element firstNameTag = (Element) clientTag.getElementsByTagName("first-name").item(0);// у
            String firstName = firstNameTag.getTextContent();//у firstNameTag достаем текстовый контент(значение поля)
            client.setFirstName(firstName);//записали нашему клиенту значение поля firstName
//тоже что строки 60-65
            Element lastNameTag = (Element) clientTag.getElementsByTagName("last-name").item(0);
            String lastName = lastNameTag.getTextContent();
            client.setLastName(lastName);
//тоже что строки 60-65 плюс перевод в дробное число
            Element percentTag = (Element) clientTag.getElementsByTagName("percent").item(0);
            String percentStr = percentTag.getTextContent();
            double percent = Double.parseDouble(percentStr);
            client.setPercent(percent);
//тоже что строки 60-65 плюс перевод в дробное число
            Element cashBackTag = (Element) clientTag.getElementsByTagName("cash-back").item(0);
            String cashBackStr = cashBackTag.getTextContent();
            double cashBack = Double.parseDouble(cashBackStr);
            client.setCashBack(cashBack);
//тоже что строки 60-65 плюс перевод в целое число
            Element pinCodeTag = (Element) clientTag.getElementsByTagName("pin-code").item(0);
            String pinCodeStr = pinCodeTag.getTextContent();
            Integer pinCode = Integer.parseInt(pinCodeStr);
            client.setPinCode(pinCode);
//тоже что строки 60-65
            Element addressListTag = (Element) clientTag.getElementsByTagName("address-list").item(0);
            //т.к. addressListTag это список с вложенными  Тэгами, у которых свои значения действуем по аналогии со строки 37
//т.к addressListTag хранит еще вложенные Тэги, то опять вызываем getElementsByTagName вернет список вложенных Тэгов(уже Тэг-объектов address)
            NodeList addressNodeList = addressListTag.getElementsByTagName("address");
            int addressCount = addressNodeList.getLength();// узнаем количесто этих вложеннных Тэгов
            for (int j = 0; j < addressCount; j++) {// опять цикл как выше

                Address address = new Address();// при каждом проходе создаём новый объект адрес

                Node addressNode = addressNodeList.item(j);//из списка Тэг-объектов address с именем "address" достаем (item) Тэг-объект address по номеру ячейке(j) и кладём его в addressNode
                Element addressTag = (Element) addressNode;//т.к. достали именнно Тэг с именем "address", то addressNode типа Node приводим к addressTag типа Element(уч-ки xml, которые представляют собой только ТЭГ)


                String countryAttr = addressTag.getAttribute("country");//у j-ого addressTag получаем значение Attribute country
                String registerAttr = addressTag.getAttribute("isRegistrationAddress");//у j-ого addressTag получаем значение Attribute isRegistrationAddress

                address.setCountry(countryAttr);//записали нашему адресу значение атрибута country

                Boolean register = Boolean.valueOf(registerAttr); //перевод в boolean
                address.setRegistrationAddress(register);//записали нашему адресу значение атрибута isRegistrationAddress
//тоже что строки 60-65 только для объекта address
                Element streetTag = (Element) addressTag.getElementsByTagName("street").item(0);
                String street = streetTag.getTextContent();
                address.setStreet(street);

                Element houseTag = (Element) addressTag.getElementsByTagName("house-no").item(0);
                String houseStr = houseTag.getTextContent();
                int house = Integer.parseInt(houseStr);
                address.setHouseNo(house);

                client.addAddress(address);//объекту client добовили поле address, которое само является уже заполненным объектом
            }// выход из цикла у заполнения address

            allClients.add(client);//в список для хранения заполненных объектов client заносим уже заполненный объект client
        }// выход из цикла у заполнения client

        for (Client c: allClients) {//вывод заполненных объектов client на консоль
            System.out.println(c);
        }
    }
}
