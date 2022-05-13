package sample;

public class CurrentAccount extends Account{



    public CurrentAccount() {
    }

    public CurrentAccount(UserInformation user,double balance, String AccountNumber) throws Exception{
        super(user,balance, AccountNumber);

        if(balance<5000) throw new Exception("Insufficient Balance");
    }

}
