package com.violin.dao.mapping.dictdata;

import com.violin.model.dictdata.DictData;

import java.util.List;
import java.util.Map;

public interface DictDataMapper {

	void insertDictData(DictData dictData);

	void deleteDictDataById(String dictDataId);

	int deleteDictDataAll();

	void updateDictData(DictData dictData);

	DictData findDictDataById(String dictDataId);

	List<DictData> findDictDataList();

	int deleteDictDataList(List<DictData> dictDatas);

	int deleteDictDataListByIds(String[] Ids);

	int insertDictDataList(List<DictData> dictDatas);

	void updateDictDataList(List<DictData> dictDatas);

	List<DictData> findDictDataQuery(Map map);

	List<DictData> findDictDataQueryPage(Map map);

	int findCountDictDataQuery(Map map);

}
