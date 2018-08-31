package com.violin.dao.mapping.violininfo;

import com.violin.model.violininfo.ViolinInfo;

import java.util.List;
import java.util.Map;

public interface ViolinInfoMapper {

	void insertViolinInfo(ViolinInfo violinInfo);

	void deleteViolinInfoById(String violinInfoId);

	int deleteViolinInfoAll();

	void updateViolinInfo(ViolinInfo violinInfo);

	ViolinInfo findViolinInfoById(String violinInfoId);

	List<ViolinInfo> findViolinInfoList();

	int deleteViolinInfoList(List<ViolinInfo> violinInfos);

	int deleteViolinInfoListByIds(String[] Ids);

	int insertViolinInfoList(List<ViolinInfo> violinInfos);

	void updateViolinInfoList(List<ViolinInfo> violinInfos);

	List<ViolinInfo> findViolinInfoQuery(Map map);

	List<ViolinInfo> findViolinInfoQueryPage(Map map);

	int findCountViolinInfoQuery(Map map);

}
