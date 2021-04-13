package parsers.xml.jaxb.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
//см класс JaxbClientList
@XmlRootElement(name = "address-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class JaxbAddressList {

    @XmlElement(name = "address")
    private List<JaxbAddress> addressList;

    public JaxbAddressList() {
        addressList = new ArrayList<>();
    }

    public List<JaxbAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<JaxbAddress> addressList) {
        this.addressList = addressList;
    }

    public void addAddress(JaxbAddress address) {
        addressList.add(address);
    }
}
