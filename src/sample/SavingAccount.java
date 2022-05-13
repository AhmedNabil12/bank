package sample;

public class SavingAccount extends Account{
    public static double rate=0.05;
    private  double maxLimit;

    public SavingAccount() {
    }

    public SavingAccount(UserInformation user,double balance,  String AccountNumber, double maxLimit) {
        super(user,balance, AccountNumber);

        this.maxLimit = maxLimit;
    }

    public double getNetBalance()
    {
        double NetBalance= getBalance()+(getBalance()*rate);
        return NetBalance;
    }

    public void withdraw(double amount) throws  MaxWithdraw
    {
        if(amount<maxLimit)
        {
            super.withdrawMoney(amount);

        }
        else
        {
            throw new MaxWithdraw("Maximum Withdraw Limit Exceed");
        }

    }

    public double getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(double maxLimit) {
        this.maxLimit = maxLimit;
    }
}
