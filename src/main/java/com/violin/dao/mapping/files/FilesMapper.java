package com.violin.dao.mapping.files;

import com.violin.model.files.Files;

import java.util.List;
import java.util.Map;

public interface FilesMapper {

	public void insertFiles(Files files);

	public void deleteFilesById(String filesId);

	public int deleteFilesAll();

	public void updateFiles(Files files);

	public Files findFilesById(String filesId);

	public List<Files> findFilesList();

	public int deleteFilesList(List<Files> filess);

	public int deleteFilesListByIds(String[] Ids);

	public int insertFilesList(List<Files> filess);

	public void updateFilesList(List<Files> filess);

	public List<Files> findFilesQuery(Map map);

	public List<Files> findFilesQueryPage(Map map);

	public int findCountFilesQuery(Map map);

}
