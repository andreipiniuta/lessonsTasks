package parsers.xml.jaxb;

import parsers.xml.jaxb.data.JaxbAddress;
import parsers.xml.jaxb.data.JaxbAddressList;
import parsers.xml.jaxb.data.JaxbClient;
import parsers.xml.jaxb.data.JaxbClientList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {
//создаем объекты нашего класса Client(в поле address не значение а целый список, у которого 3 объекта address, каждый с полями )
    public static void main(String[] args) throws JAXBException {
        JaxbAddress address1 = new JaxbAddress();
        address1.setCountry("Russia");
        address1.setStreet("Lermontova");
        address1.setHouseNo(48);

        JaxbAddress address2 = new JaxbAddress();
        address2.setCountry("Russia");
        address2.setStreet("Pushkina");
        address2.setHouseNo(12);
        address2.setRegistrationAddress(true);

        JaxbAddress address3 = new JaxbAddress();
        address3.setCountry("Russia");
        address3.setStreet("Bulgakova");
        address3.setHouseNo(48);

        JaxbAddressList addressList = new JaxbAddressList();
        addressList.addAddress(address1);
        addressList.addAddress(address2);
        addressList.addAddress(address3);

        JaxbClient client = new JaxbClient();
        client.setLanguage("ru");
        client.setProfession("Engineering");
        client.setFirstName("Ivan");
        client.setLastName("Ivanov");
        client.setPercent(12.25);
        client.setCashBack(1.5);
        client.setPinCode(1234);

        client.setAddressList(addressList);

        JaxbClientList clientList = new JaxbClientList();//создаем список
        clientList.addClient(client);//все объекты надо положить в список

        JAXBContext jaxbContext = JAXBContext.newInstance(JaxbClientList.class);//создали JAXBContext
        Marshaller marshaller = jaxbContext.createMarshaller();//создание распаковщика
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);//создание потока вывода, true-сделает с отступом
        marshaller.marshal(clientList, new File("D:/stormnet-tasks/clients-from-java-by-JaxB.xml"));//запись в файл(1. что пишем, 2. куда пишем)
        marshaller.marshal(clientList, System.out);//для вывода в консоль(1. что пишем, 2. куда пишем)
    }
}
