package parsers.xml.jaxb.data;

import javax.xml.bind.annotation.*;
//см класс JaxbClient
@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class JaxbAddress {

    @XmlAttribute(name = "country", required = true)
    private String country;

    @XmlAttribute(name = "isRegistrationAddress")
    private boolean isRegistrationAddress;

    @XmlElement(name = "street")
    private String street;

    @XmlElement(name = "house-no")
    private Integer houseNo;

    public JaxbAddress() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isRegistrationAddress() {
        return isRegistrationAddress;
    }

    public void setRegistrationAddress(boolean registrationAddress) {
        isRegistrationAddress = registrationAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "JaxbAddress{" +
                "country='" + country + '\'' +
                ", isRegistrationAddress=" + isRegistrationAddress +
                ", street='" + street + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}
