package parsers.xml.jaxb.data;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "client")//аннотация над классом c именем объекта класса, будет Тэг-объектом(parent)
@XmlAccessorType(XmlAccessType.FIELD)//аннотация как делать инициализацию--через поля
public class JaxbClient {

    @XmlAttribute(name = "language", required = true)//аннотация над полем, которое будет атрибутом
    private String language;

    @XmlAttribute(name = "profession", required = true)
    private String profession;

    @XmlElement(name = "first-name")//аннотация, которая будет Тэг-полем(leaf)
    private String firstName;

    @XmlElement(name = "last-name")
    private String lastName;

    @XmlElement(name = "percent")
    private Double percent;

    @XmlElement(name = "cash-back")
    private Double cashBack;

    @XmlElement(name = "pin-code")
    private Integer pinCode;

    @XmlElement(name = "address-list")//в поле address не значение а целый список, у которого 3 объекта address, каждый с полями )
    private JaxbAddressList addressList;//если поле представляет собой список вложенных объектов, то делаем ещё 2 класса по аналогии
    //класс с полями-значениями
    //класс с полем=списку этих объектов

    public JaxbClient() {//пустой конструктор
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getCashBack() {
        return cashBack;
    }

    public void setCashBack(Double cashBack) {
        this.cashBack = cashBack;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public JaxbAddressList getAddressList() {
        return addressList;
    }

    public void setAddressList(JaxbAddressList addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "language='" + language + '\'' +
                ", profession='" + profession + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", percent=" + percent +
                ", cashBack=" + cashBack +
                ", pinCode=" + pinCode +
                '}';
    }
}
