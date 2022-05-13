package sample;

public class Client extends Account /*implements bankingBills*/{

    BankingServices services=new BankingServices();

    public Client() {
    }

    public Client(UserInformation user, double balance, double amount, boolean isActivated, String password, String accountNumber, String accountType, BankingServices services) {
        super(user, balance, amount, isActivated, password, accountNumber, accountType);
        this.services = services;
    }

 /*  @Override
    public void servicesBills() {
        if(services.electricityBill){
            amount-=services.electricityBill+services.bankingServicesFees;
        }
        amount-=m;
    }*/

}
