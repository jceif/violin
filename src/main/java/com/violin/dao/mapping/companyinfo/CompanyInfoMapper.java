package com.violin.dao.mapping.companyinfo;

import com.violin.model.companyinfo.CompanyInfo;

import java.util.List;
import java.util.Map;

public interface CompanyInfoMapper {

    void insertCompanyInfo(CompanyInfo companyInfo);

    void deleteCompanyInfoById(String companyInfoId);

    int deleteCompanyInfoAll();

    void updateCompanyInfo(CompanyInfo companyInfo);

    CompanyInfo findCompanyInfoById(String companyInfoId);

    List<CompanyInfo> findCompanyInfoList();

    int deleteCompanyInfoList(List<CompanyInfo> companyInfos);

    int deleteCompanyInfoListByIds(String[] Ids);

    int insertCompanyInfoList(List<CompanyInfo> companyInfos);

    void updateCompanyInfoList(List<CompanyInfo> companyInfos);

    List<CompanyInfo> findCompanyInfoQuery(Map map);

    List<CompanyInfo> findCompanyInfoQueryPage(Map map);

    int findCountCompanyInfoQuery(Map map);

}
