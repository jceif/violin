package com.violin.model.dictdata;

import java.util.Date;
import java.io.Serializable;


public class DictData implements Serializable {
    private int id; //

    private String dictCode; // 字典代码

    private String dictName; // 对应的 类型名称，木制材料，琴弦材料

    private String dictValue; // 数值

    private int dictSoft; // 排序

    private Date createTime; //


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDictCode() {
        return this.dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return this.dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictValue() {
        return this.dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public int getDictSoft() {
        return this.dictSoft;
    }

    public void setDictSoft(int dictSoft) {
        this.dictSoft = dictSoft;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
