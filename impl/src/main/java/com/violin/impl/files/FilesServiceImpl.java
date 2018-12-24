package com.violin.impl.files;


import com.violin.dao.mapping.files.FilesMapper;
import com.violin.model.files.Files;
import com.violin.service.files.FilesService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


@Service("filesService")
public class FilesServiceImpl implements FilesService {

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final Logger log = LoggerFactory.getLogger(FilesServiceImpl.class);

	@Autowired
	private FilesMapper filesMapper;

	@Override
	public Files findFilesById(Integer id) {
		return filesMapper.findFilesById(id+"");
	}

	@Override
	public List<Files> findFilesQuery(Map map) {
		return filesMapper.findFilesQuery(map);
	}

	/**
	 * Created by jc on 2018/3/14 15:27
	 * description 上传图片到服务器
	 */
	@Override
	public Files upload(Files files, byte[]  bytes) {
		//临时文件地址 真实地址/temp/年月
		String fileTempPath = files.getFilePath() + "/temp/";
		//后缀名
		//String suffixName = files.getFileName().split(".")[files.getFileName().split(".").length - 1];
		String suffixName ="jpg";
		//新的文件名
		String fileName = simpleDateFormat.format(Calendar.getInstance().getTime())+ UUID.randomUUID().toString() + "." + suffixName;
		InputStream inputStream=new ByteArrayInputStream(bytes);
		Boolean result = saveFile(fileTempPath, fileName, inputStream);
		if (result) {
			//创建数据记录
			files.setFileName(fileName);
			files.setFileTempPath(fileTempPath);
			//默认设置临保存,临时保存7天，七天后清除数据和文件
			files.setType(0);
			files.setCreateTime(Calendar.getInstance().getTime());
			filesMapper.insertFiles(files);
			return files;
		}
		return files;
	}


///////////////////////////////////////////////////文件持久化  重载/////////////////////////////////////////////////////
	/**
	 * Created by jc on 2018/3/14 15:17
	 * description  持久化上传文件 (永久存储)
	 */
	@Override
	public Boolean toPermanent(Integer fileId) {
		log.info(this.getClass().getName() +"_"+(new Exception()).getStackTrace()[0].getMethodName()+ "_开始执行上传文件持久化任务............");
		Files files = filesMapper.findFilesById(fileId+"");
		return toPermanent(files);
	}

