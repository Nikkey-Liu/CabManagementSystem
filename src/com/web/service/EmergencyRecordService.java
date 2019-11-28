package com.web.service;

import java.util.List;

import com.web.pojo.EmergencyRecord;

public interface EmergencyRecordService {
	
	/**删除delete
	 * @param vehicleid
	 * @throws Exception
	 */
	public int deleteEmergencyRecord(Integer itemid);
	/**增加add
	 * @param EmergencyRecord
	 * @throws Exception
	 */
   
    
	public int addEmergencyRecord(EmergencyRecord record);
	/**查找/findEmergencyRecordByApplicantName
  	 * @param applicantName
  	 * @throws Exception
  	 */
    
	public List<EmergencyRecord> findEmergencyRecordByApplicantName(String applicantName);

	 /**修改edit
   	 * @param EmergencyRecord
   	 * @throws Exception
   	 */
	public int editEmergencyRecord(EmergencyRecord record);
	/**查看所有viewList
  	 * @param page,rows, EmergencyRecord
  	 * @throws Exception
  	 */
    
    public List<EmergencyRecord> viewList(EmergencyRecord record);
}