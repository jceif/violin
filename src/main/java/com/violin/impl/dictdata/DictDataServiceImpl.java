package com.violin.impl.dictdata;

import java.util.Map;
import java.util.List;

import com.violin.common.page.PageUtil;

import com.violin.dao.mapping.dictdata.DictDataMapper;
import com.violin.model.dictdata.DictData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.violin.service.dictdata.DictDataService;

@Service("dictDataService")
public class DictDataServiceImpl implements DictDataService {

	@Autowired
	private DictDataMapper dictDataMapper;

	@Override
	public void insertDictData(DictData dictData)	{
		this.dictDataMapper.insertDictData(dictData);
	}

	@Override
	public void deleteDictDataById(String dictDataId)	{
		this.dictDataMapper.deleteDictDataById(dictDataId);
	}

	@Override
	public int deleteDictDataAll()	{
		return this.dictDataMapper.deleteDictDataAll();
	}

	@Override
	public void updateDictData(DictData dictData)	{
		this.dictDataMapper.updateDictData(dictData);
	}

	@Override
	public DictData findDictDataById(String dictDataId)	{
		return this.dictDataMapper.findDictDataById(dictDataId);
	}

	@Override
	public List<DictData> findDictDataList()	{
		return this.dictDataMapper.findDictDataList();
	}

	@Override
	public int deleteDictDataListByIds(String[] Ids)	{
		return this.dictDataMapper.deleteDictDataListByIds(Ids);
	}

	@Override
	public int deleteDictDataList(List<DictData> dictDatas)	{
		return this.dictDataMapper.deleteDictDataList(dictDatas);
	}

	@Override
	public void insertDictDataList(List<DictData> dictDatas)	{
		 this.dictDataMapper.insertDictDataList(dictDatas);
	}

	@Override
	public void updateDictDataList(List<DictData> dictDatas)	{
		 this.dictDataMapper.updateDictDataList(dictDatas);
	}

	@Override
	public List<DictData> findDictDataQuery(Map map)	{
		return this.dictDataMapper.findDictDataQuery(map);
	}

	@Override
	public PageUtil<DictData> findDictDataQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = dictDataMapper.findCountDictDataQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<DictData>dictDataList = this.dictDataMapper.findDictDataQueryPage(map);
				pageUtil.setRecords(dictDataList);
		}
		return pageUtil;
	}

	@Override
	public int findCountDictDataQuery(Map map)	{
		return this.dictDataMapper.findCountDictDataQuery(map);
	}

}
