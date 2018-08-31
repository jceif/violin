package com.violin.impl.files;

import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.files.FilesMapper;
import com.violin.model.files.Files;
import com.violin.service.files.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("filesService")
public class FilesServiceImpl implements FilesService {

	@Autowired
	private FilesMapper filesMapper;

	@Override
	public void insertFiles(Files files)	{
		this.filesMapper.insertFiles(files);
	}

	@Override
	public void deleteFilesById(String filesId)	{
		this.filesMapper.deleteFilesById(filesId);
	}

	@Override
	public int deleteFilesAll()	{
		return this.filesMapper.deleteFilesAll();
	}

	@Override
	public void updateFiles(Files files)	{
		this.filesMapper.updateFiles(files);
	}

	@Override
	public Files findFilesById(String filesId)	{
		return this.filesMapper.findFilesById(filesId);
	}

	@Override
	public List<Files> findFilesList()	{
		return this.filesMapper.findFilesList();
	}

	@Override
	public int deleteFilesListByIds(String[] Ids)	{
		return this.filesMapper.deleteFilesListByIds(Ids);
	}

	@Override
	public int deleteFilesList(List<Files> filess)	{
		return this.filesMapper.deleteFilesList(filess);
	}

	@Override
	public void insertFilesList(List<Files> filess)	{
		 this.filesMapper.insertFilesList(filess);
	}

	@Override
	public void updateFilesList(List<Files> filess)	{
		 this.filesMapper.updateFilesList(filess);
	}

	@Override
	public List<Files> findFilesQuery(Map map)	{
		return this.filesMapper.findFilesQuery(map);
	}

	@Override
	public PageUtil<Files> findFilesQueryPage(Map map, String pageNo, String pageSize)	{
		int totalCount = filesMapper.findCountFilesQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<Files>filesList = this.filesMapper.findFilesQueryPage(map);
				pageUtil.setRecords(filesList);
		}
		return pageUtil;
	}

	@Override
	public int findCountFilesQuery(Map map)	{
		return this.filesMapper.findCountFilesQuery(map);
	}

}
