package Zad4;
import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double balance1=scanner.nextDouble();
        SavingsAccount account1=new SavingsAccount(balance1,1.2);
        System.out.println(account1.getmSavingBalance());

        double balance2=scanner.nextDouble();
        SavingsAccount account2=new SavingsAccount(balance2,1.2);
        System.out.println(account2.getmSavingBalance());

        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        SavingsAccount account3=account1;
        if( account3.isGreater(account2)) System.out.println("IsGreater");
        else System.out.println("Is not greater");
    }

}
