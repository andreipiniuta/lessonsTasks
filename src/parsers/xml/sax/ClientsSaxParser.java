package parsers.xml.sax;

import parsers.data.Client;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class ClientsSaxParser {// основнй класс, который будет парсить(читать xml)

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();//создаем фабрику с пом.SAXParserFactory.newInstance()
        SAXParser saxParser = factory.newSAXParser();//создаем объект saxParser с пом. фабрики

        ClientSaxHandler handler = new ClientSaxHandler();//создали объект спец класса который будет отлавливать и обрабатывать события(Tagи)
        saxParser.parse("D:/stormnet-tasks/clientsForSAXandDOM.xml", handler);//отдаем команду парсить объекту saxParser
        //в параметре №1 путь к файлу, в №2 объект спец класса handler который будет  отлавливать и отрабатывать события(Tagи xml файла)
// в этот handler будет все складываться из xml файла
        List<Client> allClients = handler.getAllClients();// в список allClients заносим все объекты из списка AllClients(получили в классе ClientSaxHandler)
        for (Client c: allClients) {//через перемен с распечатали все объекты списка allClients
            System.out.println(c);
        }
    }
}
