package com.web.service;

import java.util.List;

import com.web.util.Page;

import com.web.pojo.Driver;

public interface User_DriverService {
	/**删除delete
	 * @param driverid
	 * @throws Exception
	 */
	public  int deleteDriver(Integer driverid);
	/**增加add
	 * @param Driver
	 * @throws Exception
	 */
    public  int addDriver(Driver record);
    /**查找/findDriver
	 * @param driverName
	 * @throws Exception
	 */
    public  Driver findBydriverName(String driverName);
    /**查找/findDriver 
	 * @param driverid
	 * @throws Exception
	 */
    public   Driver findBydriverId(int driverid);
    /**修改edit
	 * @param Driver
	 * @throws Exception
	 */
    public   int editDriver(Driver record);
    /**查看所有viewList
	 * @param Driver,page,rows
	 * @throws Exception
	 */
    public  Page<Driver> viewList(Driver record,Integer page, Integer rows);
}