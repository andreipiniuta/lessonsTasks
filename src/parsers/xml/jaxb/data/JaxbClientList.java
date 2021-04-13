package parsers.xml.jaxb.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "clients-db")//аннотация над классом c именем корневого Тэга, будет корневым Тэгом
@XmlAccessorType(XmlAccessType.FIELD)//аннотация как делать инициализацию--через поля
public class JaxbClientList {

    @XmlElement(name = "client")// аннотация с именем Тэг-объекта
    private List<JaxbClient> clientList;//поля класса--это список наших java объектов

    public JaxbClientList() {
        clientList = new ArrayList<>();//в конструкторе создаем такой список
    }

    public List<JaxbClient> getClientList() {
        return clientList;
    }

    public void setClientList(List<JaxbClient> clientList) {
        this.clientList = clientList;
    }

    public void addClient(JaxbClient client) {
        clientList.add(client);
    }
}
