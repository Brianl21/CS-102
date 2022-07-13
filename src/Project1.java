package CS102;

import java.util.Date;

public class Project1 {
    public static void main(String[] args) {

    }

    static class Account {
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private Date dateCreated = new Date();

        //constructor
        Account() {

        }

        Account(int specifiedID, double initialBalance) {
            this.id = specifiedID;
            this.balance = initialBalance;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        double getMonthlyInterestRate() {
            return (annualInterestRate / 12);
        }

        double getMonthlyInterest() {
            return (balance * getMonthlyInterestRate());
        }

        double withdraw(double amount) {
            balance = balance - amount;
            return balance;
        }

        double deposit(double amount) {
            balance = balance + amount;
            return balance;
        }
    }
}
