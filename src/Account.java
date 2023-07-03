/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest14.B8;

/**
 *
 * @author PC
 */
public class Account {

    private int idAccount;
    private Customer customer;
    private double balance;

    public Account(int idAccount, Customer customer, double balance) {
        this.idAccount = idAccount;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int idAccount, Customer customer) {
        this.idAccount = idAccount;
        this.customer = customer;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String toString() {
        return customer.toString() + "\nAccount ID : " + this.idAccount + "\nBalance : " + String.format("%.2f $", this.balance);
    }

    public Account deposit(double amount) {
        setBalance(this.balance + amount);
        Account x = new Account(this.idAccount, this.customer, this.balance);
        System.out.println("transaction successful");
        return x;
    }

    public Account withdraw(double amount) {
        Account x;
        if (this.balance >= amount) {
            System.out.println("transaction successful");
            setBalance(this.balance - amount);
            x = new Account(this.idAccount, this.customer, this.balance);
        } else {
            x = new Account(this.idAccount, this.customer, this.balance);
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return x;
    }
}
