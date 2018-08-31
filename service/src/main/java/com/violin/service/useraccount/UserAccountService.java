package com.violin.service.useraccount;

import com.violin.common.page.PageUtil;
import com.violin.model.useraccount.UserAccount;

import java.util.List;
import java.util.Map;

public interface UserAccountService {

	public void insertUserAccount(UserAccount userAccount);

	public void deleteUserAccountById(String userAccountId);

	public int deleteUserAccountAll();

	public void updateUserAccount(UserAccount userAccount);

	public UserAccount findUserAccountById(String userAccountId);

	public List<UserAccount> findUserAccountList();

	public int deleteUserAccountListByIds(String[] Ids);

	public int deleteUserAccountList(List<UserAccount> userAccounts);

	public void insertUserAccountList(List<UserAccount> userAccounts);

	public void updateUserAccountList(List<UserAccount> userAccounts);

	public List<UserAccount> findUserAccountQuery(Map map);

	public PageUtil<UserAccount> findUserAccountQueryPage(Map map, String pageNo, String pageSize);

	public int findCountUserAccountQuery(Map map);

}
