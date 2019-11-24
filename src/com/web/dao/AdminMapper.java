package com.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.pojo.Admin;
import com.web.pojo.Driver;

public interface AdminMapper {
   
    int deleteByPrimaryKey(Integer adminid);

   
    int insert(Admin record);

    Admin selectByNamePassword(@Param("adminname")String adminname,@Param("password")String password);
    int insertSelective(Admin record);

   
    Admin selectByPrimaryKey(Integer adminid);

   
    int updateByPrimaryKeySelective(Admin record);

   
    int updateByPrimaryKey(Admin record);
    
    
    public List<Admin> selectAdminList(Admin record);
    public int selectListCount(Admin record);
}