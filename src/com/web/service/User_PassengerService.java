package com.web.service;

import java.util.List;

import com.web.pojo.Driver;
import com.web.pojo.Passenger;

public interface User_PassengerService {
	/**删除delete
	 * @param passengerid
	 * @throws Exception
	 */
	public  int deletePassenger(Integer passengerid);
	/**增加add
	 * @param Passenger
	 * @throws Exception
	 */
   
    public  int addPassenger(Passenger record);
    /**查找/FindByPassengerId
	 * @param passengerid
	 * @throws Exception
	 */
    public Passenger FindByPassengerId(Integer passengerid);
    /**查找/findByPassengerName 
	 * @param passengerNAME
	 * @throws Exception
	 */
    public  Passenger findByPassengerName(String passengerNAME);
    /**修改edit
  	 * @param Passenger
  	 * @throws Exception
  	 */
    public  int editPassenger(Passenger record);

    /**查看所有viewList
   	 * @param Passenger
   	 * @throws Exception
   	 */
    public List<Passenger> viewList(Passenger record);
}