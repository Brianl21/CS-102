package CS102;
/*
Overloading:
int sum (int, int)
double sum (double, double)
method name is same, parameter list is different

override:
Account: withdraw()

CheckingAccount: withdraw()
two methods must have SAME method signature
 */
public class Lesson10_Inheritance {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(111, 100);
        a1.deposit(300);
        a1.withdraw(200);
        System.out.println(a1.toString());

        SavingsAccount a2 = new SavingsAccount(222,200);
        a2.withdraw(300);

        CheckingAccount a3 = new CheckingAccount(300,200);
            a3.withdraw(250);
            System.out.println(a3.toString());
            a3.withdraw(100);

        System.out.println(BankAccount.numOfAccounts);
        System.out.println(SavingsAccount.numOfAccounts);

        A o = new A();
        System.out.println(o.toString());
        }
    }


class BankAccount {
    private int id;
    private double balance;
    private java.util.Date dateCreated;

    public static int numOfAccounts;
    public static double annualInterestRate;

    public BankAccount() {
        dateCreated = new java.util.Date();
        numOfAccounts++;
    }

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
        numOfAccounts++;
    }

    //Getter to access the private variable
    //Setter to modify the private variable
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public java.util.Date getDate() {
        return dateCreated;
    }

    public static double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        String result = "Account ID: " + id + "\n";
        result += "Date: " + dateCreated.toString() + "\n";
        result += "Balance: " + balance + "\n";
        return result;
    }
}

class SavingsAccount extends BankAccount {
    public static int numOf;

    public SavingsAccount() {
        //Super()
        numOfAccounts++;
    }

    public SavingsAccount(int id, double b) {
        super(id, b);
        numOfAccounts++;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Not enough in your current balance");
        } else {
            super.withdraw(amount);
        }
    }
}

class CheckingAccount extends BankAccount {
    public static final double OVERDRAFT_LIMIT = 100;
    public static int numOfAccounts;

    public CheckingAccount(){
        numOfAccounts++;
    }

    public CheckingAccount(int id, double b){
        super(id,b);
        numOfAccounts++;
    }
    public void withdraw (double amount){
        if (amount - getBalance() > OVERDRAFT_LIMIT){
            System.out.println("Exceed the limit");
        }
        else {
            super.withdraw(amount);
        }
    }
}
class A {
    @Override
    public String toString (){
        return "I am A";
    }

}
