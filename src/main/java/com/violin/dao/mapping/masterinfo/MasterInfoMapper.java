package com.violin.dao.mapping.masterinfo;

import com.violin.model.masterinfo.MasterInfo;

import java.util.List;
import java.util.Map;

public interface MasterInfoMapper {

	public void insertMasterInfo(MasterInfo masterInfo);

	public void deleteMasterInfoById(String masterInfoId);

	public int deleteMasterInfoAll();

	public void updateMasterInfo(MasterInfo masterInfo);

	public MasterInfo findMasterInfoById(String masterInfoId);

	public List<MasterInfo> findMasterInfoList();

	public int deleteMasterInfoList(List<MasterInfo> masterInfos);

	public int deleteMasterInfoListByIds(String[] Ids);

	public int insertMasterInfoList(List<MasterInfo> masterInfos);

	public void updateMasterInfoList(List<MasterInfo> masterInfos);

	public List<MasterInfo> findMasterInfoQuery(Map map);

	public List<MasterInfo> findMasterInfoQueryPage(Map map);

	public int findCountMasterInfoQuery(Map map);

}
