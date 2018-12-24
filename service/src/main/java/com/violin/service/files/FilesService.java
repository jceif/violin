package com.violin.service.files;

import com.violin.model.files.Files;

import java.util.List;
import java.util.Map;

public interface FilesService {


	Files findFilesById(Integer id);

	List<Files> findFilesQuery(Map map);


	/**
	 * 保存文件到临时目录
	 *
	 * @return
	 */
	Files upload(Files files, byte [] bytes);


	/**
	 * 获得file文件流
	 *
	 * @param filePath
	 * @param  fileName
	 * @return
	 */
	byte[] getFile(String filePath,String fileName);


	/**
	 *  获得file文件流
	 *
	 * @param fileId
	 * @return
	 */
	byte[] getFile(int fileId);

	/**
	 *  获得file文件流
	 *
	 * @param files
	 * @return
	 */
	byte[] getFile(Files files);


	/**
	 * 删除文件
	 *
	 * @param filePath
	 * @param fileName
	 * @return
	 */
	Boolean deleteFiles(String filePath,String fileName);

	/**
	 * 删除文件
	 *
	 * @param id
	 * @return
	 */
	Boolean deleteFiles(Integer id);


	/**
	 * 删除文件
	 *
	 * @param files
	 * @return
	 */
	Boolean deleteFiles(Files files);


	/**
	 * 临时文件转存永久文件
	 *
	 * @param id
	 * @return
	 */
	Boolean toPermanent(Integer id);

	/**
	 * 临时文件转存永久文件
	 *
	 * @param filesList
	 * @return
	 */
	Boolean toPermanent(List<Files> filesList);

	/**
	 * 临时文件转存永久文件
	 *
	 * @param files
	 * @return
	 */
	Boolean toPermanent(Files files);

	/**
	 * Created by jc on 2018/3/21 13:43
	 * description 根据路径转存为永久文件
	 */
	Boolean toPermanentByPath(String filePath, String fileName);

}
