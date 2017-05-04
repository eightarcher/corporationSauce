package com.corporationSauce;

/**
 * Created by PonyExpress on 5/3/2017.
 */
public class BankAccount {

    private int accNo;
    private double balance;
    private String custName;
    private String email;
    private String phone;

    public BankAccount(){
        this(99999, .99, "Customer", "email", "555-123-4567");
        System.out.println("empty constructor called - using default param");
    }


    public BankAccount(int accNo, double balance, String custName, String email, String phone) {
        this.accNo = accNo;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
    }

    public int getAccNo(){
        return this.accNo;
    }
    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getCustName(){
        return this.custName;
    }
    public void setCustName(String custName){
        this.custName = custName;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Balance is: " + this.balance);
    }
    public void withdraw(double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("Balance is: " + this.balance);
        }
    }

}
