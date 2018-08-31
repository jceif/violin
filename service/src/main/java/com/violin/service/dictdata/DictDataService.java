package com.violin.service.dictdata;

import com.violin.common.page.PageUtil;
import com.violin.model.dictdata.DictData;

import java.util.List;
import java.util.Map;

public interface DictDataService {

	public void insertDictData(DictData dictData);

	public void deleteDictDataById(String dictDataId);

	public int deleteDictDataAll();

	public void updateDictData(DictData dictData);

	public DictData findDictDataById(String dictDataId);

	public List<DictData> findDictDataList();

	public int deleteDictDataListByIds(String[] Ids);

	public int deleteDictDataList(List<DictData> dictDatas);

	public void insertDictDataList(List<DictData> dictDatas);

	public void updateDictDataList(List<DictData> dictDatas);

	public List<DictData> findDictDataQuery(Map map);

	public PageUtil<DictData> findDictDataQueryPage(Map map, String pageNo, String pageSize);

	public int findCountDictDataQuery(Map map);

}
