package sample;

public class UserInformation {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String NID;
    private String address;
    private String occupation;
    private  String sex;

    public UserInformation() {
    }

    public UserInformation(String firstName, String lastName, String email, String phoneNo, String NID, String address, String occupation, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.NID = NID;
        this.address = address;
        this.occupation = occupation;
        this.sex = sex;
    }

    public String toString()
    {
        return  firstName + "\n" + lastName + "\n" + email + "\n"
                + phoneNo + "\n" + NID + "\n" + address + "\n" + occupation + "\n" + sex;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
