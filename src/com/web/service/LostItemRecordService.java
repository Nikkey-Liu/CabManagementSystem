package com.web.service;

import java.util.List;


import com.web.pojo.LostItemRecord;

public interface LostItemRecordService {
	/**删除delete
	 * @param itemid
	 * @throws Exception
	 */
	public int deleteLostItemRecord(Integer itemid);


	/**增加add
	 * @param LostItemRecord
	 * @throws Exception
	 */
    public int addLostItemRecord(LostItemRecord record);

    /**查找/findByItemName
  	 * @param itemName
  	 * @throws Exception
  	 */
   
    public  List<LostItemRecord>   findByItemName(String itemName);
    /**修改edit
   	 * @param LostItemRecord
   	 * @throws Exception
   	 */
   
    public  int editLostItemRecoder(LostItemRecord record);
    /**查看所有viewList
  	 * @param page,rows, LostItemRecord
  	 * @throws Exception
  	 */

    public List<LostItemRecord> viewList(LostItemRecord record);
}