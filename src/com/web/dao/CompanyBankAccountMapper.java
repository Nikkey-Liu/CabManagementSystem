package com.web.dao;

import java.util.List;


import com.web.pojo.CompanyBankAccount;

public interface CompanyBankAccountMapper {
   
    int deleteByPrimaryKey(Integer accountid);

   
    int insert(CompanyBankAccount record);

   
    int insertSelective(CompanyBankAccount record);

   
    CompanyBankAccount selectByPrimaryKey(Integer accountid);

   
    int updateByPrimaryKeySelective(CompanyBankAccount record);

   
    int updateByPrimaryKey(CompanyBankAccount record);
    
    public List<CompanyBankAccount> selectCompanyBankAccountList(CompanyBankAccount record);
}