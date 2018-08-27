package com.violin.impl.masterinfo;

import java.util.Map;
import java.util.List;

import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.masterinfo.MasterInfoMapper;
import com.violin.model.masterinfo.MasterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.violin.service.masterinfo.MasterInfoService;

@Service("masterInfoService")
public class MasterInfoServiceImpl implements MasterInfoService {

	@Autowired
	private MasterInfoMapper masterInfoMapper;

	@Override
	public void insertMasterInfo(MasterInfo masterInfo)	{
		this.masterInfoMapper.insertMasterInfo(masterInfo);
	}

	@Override
	public void deleteMasterInfoById(String masterInfoId)	{
		this.masterInfoMapper.deleteMasterInfoById(masterInfoId);
	}

	@Override
	public int deleteMasterInfoAll()	{
		return this.masterInfoMapper.deleteMasterInfoAll();
	}

	@Override
	public void updateMasterInfo(MasterInfo masterInfo)	{
		this.masterInfoMapper.updateMasterInfo(masterInfo);
	}

	@Override
	public MasterInfo findMasterInfoById(String masterInfoId)	{
		return this.masterInfoMapper.findMasterInfoById(masterInfoId);
	}

	@Override
	public List<MasterInfo> findMasterInfoList()	{
		return this.masterInfoMapper.findMasterInfoList();
	}

	@Override
	public int deleteMasterInfoListByIds(String[] Ids)	{
		return this.masterInfoMapper.deleteMasterInfoListByIds(Ids);
	}

	@Override
	public int deleteMasterInfoList(List<MasterInfo> masterInfos)	{
		return this.masterInfoMapper.deleteMasterInfoList(masterInfos);
	}

	@Override
	public void insertMasterInfoList(List<MasterInfo> masterInfos)	{
		 this.masterInfoMapper.insertMasterInfoList(masterInfos);
	}

	@Override
	public void updateMasterInfoList(List<MasterInfo> masterInfos)	{
		 this.masterInfoMapper.updateMasterInfoList(masterInfos);
	}

	@Override
	public List<MasterInfo> findMasterInfoQuery(Map map)	{
		return this.masterInfoMapper.findMasterInfoQuery(map);
	}

	@Override
	public PageUtil<MasterInfo> findMasterInfoQueryPage(Map map, String pageNo, String pageSize)	{
		int totalCount = masterInfoMapper.findCountMasterInfoQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<MasterInfo>masterInfoList = this.masterInfoMapper.findMasterInfoQueryPage(map);
				pageUtil.setRecords(masterInfoList);
		}
		return pageUtil;
	}

	@Override
	public int findCountMasterInfoQuery(Map map)	{
		return this.masterInfoMapper.findCountMasterInfoQuery(map);
	}

}
