package com.web.service;

import java.util.List;


import com.web.pojo.Review;

public interface ReviewService {
   
	public   int deleteReview(Integer reviewid);

    public   int addReview(Review record);

    public  List<Review>findByDriverID(Integer driverid);

    public List<Review> findByPassengerID(Integer passerngerid);
  
    public  int editReview(Review record);

    
    public List<Review> viewList(Review record);
}