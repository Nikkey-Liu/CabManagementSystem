package com.web.dao;

import java.util.List;

import com.web.pojo.PayPal;
import com.web.pojo.Review;

public interface ReviewMapper {
   
    int deleteByPrimaryKey(Integer reviewid);

   
    int insert(Review record);

   
    int insertSelective(Review record);

   
    Review selectByPrimaryKey(Integer reviewid);

   
    int updateByPrimaryKeySelective(Review record);

   
    int updateByPrimaryKey(Review record);

    public int selectListCount(Review record);
    public List<Review> selectReviewList(Review record);
}