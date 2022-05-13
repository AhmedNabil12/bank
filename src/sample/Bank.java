package sample;

import java.util.ArrayList;

public class Bank {

    private static Bank b=null;
    UserInformation user=new UserInformation();
    Account a=new Account();
    private Bank() { }
    private ArrayList<Account> accounts = new ArrayList<>();
    Factory fact = new Factory();

    // Adding New Accounts
    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void addAccount(UserInformation user, double balance, double maxWithLimit, String AccountNumber) {
        Account ac = fact.getType("SavingAccount");
        ac.setAccountNumber(AccountNumber);
        ac.setBalance(balance);
        SavingAccount acc = (SavingAccount) ac;
        acc.setMaxLimit(maxWithLimit);
        new SavingAccount(user,a.getBalance(),a.getAccountNumber(),((SavingAccount) ac).getMaxLimit());
        addAccount(acc);
    }

    public void addAccount(UserInformation user, double balance, String AccountNumber) throws Exception {
        Account ac = fact.getType("CurrentAccount");
        ac.setAccountNumber(AccountNumber);
        ac.setBalance(balance);
        CurrentAccount acc = (CurrentAccount) ac;
        new CurrentAccount(user,a.getBalance(), a.getAccountNumber());
        addAccount(acc);
    }

    public void addAccount(UserInformation user, double balance,String AccountNumber, double maxLimit, String universityName, String universityId) {
        Account ac = fact.getType("StudentAccount");
        ac.setAccountNumber(AccountNumber);
        ac.setBalance(balance);
        StudentAccount acc = (StudentAccount) ac;
        acc.setMaxLimit(maxLimit);
        acc.setUniversityName(universityName);
        acc.setUniversityId(universityId);
        new StudentAccount(user,a.getBalance(),a.getAccountNumber(), acc.getMaxLimit(), acc.getUniversityName(), acc.getUniversityId());
        addAccount(acc);
    }
    // End Of Adding Accounts



    public Account findAccount(String accountNum) {
        int i;
        for (i = 0; i < accounts.size(); i++)
        {
            if (accounts.get(i).equals(accountNum))
            {
                return accounts.get(i);
            }

        }
        return null;
    }

    public void deposit(String accountNum, double amt) throws InvalidAmount, AccNotFound {
        if (amt < 0) {
            throw new InvalidAmount("Invalid Deposit amount");
        }
        Account temp = findAccount(accountNum);
        if (temp == null) {
            throw new AccNotFound("Account Not Found");
        }
        if (temp != null) {
            temp.depositMoney(amt);
        }
    }

    public void withdraw(String accountNum, double amt) throws MaxBalance, AccNotFound, MaxWithdraw, InvalidAmount {
        Account temp = findAccount(accountNum);

        if (temp == null) {
            throw new AccNotFound("Account Not Found");
        }

        if (amt <= 0) {
            throw new InvalidAmount("Invalid Amount");
        }

        if (amt > temp.getbalance()) {
            throw new MaxBalance("Insufficient Balance");
        }
        if (temp != null) {
            temp.withdrawMoney(amt);
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public static Bank getInstance(){
        if (b == null)
            b = new Bank();
        return b;
    }
}
