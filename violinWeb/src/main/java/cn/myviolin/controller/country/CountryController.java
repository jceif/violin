package cn.myviolin.controller.country;


import cn.myviolin.common.redis.IRedisService;
import cn.myviolin.model.country.Country;
import cn.myviolin.service.country.CountryService;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private CountryService countryService;

    @Autowired
    private IRedisService redisService;

    Logger logger=Logger.getLogger(CountryController.class);

    private String page_list = "country/index";
    private String redirect_list = "redirect:list";



    @RequestMapping("/list")
    public ModelAndView index(Country country,
                        @RequestParam(required = false, defaultValue = "1") int page,
                        @RequestParam(required = false, defaultValue = "10") int rows){
        ModelAndView result = new ModelAndView(page_list);

        List<Country> countryList = countryService.selectByCountry(country, page, rows);
        result.addObject("pageInfo", new PageInfo<Country>(countryList));
        result.addObject("queryParam", country);
        result.addObject("page", page);
        result.addObject("rows", rows);
        result.addObject("controllerName", "country");
        result.addObject("searchPar", "country");


        Runnable thread=new MyRunnable(redisService);
        thread.run();

        return result;
    }

    @RequestMapping(value = "view", method = RequestMethod.GET)
    public ModelAndView view(Country country) {
        ModelAndView result = new ModelAndView("country/view");
        if (country.getId() != null) {
            country = countryService.selectByKey(country.getId());
        }
        result.addObject("controllerName", "country");
        result.addObject("country", country);
        return result;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ModelAndView save(Country country) {
        ModelAndView result = new ModelAndView(redirect_list);
        if (country.getId() != null) {
            countryService.updateAll(country);
        } else {
            countryService.save(country);
        }
        return result;
    }

    @RequestMapping("delete")
    public String delete(Integer id) {
        countryService.delete(id);
        return redirect_list;
    }


}
