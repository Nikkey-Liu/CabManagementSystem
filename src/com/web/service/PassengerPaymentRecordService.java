package com.web.service;

import java.util.List;


import com.web.pojo.PassengerPaymentRecord;

public interface PassengerPaymentRecordService {
	/**删除delete
	 * @param paymentrecordid
	 * @throws Exception
	 */
	public  int deletePassengerPaymentRecord(Integer paymentrecordid);

	/**增加add
	 * @param PassengerPaymentRecord
	 * @throws Exception
	 */
    public int addPassengerPaymentRecord(PassengerPaymentRecord record);
    /**查找/findRecordByPassengerId
  	 * @param passengerid
  	 * @throws Exception
  	 */
  
   
    public  List<PassengerPaymentRecord> findRecordByPassengerId(Integer passengerid);
    /**修改edit
   	 * @param PassengerPaymentRecord
   	 * @throws Exception
   	 */
   
    public int editPassengerPaymentRecord(PassengerPaymentRecord record);
    /**查看所有viewList
  	 * @param page,rows, PassengerPaymentRecord
  	 * @throws Exception
  	 */
    public List<PassengerPaymentRecord> viewList(PassengerPaymentRecord record);
}