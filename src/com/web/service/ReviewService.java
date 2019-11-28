package com.web.service;

import java.util.List;


import com.web.pojo.Review;

public interface ReviewService {
	/**删除delete
	 * @param reviewid
	 * @throws Exception
	 */
	public   int deleteReview(Integer reviewid);
	/**增加add
	 * @param Review
	 * @throws Exception
	 */
    public   int addReview(Review record);
    /**查找/findByDriverID
 	 * @param driverid
 	 * @throws Exception
 	 */
    public  List<Review>findByDriverID(Integer driverid);
    /**查找/findByPassengerID
   	 * @param passerngerid
   	 * @throws Exception
   	 */
    public List<Review> findByPassengerID(Integer passerngerid);
    /**修改edit
   	 * @param Review
   	 * @throws Exception
   	 */
    public  int editReview(Review record);


    /**查看所有viewList
  	 * @param page,rows, Review
  	 * @throws Exception
  	 */
    public List<Review> viewList(Review record);
}