package sample;

import java.util.Random;

public class Account  {

    Factory f=new Factory();
    protected double balance;
    double amount;
    public static final double minWithdraw=2000;
    double maxWithdraw;
    String accountType;
    boolean isActivated;
    private String password;
    private String AccountNumber;

    UserInformation user=new UserInformation();

    public Account() { }

    public Account(UserInformation user,double balance, double amount, boolean isActivated, String password, String accountNumber, String accountType) {
        this.balance = balance;
        this.amount = amount;
        this.isActivated = isActivated;
        this.password = password;
        AccountNumber = accountNumber;
        this.accountType=accountType;
        this.user=user;

    }

    public Account(UserInformation user,double balance, String AccountNumber) {
        this.user=user;
        this.balance = balance;
        this.AccountNumber=AccountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void activateAccount()
    {
        this.isActivated=true;
    }



    boolean  withdrawMoney(double amount) {
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        else
        return false;
    }

    void depositMoney(double amount)
    {
        this.balance+=amount;
    }

    String generateUniqueAccountNumber()
    {
        Random r = new Random();
        String accountNum=String.valueOf(r.nextInt(10000000)+89999999);
            return accountNum;
    }


    public double getbalance()
    {
        return balance;
    }

    public void setAccountType(String accountType){
        this.accountType=accountType;
        Account a=f.getType("Saving Account");
    }

}