package com.web.pojo;

public class CompanyBankAccount {
 
    private Integer accountid;

   
    private String accountownername;

    private String accountnumber;

    private Double accountbalance;

   
    public Integer getAccountid() {
        return accountid;
    }

   
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

   
    public String getAccountownername() {
        return accountownername;
    }

   
    public void setAccountownername(String accountownername) {
        this.accountownername = accountownername == null ? null : accountownername.trim();
    }

   
    public String getAccountnumber() {
        return accountnumber;
    }

   
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber == null ? null : accountnumber.trim();
    }

   
    public Double getAccountbalance() {
        return accountbalance;
    }

   
    public void setAccountbalance(Double accountbalance) {
        this.accountbalance = accountbalance;
    }
}