package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.CompanyBankAccountMapper;
import com.web.pojo.CompanyBankAccount;
@Service("companyBankAccountService")
@Transactional
public class CompanyBankAccountServiceImpl implements CompanyBankAccountService {
	@Autowired
	CompanyBankAccountMapper companyBankAccountMapper;
	@Override
	public int deleteCompanyBankAccount(Integer accountid) {
		
		return companyBankAccountMapper.deleteByPrimaryKey(accountid);
	}

	@Override
	public int addCompanyBankAccount(CompanyBankAccount record) {
		
		return companyBankAccountMapper.insert(record);
	}

	@Override
	public int editCompanyBankAccount(CompanyBankAccount record) {
		
		return companyBankAccountMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CompanyBankAccount> viewList(CompanyBankAccount record) {
		
		return companyBankAccountMapper.selectCompanyBankAccountList(record);
	}

}
