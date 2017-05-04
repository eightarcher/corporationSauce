package com.corporationSauce;

/**
 * Created by PonyExpress on 5/3/2017.
 */
public class Main {

    public static void main(String args[]){
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    
        BankAccount checking = new BankAccount();
        BankAccount savings = new BankAccount(0,0,"","","");

        System.out.println(checking.getAccNo());
        System.out.println(checking.getCustName());
        System.out.println(checking.getBalance());

        checking.setAccNo(12345);
        checking.setBalance(596.35);
        checking.setCustName("Mike");
        checking.setEmail("mike@email.com");
        checking.setPhone("123-456-7890");

        savings.setAccNo(54321);
        savings.setBalance(110000.95);
        savings.setCustName("Julia");
        savings.setEmail("Julia@email.com");
        savings.setPhone("123-556-9990");

        System.out.println(savings.getAccNo());
        System.out.println(savings.getBalance());
        System.out.println(savings.getCustName());
        System.out.println(savings.getEmail());
        System.out.println(savings.getPhone());
        System.out.println(checking.getAccNo());
        System.out.println(checking.getBalance());
        System.out.println(checking.getCustName());
        System.out.println(checking.getEmail());
        System.out.println(checking.getPhone());

        checking.withdraw(1000);
        savings.withdraw(1000);

        checking.deposit(1000);
        savings.deposit(1000);

        checking.withdraw(1000);
        savings.withdraw(1000);

        BankAccount bobsAccount = new BankAccount(8675309,500000,
                "Bob", "bob@bob.com", "917-855-6432");

        bobsAccount.deposit(250000);
        bobsAccount.withdraw(125000);

    
    }
    
    
}
