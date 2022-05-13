package sample;

public class StudentAccount extends SavingAccount {


  //  UserInformation student=new UserInformation("yara", "Helmy", "yarahelmy@", "01010", "123456", "Portsaid", "Single", "Female");
    public String universityName;
    public String universityId;

    public StudentAccount() {
    }


    public StudentAccount(UserInformation user, double balance,String AccountNumber, double maxLimit, String universityName, String universityId) {
        super(user, balance,  AccountNumber, maxLimit);
        this.universityName = universityName;
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
}
