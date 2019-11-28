package com.web.service;

import java.util.List;


import com.web.pojo.TripApply;

public interface TripApplyService {
	/**删除delete
	 * @param tripapplyid
	 * @throws Exception
	 */
	public   int deleteTripApplys(Integer tripapplyid);
	 /**查找/findTripApplyByPassengerId
		 * @param passengerid
		 * @throws Exception
		 */
    public List<TripApply> findTripApplyByPassengerId(Integer passengerid);
    /**查看所有viewList
  	 * @param page,rows, TripApply
  	 * @throws Exception
  	 */
    public List<TripApply> viewList(TripApply record);
}