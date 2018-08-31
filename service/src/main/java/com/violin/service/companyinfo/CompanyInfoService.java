package com.violin.service.companyinfo;



import com.violin.common.page.PageUtil;
import com.violin.model.companyinfo.CompanyInfo;

import java.util.List;
import java.util.Map;

public interface CompanyInfoService {

	public void insertCompanyInfo(CompanyInfo companyInfo);

	public void deleteCompanyInfoById(String companyInfoId);

	public int deleteCompanyInfoAll();

	public void updateCompanyInfo(CompanyInfo companyInfo);

	public CompanyInfo findCompanyInfoById(String companyInfoId);

	public List<CompanyInfo> findCompanyInfoList();

	public int deleteCompanyInfoListByIds(String[] Ids);

	public int deleteCompanyInfoList(List<CompanyInfo> companyInfos);

	public void insertCompanyInfoList(List<CompanyInfo> companyInfos);

	public void updateCompanyInfoList(List<CompanyInfo> companyInfos);

	public List<CompanyInfo> findCompanyInfoQuery(Map map);

	public PageUtil<CompanyInfo> findCompanyInfoQueryPage(Map map, String pageNo, String pageSize);

	public int findCountCompanyInfoQuery(Map map);

}
