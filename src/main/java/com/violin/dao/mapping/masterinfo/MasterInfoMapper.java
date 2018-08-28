package com.violin.dao.mapping.masterinfo;

import com.violin.model.masterinfo.MasterInfo;

import java.util.List;
import java.util.Map;

public interface MasterInfoMapper {

	void insertMasterInfo(MasterInfo masterInfo);

	void deleteMasterInfoById(String masterInfoId);

	int deleteMasterInfoAll();

	void updateMasterInfo(MasterInfo masterInfo);

	MasterInfo findMasterInfoById(String masterInfoId);

	List<MasterInfo> findMasterInfoList();

	int deleteMasterInfoList(List<MasterInfo> masterInfos);

	int deleteMasterInfoListByIds(String[] Ids);

	int insertMasterInfoList(List<MasterInfo> masterInfos);

	void updateMasterInfoList(List<MasterInfo> masterInfos);

	List<MasterInfo> findMasterInfoQuery(Map map);

	List<MasterInfo> findMasterInfoQueryPage(Map map);

	int findCountMasterInfoQuery(Map map);

}
