package com.web.service;

import java.util.List;


import com.web.pojo.TripSuggestion;

public interface TripSuggestionService {
	/**删除delete
	 * @param tripsuggestid
	 * @throws Exception
	 */
	public int deleteTripSuggestion(Integer tripsuggestid);
	/**增加add
	 * @param TripSuggestion
	 * @throws Exception
	 */
	public  int addTripSuggestion(TripSuggestion record);
	  /**查找/findTripSuggestionByDriverId
		 * @param driverid
		 * @throws Exception
		 */
	public  List<TripSuggestion> findTripSuggestionByDriverId(Integer driverid);
  /**修改edit
	 * @param TripSuggestion
	 * @throws Exception
	 */
	public  int editTripSuggestion(TripSuggestion record);

    /**查看所有viewList
  	 * @param page,rows, TripSuggestion
  	 * @throws Exception
  	 */
    public List<TripSuggestion> viewList(TripSuggestion record);
}