package com.web.pojo;

public class PayPal {
   
    private Integer paypalid;

   
    private String invoicenumber;

   
    private String intent;

   
    private Double totalamount;

   
    private String payerid;

   
    private String firstname;

   
    private String lastname;

   
    private String email;

   
    private String countrycode;

   
    private String paymentstate;

   
    private Integer passengerid;

   
    public Integer getPaypalid() {
        return paypalid;
    }

   
    public void setPaypalid(Integer paypalid) {
        this.paypalid = paypalid;
    }

   
    public String getInvoicenumber() {
        return invoicenumber;
    }

   
    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

   
    public String getIntent() {
        return intent;
    }

   
    public void setIntent(String intent) {
        this.intent = intent == null ? null : intent.trim();
    }

   
    public Double getTotalamount() {
        return totalamount;
    }

   
    public void setTotalamount(Double totalamount) {
        this.totalamount = totalamount;
    }

   
    public String getPayerid() {
        return payerid;
    }

   
    public void setPayerid(String payerid) {
        this.payerid = payerid == null ? null : payerid.trim();
    }

   
    public String getFirstname() {
        return firstname;
    }

   
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

   
    public String getLastname() {
        return lastname;
    }

   
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

   
    public String getCountrycode() {
        return countrycode;
    }

   
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

   
    public String getPaymentstate() {
        return paymentstate;
    }

   
    public void setPaymentstate(String paymentstate) {
        this.paymentstate = paymentstate == null ? null : paymentstate.trim();
    }

   
    public Integer getPassengerid() {
        return passengerid;
    }

   
    public void setPassengerid(Integer passengerid) {
        this.passengerid = passengerid;
    }
}