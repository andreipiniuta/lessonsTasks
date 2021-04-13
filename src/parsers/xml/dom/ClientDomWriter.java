package parsers.xml.dom;

import parsers.data.Address;
import parsers.data.Client;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.List;

public class ClientDomWriter {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
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
//далее создаем дерово из Node(root-Тэг--Node-parent(тэг-объект)---Node-child-or-Node-parent(тэг-объект)--Node-child-or-Node-parent(тэг-объект)--leaf(тэг-поле)
//надо смотреть структуру наших классов Client и address
//создаем объект фабрики documentFactory с пом. DocumentBuilderFactory.newInstance()
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();//создаем объект documentBuilder(будет записывать xml) с пом. созданной ранее фабрики documentFactory.newDocumentBuilder()
        Document document = documentBuilder.newDocument();//отдаем команду объекту documentBuilder создать пустой document типа Document

        Element rootTag = document.createElement("clients-db");//пустой document типа Document создает корневой каталаг(имя каталога)

        Element clientTag = document.createElement("client");//пустой document типа Document создает тэг-объект(имя)

        Attr languageAttr = document.createAttribute("language");//создаем атрибут (имя атрибута)
        languageAttr.setValue(client.getLanguage());//установка атрибуту значения объекта client

        Attr professionAttr = document.createAttribute("profession");//то же
        professionAttr.setValue(client.getProfession());//то же

        clientTag.setAttributeNode(languageAttr);//Тэг-объекту установливаем атрибут со значением
        clientTag.setAttributeNode(professionAttr);//то же

        Element firstNameTag = document.createElement("first-name");//пустой document типа Document создает тэг-поле(имя)
        firstNameTag.setTextContent(client.getFirstName());//установка тэг-полю значения объекта client

        Element lastNameTag = document.createElement("last-name");//то же
        lastNameTag.setTextContent(client.getFirstName());//то же

        Element percentTag = document.createElement("percent");//то же
        percentTag.setTextContent(client.getPercent().toString());//установка тэг-полю значения объекта client с переводом в строку(xml--текстовый файл)

        Element cashBackTag = document.createElement("cash-back");//то же
        cashBackTag.setTextContent(client.getCashBack().toString());//то же

        Element pinCodeTag = document.createElement("pin-code");//то же
        pinCodeTag.setTextContent(client.getPinCode().toString());//то же

        clientTag.appendChild(firstNameTag);//Тэг-объекту(parent) вкладываем Тэг-поля(leafs)   родительскому Тэгу вкладываем детей
        clientTag.appendChild(lastNameTag);                       //leaf -childNode без детей, но сам ребенок к clientTag
        clientTag.appendChild(percentTag);
        clientTag.appendChild(cashBackTag);
        clientTag.appendChild(pinCodeTag);

        Element addressListTag = document.createElement("address-list");//пустой document типа Document создает тэг-child(address-list),
//но address-list не leaf(тэг-поле),а сам Тэг-объект(parent), у него есть свои child---  вложен Тэги address
        List<Address> addressList = client.getAddressList();// client-у устоновил значения из addressList
        for (Address address: addressList) {//foreach из addressList достаем по 1 объетку-адрес
            Element addressTag = document.createElement("address");//пустой document типа Document создает тэг-объект(имя)

            Attr countryAttr = document.createAttribute("country");;//создаем атрибут (имя атрибута)
            countryAttr.setValue(address.getCountry());//установка атрибуту значения объекта address

            addressTag.setAttributeNode(countryAttr);//Тэг-объекту установливаем атрибут со значением
//далее по анадогии заполняем еще один атрибут
            //if потому что не у всех объектов Address есть атрибут isRegistrationAddress
            if (address.isRegistrationAddress()) {
                Attr registerAttr = document.createAttribute("isRegistrationAddress");
                String registrationStr = Boolean.toString(address.isRegistrationAddress());
                registerAttr.setValue(registrationStr);

                addressTag.setAttributeNode(registerAttr);
            }

            Element streetTag = document.createElement("street");//пустой document типа Document создает тэг-поле(имя)
            streetTag.setTextContent(address.getStreet());

            Element houseTag = document.createElement("house-no");//пустой document типа Document создает тэг-поле(имя)
            houseTag.setTextContent(address.getHouseNo().toString());//установка тэг-полю значения объекта client

            addressTag.appendChild(streetTag);//Тэг-объекту(parent) вкладываем Тэг-поля(leafs)   родительскому Тэгу вкладываем детей
            addressTag.appendChild(houseTag);// то же

            addressListTag.appendChild(addressTag);//Тэг-объекту(parent) addressList вкладываем Тэг-childs(address--уже не поле, а объект),
            //address для addressList child, address для country, isRegistrationAddress, street, house-no---parent
        }

        clientTag.appendChild(addressListTag);;//Тэг-объекту(parent) вкладываем Тэг-child--addressList), addressList сам является parent для address

        rootTag.appendChild(clientTag);// корневому Тэгу вкладываем Тэг-объект client
        document.appendChild(rootTag);//пустому документу document вкладываем корневой Тэг


        //запись заполненного дерева в файл
        TransformerFactory transformerFactory = TransformerFactory.newInstance();//создать фабрику TransformerFactory.newInstance()
        Transformer transformer = transformerFactory.newTransformer();//создать объект фабрики transformer
        DOMSource domSource = new DOMSource(document);//создать domSource с пом объекта фабрики, который обернёт наш document
        StreamResult streamResult = new StreamResult("D:/stormnet-tasks/clients-from-java-by-DOM.xml");
//объект streamResult типа StreamResult это куда пишем файл xml

        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");//объекту фабрики transformer указать кодировку
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");//объекту фабрики transformer указать yes--для отступов и пробелов в xml

        transformer.transform(domSource, streamResult);//объекту фабрики transformer даем команду transform(1. что писать, 2. куда писать)

        System.out.println("Done creating XML File");
    }
}
