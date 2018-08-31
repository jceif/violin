package com.violin.service.violininfo;

import com.violin.common.page.PageUtil;
import com.violin.model.violininfo.ViolinInfo;

import java.util.List;
import java.util.Map;

public interface ViolinInfoService {

	public void insertViolinInfo(ViolinInfo violinInfo);

	public void deleteViolinInfoById(String violinInfoId);

	public int deleteViolinInfoAll();

	public void updateViolinInfo(ViolinInfo violinInfo);

	public ViolinInfo findViolinInfoById(String violinInfoId);

	public List<ViolinInfo> findViolinInfoList();

	public int deleteViolinInfoListByIds(String[] Ids);

	public int deleteViolinInfoList(List<ViolinInfo> violinInfos);

	public void insertViolinInfoList(List<ViolinInfo> violinInfos);

	public void updateViolinInfoList(List<ViolinInfo> violinInfos);

	public List<ViolinInfo> findViolinInfoQuery(Map map);

	public PageUtil<ViolinInfo> findViolinInfoQueryPage(Map map, String pageNo, String pageSize);

	public int findCountViolinInfoQuery(Map map);

}
