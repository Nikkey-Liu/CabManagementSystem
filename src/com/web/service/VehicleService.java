package com.web.service;



import com.web.pojo.Vehicle;
import com.web.util.Page;

public interface VehicleService {
	/**删除delete
	 * @param vehicleid
	 * @throws Exception
	 */
	public   int deleteVehicle(Integer vehicleid);
	/**增加add
	 * @param Vehicle
	 * @throws Exception
	 */
   
    public  int addVehicle(Vehicle record);
    /**查找/findByVehicleId
	 * @param vehicleid
	 * @throws Exception
	 */
   
    public Vehicle findByVehicleId(Integer vehicleid);
    /**查找/findVehicleByDriverId
   	 * @param driverid
   	 * @throws Exception
   	 */
    public Vehicle findByDriverId(Integer driverid);
    /**修改edit
	 * @param Vehicle
	 * @throws Exception
	 */
    public int editVehicle(Vehicle record);

    /**查看所有viewList
  	 * @param page,rows, Vehicle
  	 * @throws Exception
  	 */
    
    public Page<Vehicle> viewList(Integer page,Integer rows, Vehicle record);
}