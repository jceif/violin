package com.violin.impl.violininfo;

import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.violininfo.ViolinInfoMapper;
import com.violin.model.violininfo.ViolinInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.violin.service.violininfo.ViolinInfoService;

import java.util.List;
import java.util.Map;
@Service("violinInfoService")
public class ViolinInfoServiceImpl implements ViolinInfoService {

	@Autowired
	private ViolinInfoMapper violinInfoMapper;

	@Override
	public void insertViolinInfo(ViolinInfo violinInfo)	{
		this.violinInfoMapper.insertViolinInfo(violinInfo);
	}

	@Override
	public void deleteViolinInfoById(String violinInfoId)	{
		this.violinInfoMapper.deleteViolinInfoById(violinInfoId);
	}

	@Override
	public int deleteViolinInfoAll()	{
		return this.violinInfoMapper.deleteViolinInfoAll();
	}

	@Override
	public void updateViolinInfo(ViolinInfo violinInfo)	{
		this.violinInfoMapper.updateViolinInfo(violinInfo);
	}

	@Override
	public ViolinInfo findViolinInfoById(String violinInfoId)	{
		return this.violinInfoMapper.findViolinInfoById(violinInfoId);
	}

	@Override
	public List<ViolinInfo> findViolinInfoList()	{
		return this.violinInfoMapper.findViolinInfoList();
	}

	@Override
	public int deleteViolinInfoListByIds(String[] Ids)	{
		return this.violinInfoMapper.deleteViolinInfoListByIds(Ids);
	}

	@Override
	public int deleteViolinInfoList(List<ViolinInfo> violinInfos)	{
		return this.violinInfoMapper.deleteViolinInfoList(violinInfos);
	}

	@Override
	public void insertViolinInfoList(List<ViolinInfo> violinInfos)	{
		 this.violinInfoMapper.insertViolinInfoList(violinInfos);
	}

	@Override
	public void updateViolinInfoList(List<ViolinInfo> violinInfos)	{
		 this.violinInfoMapper.updateViolinInfoList(violinInfos);
	}

	@Override
	public List<ViolinInfo> findViolinInfoQuery(Map map)	{
		return this.violinInfoMapper.findViolinInfoQuery(map);
	}

	@Override
	public PageUtil<ViolinInfo> findViolinInfoQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = violinInfoMapper.findCountViolinInfoQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<ViolinInfo>violinInfoList = this.violinInfoMapper.findViolinInfoQueryPage(map);
				pageUtil.setRecords(violinInfoList);
		}
		return pageUtil;
	}

	@Override
	public int findCountViolinInfoQuery(Map map)	{
		return this.violinInfoMapper.findCountViolinInfoQuery(map);
	}

}
