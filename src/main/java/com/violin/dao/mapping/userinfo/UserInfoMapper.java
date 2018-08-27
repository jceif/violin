package com.violin.dao.mapping.userinfo;

import com.violin.model.userinfo.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper {

	public void insertUserInfo(UserInfo userInfo);

	public void deleteUserInfoById(String userInfoId);

	public int deleteUserInfoAll();

	public void updateUserInfo(UserInfo userInfo);

	public UserInfo findUserInfoById(String userInfoId);

	public List<UserInfo> findUserInfoList();

	public int deleteUserInfoList(List<UserInfo> userInfos);

	public int deleteUserInfoListByIds(String[] Ids);

	public int insertUserInfoList(List<UserInfo> userInfos);

	public void updateUserInfoList(List<UserInfo> userInfos);

	public List<UserInfo> findUserInfoQuery(Map map);

	public List<UserInfo> findUserInfoQueryPage(Map map);

	public int findCountUserInfoQuery(Map map);

}
