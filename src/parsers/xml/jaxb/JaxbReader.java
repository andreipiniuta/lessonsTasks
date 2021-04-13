package parsers.xml.jaxb;

import parsers.xml.jaxb.data.JaxbClient;
import parsers.xml.jaxb.data.JaxbClientList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JaxbReader {

    public static void main(String[] args) throws JAXBException {
        File xmlFile = new File("D:/stormnet-tasks/clientsForSAXandDOM.xml");//создали файл с путем

        JAXBContext jaxbContext = JAXBContext.newInstance(JaxbClientList.class);//создали JAXBContext
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();//создали распаковщика через JAXBContext
        JaxbClientList clientList = (JaxbClientList) jaxbUnmarshaller.unmarshal(xmlFile);//в наш список прочитали данные xml вызов у распаковщика unmarshal(файл с путём) + приведение типа к типу нашего списка
// ниже для распечатки в консоль
        List<JaxbClient> allClients = clientList.getClientList();
        for (JaxbClient client: allClients) {
            System.out.println(client);
        }
    }
}
