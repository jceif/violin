package cn.myviolin.model.country;

import javax.persistence.*;

@Table(name = "country")
public class Country {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 国家名称
     */
    private String countryname;

    /**
     * 国家代码
     */
    private String countrycode;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家名称
     *
     * @return countryname - 国家名称
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * 设置国家名称
     *
     * @param countryname 国家名称
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    /**
     * 获取国家代码
     *
     * @return countrycode - 国家代码
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置国家代码
     *
     * @param countrycode 国家代码
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
}