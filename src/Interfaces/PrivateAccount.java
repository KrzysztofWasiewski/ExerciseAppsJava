package Interfaces;

/**
 * Created by Kris on 2018-04-20.
 */
public class PrivateAccount implements Account {

    int balance;
    int accountNumber;

    public PrivateAccount(int balance, int accountNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    @Override
    public void addResources(int newResources) {
    balance+=newResources;
    }

    @Override
    public void transferResources(int transferredResources) {
    balance-=transferredResources;
    }
}
