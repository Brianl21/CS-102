package CS102;


import java.util.Scanner;

public class Project1Test {
    public static void main(String[] args) {
        Project1.Account myAccount = new Project1.Account(1122, 20000);
        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getMonthlyInterest());
        System.out.println(myAccount.getDateCreated());
    }
}
