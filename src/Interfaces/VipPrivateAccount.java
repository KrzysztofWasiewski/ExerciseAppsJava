package Interfaces;

/**
 * Created by Kris on 2018-04-20.
 */
public class VipPrivateAccount extends PrivateAccount {

    int monthlyBonus;

    public VipPrivateAccount(int monthlyBonus, int balance, int accountNumber){
        super(balance,accountNumber);
        this.monthlyBonus = monthlyBonus;
    }

    public void setMonthlyBonus(int value){
        monthlyBonus+=value;
    }

}
