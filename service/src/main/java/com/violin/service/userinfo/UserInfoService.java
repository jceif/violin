package com.violin.service.userinfo;

import com.violin.common.page.PageUtil;
import com.violin.model.userinfo.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoService {

	public void insertUserInfo(UserInfo userInfo);

	public void deleteUserInfoById(String userInfoId);

	public int deleteUserInfoAll();

	public void updateUserInfo(UserInfo userInfo);

	public UserInfo findUserInfoById(String userInfoId);

	public List<UserInfo> findUserInfoList();

	public int deleteUserInfoListByIds(String[] Ids);

	public int deleteUserInfoList(List<UserInfo> userInfos);

	public void insertUserInfoList(List<UserInfo> userInfos);

	public void updateUserInfoList(List<UserInfo> userInfos);

	public List<UserInfo> findUserInfoQuery(Map map);

	public PageUtil<UserInfo> findUserInfoQueryPage(Map map, String pageNo, String pageSize);

	public int findCountUserInfoQuery(Map map);

}
