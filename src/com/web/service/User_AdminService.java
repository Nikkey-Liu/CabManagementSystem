package com.web.service;

import java.util.List;


import com.web.pojo.Admin;
import com.web.pojo.Driver;

public interface User_AdminService {
   
	public int deleteAdmin(Integer adminid);

   
	public  int addAdmin(Admin record);

	public  Admin find_login_N_P(String userName, String password );
	public Admin findByAdminId(Integer adminid);
	 public  Admin findByAdminName(String adminName);
	public  int editAdmin(Admin record);

    public List<Admin> selectList(Admin record);
}