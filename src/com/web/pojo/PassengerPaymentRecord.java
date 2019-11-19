package com.web.pojo;

import java.util.Date;

public class PassengerPaymentRecord {
   
    private Integer paymentrecordid;

   
    private Double amount;

   
    private String paymentstatus;

   
    private Date paymentdate;

   
    private Integer paymenttype;

   
    private Integer thirtypartypaymentid;

   
    private Integer tripid;

   
    public Integer getPaymentrecordid() {
        return paymentrecordid;
    }

   
    public void setPaymentrecordid(Integer paymentrecordid) {
        this.paymentrecordid = paymentrecordid;
    }

   
    public Double getAmount() {
        return amount;
    }

   
    public void setAmount(Double amount) {
        this.amount = amount;
    }

   
    public String getPaymentstatus() {
        return paymentstatus;
    }

   
    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus == null ? null : paymentstatus.trim();
    }

   
    public Date getPaymentdate() {
        return paymentdate;
    }

   
    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

   
    public Integer getPaymenttype() {
        return paymenttype;
    }

   
    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

   
    public Integer getThirtypartypaymentid() {
        return thirtypartypaymentid;
    }

   
    public void setThirtypartypaymentid(Integer thirtypartypaymentid) {
        this.thirtypartypaymentid = thirtypartypaymentid;
    }

   
    public Integer getTripid() {
        return tripid;
    }

   
    public void setTripid(Integer tripid) {
        this.tripid = tripid;
    }
}