package com.web.service;

import java.util.List;

import com.web.pojo.Trip;


public interface TripService {
	/**删除delete
	 * @param tripid
	 * @throws Exception
	 */
	public int deleteTrip(Integer tripid);
	 /**查找/findByPassengerId
	 * @param passengerid
	 * @throws Exception
	 */
    public  List<Trip>  findByPassengerId(Integer passengerid);
    /**查找/findByDriverId
   	 * @param driverid
   	 * @throws Exception
   	 */
    public  List<Trip>  findByDriverId(Integer driverid);
    /**查看所有viewList
  	 * @param page,rows, Trip
  	 * @throws Exception
  	 */
    public List<Trip> viewTripList(Trip record);
}