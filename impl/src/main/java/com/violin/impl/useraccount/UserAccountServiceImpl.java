package com.violin.impl.useraccount;

import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.useraccount.UserAccountMapper;
import com.violin.model.useraccount.UserAccount;
import com.violin.service.useraccount.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountMapper userAccountMapper;

	@Override
	public void insertUserAccount(UserAccount userAccount)	{
		this.userAccountMapper.insertUserAccount(userAccount);
	}

	@Override
	public void deleteUserAccountById(String userAccountId)	{
		this.userAccountMapper.deleteUserAccountById(userAccountId);
	}

	@Override
	public int deleteUserAccountAll()	{
		return this.userAccountMapper.deleteUserAccountAll();
	}

	@Override
	public void updateUserAccount(UserAccount userAccount)	{
		this.userAccountMapper.updateUserAccount(userAccount);
	}

	@Override
	public UserAccount findUserAccountById(String userAccountId)	{
		return this.userAccountMapper.findUserAccountById(userAccountId);
	}

	@Override
	public List<UserAccount> findUserAccountList()	{
		return this.userAccountMapper.findUserAccountList();
	}

	@Override
	public int deleteUserAccountListByIds(String[] Ids)	{
		return this.userAccountMapper.deleteUserAccountListByIds(Ids);
	}

	@Override
	public int deleteUserAccountList(List<UserAccount> userAccounts)	{
		return this.userAccountMapper.deleteUserAccountList(userAccounts);
	}

	@Override
	public void insertUserAccountList(List<UserAccount> userAccounts)	{
		 this.userAccountMapper.insertUserAccountList(userAccounts);
	}

	@Override
	public void updateUserAccountList(List<UserAccount> userAccounts)	{
		 this.userAccountMapper.updateUserAccountList(userAccounts);
	}

	@Override
	public List<UserAccount> findUserAccountQuery(Map map)	{
		return this.userAccountMapper.findUserAccountQuery(map);
	}

	@Override
	public PageUtil<UserAccount> findUserAccountQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = userAccountMapper.findCountUserAccountQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<UserAccount>userAccountList = this.userAccountMapper.findUserAccountQueryPage(map);
				pageUtil.setRecords(userAccountList);
		}
		return pageUtil;
	}

	@Override
	public int findCountUserAccountQuery(Map map)	{
		return this.userAccountMapper.findCountUserAccountQuery(map);
	}

}
