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
