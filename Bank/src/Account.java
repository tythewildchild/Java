import java.util.*;

public class Account {
    int previousTransaction;
    private double balance;
    static int customerID;
    static String customerName;

    Account(String name){
        customerName = name;
        Account.customerID++;
        balance = 0.00;
    }

    double getBalance(){
        return balance;
    }

    void makeDeposit(double deposit){
        balance += deposit;
    }

    void makeWithdrawal(double withdrawal){
        balance -= withdrawal;
    }

    double calculateInterest(int years){
        return (balance * Math.pow((1 + .01), years) - balance);
    }
    double calculateLoanInterest(double loanAmount, int years){
        return (loanAmount * Math.pow((1 + .06), years) - loanAmount);
    }

}
