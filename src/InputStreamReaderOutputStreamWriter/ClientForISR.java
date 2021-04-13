package InputStreamReaderOutputStreamWriter;

public class ClientForISR {//класс написан на основе файла xml

        private String language;
        private String profession;
        private String firstName;
        private String lastName;
        private Double percent;
        private Double cashBack;
        private Integer pinCode;

    public ClientForISR() {
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

    @Override
    public String toString() {
        return "ClientForISR{" +
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
