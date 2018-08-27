package com.violin.dao.mapping.violininfo;

import com.violin.model.violininfo.ViolinInfo;

import java.util.List;
import java.util.Map;

public interface ViolinInfoMapper {

	public void insertViolinInfo(ViolinInfo violinInfo);

	public void deleteViolinInfoById(String violinInfoId);

	public int deleteViolinInfoAll();

	public void updateViolinInfo(ViolinInfo violinInfo);

	public ViolinInfo findViolinInfoById(String violinInfoId);

	public List<ViolinInfo> findViolinInfoList();

	public int deleteViolinInfoList(List<ViolinInfo> violinInfos);

	public int deleteViolinInfoListByIds(String[] Ids);

	public int insertViolinInfoList(List<ViolinInfo> violinInfos);

	public void updateViolinInfoList(List<ViolinInfo> violinInfos);

	public List<ViolinInfo> findViolinInfoQuery(Map map);

	public List<ViolinInfo> findViolinInfoQueryPage(Map map);

	public int findCountViolinInfoQuery(Map map);

}
