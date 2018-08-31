package com.violin.impl.userinfo;


import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.userinfo.UserInfoMapper;
import com.violin.model.userinfo.UserInfo;
import com.violin.service.userinfo.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public void insertUserInfo(UserInfo userInfo)	{
		this.userInfoMapper.insertUserInfo(userInfo);
	}

	@Override
	public void deleteUserInfoById(String userInfoId)	{
		this.userInfoMapper.deleteUserInfoById(userInfoId);
	}

	@Override
	public int deleteUserInfoAll()	{
		return this.userInfoMapper.deleteUserInfoAll();
	}

	@Override
	public void updateUserInfo(UserInfo userInfo)	{
		this.userInfoMapper.updateUserInfo(userInfo);
	}

	@Override
	public UserInfo findUserInfoById(String userInfoId)	{
		return this.userInfoMapper.findUserInfoById(userInfoId);
	}

	@Override
	public List<UserInfo> findUserInfoList()	{
		return this.userInfoMapper.findUserInfoList();
	}

	@Override
	public int deleteUserInfoListByIds(String[] Ids)	{
		return this.userInfoMapper.deleteUserInfoListByIds(Ids);
	}

	@Override
	public int deleteUserInfoList(List<UserInfo> userInfos)	{
		return this.userInfoMapper.deleteUserInfoList(userInfos);
	}

	@Override
	public void insertUserInfoList(List<UserInfo> userInfos)	{
		 this.userInfoMapper.insertUserInfoList(userInfos);
	}

	@Override
	public void updateUserInfoList(List<UserInfo> userInfos)	{
		 this.userInfoMapper.updateUserInfoList(userInfos);
	}

	@Override
	public List<UserInfo> findUserInfoQuery(Map map)	{
		return this.userInfoMapper.findUserInfoQuery(map);
	}

	@Override
	public PageUtil<UserInfo> findUserInfoQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = userInfoMapper.findCountUserInfoQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<UserInfo>userInfoList = this.userInfoMapper.findUserInfoQueryPage(map);
				pageUtil.setRecords(userInfoList);
		}
		return pageUtil;
	}

	@Override
	public int findCountUserInfoQuery(Map map)	{
		return this.userInfoMapper.findCountUserInfoQuery(map);
	}

}
