package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.ReviewMapper;
import com.web.pojo.Review;
@Service("tripApplyService")
@Transactional
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	ReviewMapper reviewMapper;
	@Override
	public int deleteReview(Integer reviewid) {
		
		return reviewMapper.deleteByPrimaryKey(reviewid);
	}

	@Override
	public int addReview(Review record) {
		
		return reviewMapper.insert(record);
	}

	@Override
	public List<Review> findByDriverID(Integer driverid) {
	
		return null;
	}

	@Override
	public List<Review> findByPassengerID(Integer passerngerid) {
		
		return null;
	}

	@Override
	public int editReview(Review record) {
		
		return reviewMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Review> viewList(Review record) {
		
		return reviewMapper.selectReviewList(record);
	}

}
