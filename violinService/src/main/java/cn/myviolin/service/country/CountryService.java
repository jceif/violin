package cn.myviolin.service.country;

import cn.myviolin.model.country.Country;
import cn.myviolin.service.base.IBaseViolinService;

import java.util.List;
import java.util.Map;

/**
 * Created by jc on 2018/2/1 14:12
 * description ${请描述一下吧}
 */

public interface CountryService extends IBaseViolinService<Country> {
    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Country> selectByCountry(Country country, int page, int rows);

}
