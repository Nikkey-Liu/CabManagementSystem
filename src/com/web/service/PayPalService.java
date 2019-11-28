package com.web.service;

import java.util.List;


import com.web.pojo.PayPal;

public interface PayPalService {
	/**删除delete
	 * @param paypalid
	 * @throws Exception
	 */
	public int deletePayPal(Integer paypalid);
	/**增加add
	 * @param PayPal
	 * @throws Exception
	 */
   
    public  int addPayPal(PayPal record);
    /**查找/findByPassengerId
  	 * @param passengerid
  	 * @throws Exception
  	 */
  
    public PayPal findByPassengerId(Integer passengerid);
    /**修改edit
	 * @param Vehicle
	 * @throws Exception
	 */
    public  int editPayPal(PayPal record);
    /**查看所有viewList
  	 * @param page,rows, PayPal
  	 * @throws Exception
  	 */
    
    public List<PayPal> viewList(PayPal record);
}