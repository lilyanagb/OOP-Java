package Zad4;
import java.util.Random;

public class SavingsAccount {
private static double mAnnualInterestRate;
private double mSavingBalance;
private static int id=1;
private final int mNumber;

    SavingsAccount(){
        modifyInterestRate(0);
        setmSavingBalance(0);
        mNumber=id++;
    }

    SavingsAccount(double mSavingBalance, double mAnnualInterestRate){
        modifyInterestRate(mAnnualInterestRate);
        setmSavingBalance(mSavingBalance);
        mNumber= id++;
    }

    SavingsAccount(SavingsAccount account, double mAnnualInterestRate){
        this(account.mSavingBalance,account.mAnnualInterestRate);
    }

    public static void modifyInterestRate(double mAnnualInterestRate) {
      if(mAnnualInterestRate>=0)
       SavingsAccount.mAnnualInterestRate=mAnnualInterestRate;
    }

    public void setmSavingBalance(double mSavingBalance) {
        if(mSavingBalance >= 0)
        this.mSavingBalance = mSavingBalance;
    }

    public double getmAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public int getmNumber() {
        return mNumber;
    }

    public double getmSavingBalance() {
        return mSavingBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "mAnnualInterestRate=" + mAnnualInterestRate +
                ", mSavingBalance=" + mSavingBalance +
                ", mNumber=" + mNumber +
                '}';
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest= (mSavingBalance*mAnnualInterestRate)/12;
        this.mSavingBalance += monthlyInterest;
    }

    boolean isGreater(SavingsAccount acc){
        return acc.mSavingBalance > this.mSavingBalance;
    }
}
