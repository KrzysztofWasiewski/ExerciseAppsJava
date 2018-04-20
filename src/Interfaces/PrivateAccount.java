package Interfaces;

/**
 * Created by Kris on 2018-04-20.
 */
public class PrivateAccount implements Account {

    int balance = 0;

    @Override
    public void addResources(int newResources) {
    balance+=newResources;
    }

    @Override
    public void transferResources(int transferredResources) {
    balance-=transferredResources;
    }
}
