package com.violin.dao.mapping.files;


import com.violin.model.files.Files;

import java.util.List;
import java.util.Map;

public interface FilesMapper {

	void insertFiles(Files files);

	void deleteFilesById(String filesId);

	int deleteFilesAll();

	void updateFiles(Files files);

	Files findFilesById(String filesId);

	List<Files> findFilesList();

	int deleteFilesList(List<Files> filess);

	int deleteFilesListByIds(String[] Ids);

	int insertFilesList(List<Files> filess);

	void updateFilesList(List<Files> filess);

	List<Files> findFilesQuery(Map map);

	List<Files> findFilesQueryPage(Map map);

	int findCountFilesQuery(Map map);

}
