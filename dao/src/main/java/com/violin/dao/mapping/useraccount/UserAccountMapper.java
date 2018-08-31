package com.violin.dao.mapping.useraccount;


import com.violin.model.useraccount.UserAccount;

import java.util.List;
import java.util.Map;

public interface UserAccountMapper {

	void insertUserAccount(UserAccount userAccount);

	void deleteUserAccountById(String userAccountId);

	int deleteUserAccountAll();

	void updateUserAccount(UserAccount userAccount);

	UserAccount findUserAccountById(String userAccountId);

	List<UserAccount> findUserAccountList();

	int deleteUserAccountList(List<UserAccount> userAccounts);

	int deleteUserAccountListByIds(String[] Ids);

	int insertUserAccountList(List<UserAccount> userAccounts);

	void updateUserAccountList(List<UserAccount> userAccounts);

	List<UserAccount> findUserAccountQuery(Map map);

	List<UserAccount> findUserAccountQueryPage(Map map);

	int findCountUserAccountQuery(Map map);

}
