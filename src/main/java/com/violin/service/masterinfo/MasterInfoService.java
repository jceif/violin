package com.violin.service.masterinfo;

import com.violin.common.page.PageUtil;
import com.violin.model.masterinfo.MasterInfo;

import java.util.List;
import java.util.Map;

public interface MasterInfoService {

	public void insertMasterInfo(MasterInfo masterInfo);

	public void deleteMasterInfoById(String masterInfoId);

	public int deleteMasterInfoAll();

	public void updateMasterInfo(MasterInfo masterInfo);

	public MasterInfo findMasterInfoById(String masterInfoId);

	public List<MasterInfo> findMasterInfoList();

	public int deleteMasterInfoListByIds(String[] Ids);

	public int deleteMasterInfoList(List<MasterInfo> masterInfos);

	public void insertMasterInfoList(List<MasterInfo> masterInfos);

	public void updateMasterInfoList(List<MasterInfo> masterInfos);

	public List<MasterInfo> findMasterInfoQuery(Map map);

	public PageUtil<MasterInfo> findMasterInfoQueryPage(Map map, String pageNo, String pageSize);

	public int findCountMasterInfoQuery(Map map);

}
