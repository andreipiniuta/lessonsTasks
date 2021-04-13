package parsers.data;

public class Address {//класс написан на основе файла xml,Address композиция для client

    private String country;
    private boolean isRegistrationAddress;
    private String street;
    private Integer houseNo;

    public Address() {
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
        return "Address{" +
                "country='" + country + '\'' +
                ", isRegistrationAddress=" + isRegistrationAddress +
                ", street='" + street + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}
