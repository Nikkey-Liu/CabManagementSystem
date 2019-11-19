package com.web.pojo;

import java.util.Date;

public class Review {
   
    private Integer reviewid;

   
    private String reviewcontent;

   
    private Integer passengerid;

   
    private Integer driverid;

   
    private Date reviewdate;

   
    private Integer score;

   
    public Integer getReviewid() {
        return reviewid;
    }

   
    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

   
    public String getReviewcontent() {
        return reviewcontent;
    }

   
    public void setReviewcontent(String reviewcontent) {
        this.reviewcontent = reviewcontent == null ? null : reviewcontent.trim();
    }

   
    public Integer getPassengerid() {
        return passengerid;
    }

   
    public void setPassengerid(Integer passengerid) {
        this.passengerid = passengerid;
    }

   
    public Integer getDriverid() {
        return driverid;
    }

   
    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

   
    public Date getReviewdate() {
        return reviewdate;
    }

   
    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

   
    public Integer getScore() {
        return score;
    }

   
    public void setScore(Integer score) {
        this.score = score;
    }
}