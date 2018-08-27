package com.violin.dao.mapping.useraccount;

import com.violin.model.useraccount.UserAccount;

import java.util.List;
import java.util.Map;

public interface UserAccountMapper {

	public void insertUserAccount(UserAccount userAccount);

	public void deleteUserAccountById(String userAccountId);

	public int deleteUserAccountAll();

	public void updateUserAccount(UserAccount userAccount);

	public UserAccount findUserAccountById(String userAccountId);

	public List<UserAccount> findUserAccountList();

	public int deleteUserAccountList(List<UserAccount> userAccounts);

	public int deleteUserAccountListByIds(String[] Ids);

	public int insertUserAccountList(List<UserAccount> userAccounts);

	public void updateUserAccountList(List<UserAccount> userAccounts);

	public List<UserAccount> findUserAccountQuery(Map map);

	public List<UserAccount> findUserAccountQueryPage(Map map);

	public int findCountUserAccountQuery(Map map);

}
