package com.web.service;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.pojo.Admin;
import com.web.dao.AdminMapper;
@Service("user_AdminService")
@Transactional
public class User_AdminServiceImpl implements User_AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public int deleteAdmin(Integer adminid) {
		
		return adminMapper.deleteByPrimaryKey(adminid);
	}

	@Override
	public int addAdmin(Admin record) {
		
		return adminMapper.insert(record);
	}

	@Override
	public Admin find_login_N_P(String userName, String password) {
		System.out.print(userName+ DigestUtils.md5Hex(password)+"----------------------");
		Admin admin = this.adminMapper.selectByNamePassword(userName, DigestUtils.md5Hex(password));
		
		return admin;
	}

	@Override
	public Admin findByAdminId(Integer adminid) {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(adminid);
	}

	@Override
	public int editAdmin(Admin record) {
		// TODO Auto-generated method stub
		return adminMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Admin> selectList(Admin record) {
		// TODO Auto-generated method stub
		return adminMapper.selectAdminList(record);
	}

	@Override
	public Admin findByAdminName(String adminName) {
		// TODO Auto-generated method stub
		return null;
	}

}
