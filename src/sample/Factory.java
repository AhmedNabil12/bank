package sample;

public class Factory {

    public Account getType(String type) {

        Account accType = null;

        if (type.equals("SavingAccount")) {
            accType = new SavingAccount();
        } else if (type.equals("CurrentAccount")) {
            accType = new CurrentAccount();
        } else if (type.equals("StudentAccount")) {
            accType = new StudentAccount();
        }
        return accType;
    }
}