	/**
	 * Created by jc on 2018/3/14 16:07
	 * description 持久化上传文件
	 */
	@Override
	public Boolean toPermanent(List<Files> filesList) {
		log.info(this.getClass().getName() +"_"+(new Exception()).getStackTrace()[0].getMethodName()+ "_开始执行上传文件持久化任务............");
		if (filesList != null && filesList.size() > 0) {
			for (Files files : filesList) {
				toPermanent(files);
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Created by jc on 2018/3/14 16:07
	 * description 持久化上传文件
	 */
	@Override
	public Boolean toPermanent(Files files) {
		log.info(this.getClass().getName() +"_"+(new Exception()).getStackTrace()[0].getMethodName()+ "_开始执行上传文件持久化任务............");
		if (files != null && files.getId() > 0) {
			try {
				File file = new File(files.getFileTempPath());
				FileUtils.moveFileToDirectory(file, new File(files.getFilePath()), true);
				//设置状态为 永久存储
				files.setType(1);
				filesMapper.updateFiles(files);
				return true;
			} catch (IOException e) {
				log.error(this.getClass().getName() + "执行上传文件持久化任务_" + e.getMessage());
				return false;
			}
		} else {
			log.info(this.getClass().getName() + "_执行上传文件持久化任务 没有找到files id为" + files.getId() + "的对象............");
			return false;
		}
	}

	/**
	 * Created by jc on 2018/3/14 16:07
	 * description 持久化上传文件
	 */
	@Override
	public Boolean toPermanentByPath(String filePath, String fileName) {
		log.info(this.getClass().getName()+"_"+(new Exception()).getStackTrace()[0].getMethodName() + "_开始执行文件持久化任务............");
		if (!StringUtils.isEmpty(filePath+fileName)) {
			try {
				File file = new File(filePath+"/temp/"+fileName);
				FileUtils.moveFileToDirectory(file, new File(filePath+fileName), true);
				return true;
			} catch (IOException e) {
				log.error(this.getClass().getName() + "执行上传文件持久化任务_" + e.getMessage());
				return false;
			}
		} else {
			log.info(this.getClass().getName() + "_执行上传文件持久化任务 没有找到files 路径为" + filePath+filePath + "的对象............");
			return false;
		}
	}



////////////////////////////////////////////////文件持久化  重载/////////////////////////////////////////////////////












////////////////////////////////////////////////////获取文件流 重载/////////////////////////////////////////////////////
	/**
	 * Created by jc on 2018/3/14 16:18
	 * description 获取文件流
	 */
	@Override
	public byte[] getFile(String filePath, String fileName) {
		return getFileStream(filePath, fileName);
	}

	/**
	 * Created by jc on 2018/3/14 16:18
	 * description 获取文件流
	 */
	@Override
	public byte[] getFile(int fileId) {
		Files files = filesMapper.findFilesById(fileId+"");
		if (files != null && files.getId() > 0) {
			return getFileStream(files.getFilePath(), files.getFileName());
		} else {
			return null;
		}
	}

	/**
	 * Created by jc on 2018/3/14 16:18
	 * description 获取文件流
	 */
	@Override
	public byte[] getFile(Files files) {
		if (files != null && files.getId() > 0) {
			return getFileStream(files.getFilePath(), files.getFileName());
		} else {
			return null;
		}
	}
////////////////////////////////////////////////获取文件流 重载/////////////////////////////////////////////////////////








///////////////////////////////////////////////////删除已存在文件 重载//////////////////////////////////////////////////
	/**
	 * Created by jc on 2018/3/14 16:31
	 * description 删除存在的文件
	 */
	@Override
	public Boolean deleteFiles(String filePath, String fileName) {
		Boolean resultMsg = delFile(filePath, filePath);
		if (resultMsg) {
			Map<String, Object> mapSearchFiles = new HashMap<String, Object>();
			mapSearchFiles.put("fileName", fileName);
			mapSearchFiles.put("filePath", filePath);
			List<Files> filesList = filesMapper.findFilesQuery(mapSearchFiles);
			if (filesList != null && filesList.size() > 0) {
				for (Files files : filesList) {
					filesMapper.deleteFilesById(files.getId()+"");
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Created by jc on 2018/3/14 16:31
	 * description 删除存在的文件
	 */
	@Override
	public Boolean deleteFiles(Integer id) {
		Files files = filesMapper.findFilesById(id+"");
		if (files != null && files.getId() > 0) {
			Boolean resultMsg = delFile(files.getFilePath(), files.getFileName());
			if (resultMsg) {
				filesMapper.deleteFilesById(id+"");
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Created by jc on 2018/3/14 16:31
	 * description 删除存在的文件
	 */
	@Override
	public Boolean deleteFiles(Files files) {
		if (files != null && files.getId() > 0) {
			Boolean resultMsg = delFile(files.getFilePath(), files.getFileName());
			if (resultMsg) {
				filesMapper.deleteFilesById(files.getId()+"");
			}
			return true;
		} else {
			return false;
		}
	}
////////////////////////////////////////////////删除已存在文件 重载////////////////////////////////////////////////////


	/**
	 * Created by jc on 2018/3/14 15:08
	 * description 落地文件删除方法 删除临时文件和永久文件
	 */
	private Boolean delFile(String filePath, String fileName) {
		log.info(this.getClass().getName() + "_开始执行文件删除............");
		File file = new File(filePath + fileName);
		if (file.exists()) {
			log.info(this.getClass().getName() +"删除文件"+filePath+filePath);
			FileUtils.deleteQuietly(file);
		}
		file= new File(filePath +"/temp/"+ fileName);
		if (file.exists()) {
			log.info(this.getClass().getName() +"删除文件"+filePath+"/temp/"+filePath);
			FileUtils.deleteQuietly(file);
		}
		log.info(this.getClass().getName() + "_执行文件删除结束............");
		return true;
	}


	/**
	 * Created by jc on 2018/3/14 16:23
	 * description 文件清理 只清理临时文件
	 */
	private void clearTemporary() {
		log.info("开始执行上传文件清理任务.......");
		Map<String, Object> mapSearchFiles = new HashMap<String, Object>();
		mapSearchFiles.put("type", 0);
		mapSearchFiles.put("createTimeStart", "1970-01-01");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, -7);
		mapSearchFiles.put("createTimeEnd", calendar.getTime());//七天之前的文件
		List<Files> filesList = filesMapper.findFilesQuery(mapSearchFiles);
		if (filesList != null && filesList.size() > 0) {
			log.info("查找上传文件待清理个数：" + filesList.size());
			for (Files files : filesList) {
				boolean msgResult = delFile(files.getFileTempPath(), files.getFileName());
				if (msgResult) {
					filesMapper.deleteFilesById(files.getId()+"");
				}
			}
		} else {
			log.info("查找上传文件待清理个数：0");
		}
		log.info("执行上传文件清理任务结束.......");
	}


	/**
	 * Created by jc on 2018/3/14 15:08
	 * description 文件存储方法
	 */
	private Boolean saveFile(String filePath, String fileName, InputStream inputStream) {
		log.info(this.getClass().getName() + "_开始执行文件保存............");
		try {
			File dir = new File(filePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			//创建文件
			File tempFile = new File(filePath + "/" + fileName);
			//保存文件
			FileUtils.copyInputStreamToFile(inputStream, tempFile);
			return true;
		} catch (IOException e) {
			log.error(this.getClass().getName() + "执行文件保存_" + e.getMessage());
			return false;
		}
	}

	/**
	 * Created by jc on 2018/3/14 16:19
	 * description 根据地址得到文件流
	 */
	private byte[] getFileStream(String filePath, String fileName) {
		byte[] buffer = null;
		log.info(this.getClass().getName() + "_开始执行获取上传文件流............");
		File file = new File(filePath + fileName);
		if(!file.exists()){
			file = new File(filePath+"/temp/"+ fileName);
		}
		if (file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				byte[] b = new byte[1024];
				int n;
				while ((n = fileInputStream.read(b)) != -1)
				{
					bos.write(b, 0, n);
				}
				try {
					fileInputStream.close();
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				buffer = bos.toByteArray();
			} catch (FileNotFoundException e) {
				log.error(this.getClass().getName() + "执行获取上传文件流_" + e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				log.error(this.getClass().getName() + "执行获取上传文件流_" + e.getMessage());
			}
		} else {
			log.info(this.getClass().getName() + "_获取上传文件流 未找到 路径文件+" + filePath + "/" + fileName + "......");
		}
		return buffer;
	}
}
