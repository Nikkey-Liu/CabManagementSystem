package com.web.service;

import java.util.List;


import com.web.pojo.CompanyBankAccount;

public interface CompanyBankAccountService {
	
	
	/**删除delete
	 * @param accountid
	 * @throws Exception
	 */
	public int deleteCompanyBankAccount(Integer accountid);
	/**增加add
	 * @param CompanyBankAccount
	 * @throws Exception
	 */
   
	public int addCompanyBankAccount(CompanyBankAccount record);

	/**修改 edit
	 * @param CompanyBankAccount
	 * @throws Exception
	 */
	public int editCompanyBankAccount(CompanyBankAccount record);
	/**查看所有viewlist all
	 * @param CompanyBankAccount
	 * @throws Exception
	 */
    public List<CompanyBankAccount> viewList(CompanyBankAccount record);
}