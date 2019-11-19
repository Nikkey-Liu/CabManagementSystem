package com.web.service;

import java.util.List;


import com.web.pojo.CompanyBankAccount;

public interface CompanyBankAccountService {
   
	public int deleteCompanyBankAccount(Integer accountid);

   
	public int addCompanyBankAccount(CompanyBankAccount record);

   
	public int editCompanyBankAccount(CompanyBankAccount record);

   
    
    public List<CompanyBankAccount> viewList(CompanyBankAccount record);
}