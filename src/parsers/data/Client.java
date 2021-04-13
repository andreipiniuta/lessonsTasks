package parsers.data;

import java.util.ArrayList;
import java.util.List;

public class Client {//класс написан на основе файла xml

    private String language;
    private String profession;
    private String firstName;
    private String lastName;
    private Double percent;
    private Double cashBack;
    private Integer pinCode;

    private List<Address> addressList;// поле является объектом класса Address c типом Address

    public Client() {
        addressList = new ArrayList<>();//для каждого клиета создаем отдельный пустой список для адрессов
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public void addAddress(Address address) {
        this.addressList.add(address);
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
