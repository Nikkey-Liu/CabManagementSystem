package com.web.service;

import java.util.List;


import com.web.pojo.Admin;
import com.web.pojo.Driver;

public interface User_AdminService {
	/**删除delete
	 * @param adminid
	 * @throws Exception
	 */
	public int deleteAdmin(Integer adminid);
	/**增加add
	 * @param Admin
	 * @throws Exception
	 */
	public  int addAdmin(Admin record);
	 /**查找/find_login_N_P
		 * @param userName @param password
		 * @throws Exception
		 */
	public  Admin find_login_N_P(String userName, String password );
	  /**查找/findByAdminId 
		 * @param adminid
		 * @throws Exception
		 */
	public Admin findByAdminId(Integer adminid);
	 /**查找/findByAdminName 
	 * @param adminName
	 * @throws Exception
	 */
	 public  Admin findByAdminName(String adminName);
	 /**修改edit
		 * @param adminName
		 * @throws Exception
		 */
	public  int editAdmin(Admin record);
	 /**修改selectList
	 * @param Admin
	 * @throws Exception
	 */
    public List<Admin> selectList(Admin record);
}