package com.violin.impl.companyinfo;

import java.util.Map;
import java.util.List;

import com.violin.common.page.PageUtil;

import com.violin.model.companyinfo.CompanyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.violin.service.companyinfo.CompanyInfoService;

@Service("companyInfoService")
public class CompanyInfoServiceImpl implements CompanyInfoService {

	@Autowired
	private com.violin.dao.mapping.companyinfo.CompanyInfoMapper companyInfoMapper;

	@Override
	public void insertCompanyInfo(CompanyInfo companyInfo)	{
		this.companyInfoMapper.insertCompanyInfo(companyInfo);
	}

	@Override
	public void deleteCompanyInfoById(String companyInfoId)	{
		this.companyInfoMapper.deleteCompanyInfoById(companyInfoId);
	}

	@Override
	public int deleteCompanyInfoAll()	{
		return this.companyInfoMapper.deleteCompanyInfoAll();
	}

	@Override
	public void updateCompanyInfo(CompanyInfo companyInfo)	{
		this.companyInfoMapper.updateCompanyInfo(companyInfo);
	}

	@Override
	public CompanyInfo findCompanyInfoById(String companyInfoId)	{
		return this.companyInfoMapper.findCompanyInfoById(companyInfoId);
	}

	@Override
	public List<CompanyInfo> findCompanyInfoList()	{
		return this.companyInfoMapper.findCompanyInfoList();
	}

	@Override
	public int deleteCompanyInfoListByIds(String[] Ids)	{
		return this.companyInfoMapper.deleteCompanyInfoListByIds(Ids);
	}

	@Override
	public int deleteCompanyInfoList(List<CompanyInfo> companyInfos)	{
		return this.companyInfoMapper.deleteCompanyInfoList(companyInfos);
	}

	@Override
	public void insertCompanyInfoList(List<CompanyInfo> companyInfos)	{
		 this.companyInfoMapper.insertCompanyInfoList(companyInfos);
	}

	@Override
	public void updateCompanyInfoList(List<CompanyInfo> companyInfos)	{
		 this.companyInfoMapper.updateCompanyInfoList(companyInfos);
	}

	@Override
	public List<CompanyInfo> findCompanyInfoQuery(Map map)	{
		return this.companyInfoMapper.findCompanyInfoQuery(map);
	}

	@Override
	public PageUtil<CompanyInfo> findCompanyInfoQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = companyInfoMapper.findCountCompanyInfoQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<CompanyInfo>companyInfoList = this.companyInfoMapper.findCompanyInfoQueryPage(map);
				pageUtil.setRecords(companyInfoList);
		}
		return pageUtil;
	}

	@Override
	public int findCountCompanyInfoQuery(Map map)	{
		return this.companyInfoMapper.findCountCompanyInfoQuery(map);
	}

}
