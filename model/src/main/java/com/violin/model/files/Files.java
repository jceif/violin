package com.violin.model.files;

import java.io.Serializable;
import java.util.Date;


public class Files implements Serializable {
    private int id; // 主键

    private String fileName; // 文件名称

    private String fileTempPath; // 临时文件地址

    private String filePath; // 文件地址

    private String moduleName; // 模块名称

    private String entityName; // 实体名称 用户头像，琴....

    private String entityNameProperty; // 属性名称(头像，身份证......）

    private int entityId; // 引用对象id

    private String contentType; // 文件类型  图片 word...

    private float size; // 文件大小

    private int type; // 文件类型 临时文件0  永久文件1

    private Date createTime; // 创建时间


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileTempPath() {
        return this.fileTempPath;
    }

    public void setFileTempPath(String fileTempPath) {
        this.fileTempPath = fileTempPath;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityNameProperty() {
        return this.entityNameProperty;
    }

    public void setEntityNameProperty(String entityNameProperty) {
        this.entityNameProperty = entityNameProperty;
    }

    public int getEntityId() {
        return this.entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public float getSize() {
        return this.size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
