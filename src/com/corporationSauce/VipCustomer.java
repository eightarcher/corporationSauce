package com.corporationSauce;

/**
 * Created by mikeschaff on 5/4/17.
 */
public class VipCustomer {

    private String custName;
    private String email;
    private double cLimit;

    public VipCustomer(String custName, String email, double cLimit) {
        this.custName = custName;
        this.email = email;
        this.cLimit = cLimit;
    }

    public VipCustomer(String custName, String email) {
        this(custName, email, 50000);
    }

    public VipCustomer() {
        this("Customer","customer@bank.com", 50000);
    }

    public String getCustName() {
        return custName;
    }

    public String getEmail() {
        return email;
    }

    public double getcLimit() {
        return cLimit;
    }
}
