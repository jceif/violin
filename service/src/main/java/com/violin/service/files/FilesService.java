package com.violin.service.files;

import com.violin.common.page.PageUtil;
import com.violin.model.files.Files;

import java.util.List;
import java.util.Map;

public interface FilesService {

	public void insertFiles(Files files);

	public void deleteFilesById(String filesId);

	public int deleteFilesAll();

	public void updateFiles(Files files);

	public Files findFilesById(String filesId);

	public List<Files> findFilesList();

	public int deleteFilesListByIds(String[] Ids);

	public int deleteFilesList(List<Files> filess);

	public void insertFilesList(List<Files> filess);

	public void updateFilesList(List<Files> filess);

	public List<Files> findFilesQuery(Map map);

	public PageUtil<Files> findFilesQueryPage(Map map, String pageNo, String pageSize);

	public int findCountFilesQuery(Map map);

}
