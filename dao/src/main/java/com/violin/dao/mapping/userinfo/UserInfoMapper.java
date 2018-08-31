package com.violin.dao.mapping.userinfo;

import com.violin.model.userinfo.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper {

	void insertUserInfo(UserInfo userInfo);

	void deleteUserInfoById(String userInfoId);

	int deleteUserInfoAll();

	void updateUserInfo(UserInfo userInfo);

	UserInfo findUserInfoById(String userInfoId);

	List<UserInfo> findUserInfoList();

	int deleteUserInfoList(List<UserInfo> userInfos);

	int deleteUserInfoListByIds(String[] Ids);

	int insertUserInfoList(List<UserInfo> userInfos);

	void updateUserInfoList(List<UserInfo> userInfos);

	List<UserInfo> findUserInfoQuery(Map map);

	List<UserInfo> findUserInfoQueryPage(Map map);

	int findCountUserInfoQuery(Map map);

}
