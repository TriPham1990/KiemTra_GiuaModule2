package bai2;

public class Contact {
    private String firtName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firtName, String lastName, String phoneNumber){
        this.firtName = firtName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
