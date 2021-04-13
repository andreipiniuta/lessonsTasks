package GlobalFormatsFiles;

public class ClientforGlobalFormat {
    private String firstName;
    private String lastName;
    private Double percent;
    private int pincode;

    public ClientforGlobalFormat(String firstName, String lastName, Double percent, int pincode) {
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
}
