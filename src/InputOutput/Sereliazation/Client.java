package InputOutput.Sereliazation;

import java.io.Serializable;

public class Client implements Serializable {

    //public static final long  serialVersionUID = 1L;//контрольная сумма задана как константа по умолчанию
    private String firstName;
    private String lastName;
    private Double percent;
    private int pincode;
    //private int code transient// слово transient ставим если не хотим сериализации поля code

    public Client() {
    }

    public Client(String firstName, String lastName, Double percent, int pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.percent = percent;
        this.pincode = pincode;
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

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", percent='" + percent + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
