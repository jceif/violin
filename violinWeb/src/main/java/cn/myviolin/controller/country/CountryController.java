package cn.myviolin.controller.country;


import cn.myviolin.model.country.Country;
import cn.myviolin.service.country.CountryService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jc on 2018/2/2 13:25
 * description ${请描述一下吧}
 */
@Controller
@RequestMapping("/country")
public class CountryController {

    @Autowired
    @Qualifier("countryImpl")
    private CountryService countryService;

    private String page_list = "country/index";
    private String redirect_list = "redirect:list";

    @RequestMapping("/index")
    public ModelAndView index(Country country,
                        @RequestParam(required = false, defaultValue = "1") int page,
                        @RequestParam(required = false, defaultValue = "10") int rows){
        ModelAndView result = new ModelAndView(page_list);
        List<Country> countryList = countryService.selectByCountry(country, page, rows);
        result.addObject("pageInfo", new PageInfo<Country>(countryList));
        result.addObject("queryParam", country);
        result.addObject("page", page);
        result.addObject("rows", rows);
        return result;
    }
}
