package cn.myviolin.controller.country;

import cn.myviolin.common.redis.IRedisService;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by jc on 2018/3/8 17:30
 * description ${请描述一下吧}
 */
public class MyRunnable implements  Runnable {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private IRedisService iRedisService;
    public MyRunnable(IRedisService iRedisService){
        this.iRedisService=iRedisService;
    }
    public void run() {
        for (int i = 0; i <100000; i++) {
            iRedisService.put("mysql-key-"+i,simpleDateFormat.format(Calendar.getInstance().getTime()));
        }
    }
}
